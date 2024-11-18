package com.kamban.kamban.config;

import com.kamban.kamban.controller.dto.LoginRequest;
import com.kamban.kamban.controller.dto.LoginResponse;
import com.kamban.kamban.model.Role;
import com.kamban.kamban.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.stream.Collectors;

@RestController
public class TokenController {
    private final JwtEncoder jwtEncoder;
    private final UsuarioRepository usuarioRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public TokenController(JwtEncoder jwtEncoder,
                           UsuarioRepository usuarioRepository, BCryptPasswordEncoder passwordEncoder) {
        this.jwtEncoder = jwtEncoder;
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        var user = usuarioRepository.findByUsername(loginRequest.username());
        if(user.isEmpty() || !user.get().isLoginCorrect(loginRequest, passwordEncoder)){
            throw new BadCredentialsException("user or password is invalid!");
        }
        var now = Instant.now();
        var expiresIn = 300L;
        var scopes = user.get().getRoles()
                .stream()
                .map(Role::getName)
                .collect(Collectors.joining(" "));

        var claims = JwtClaimsSet.builder()
                .issuer("mybackend")
                .subject(user.get().getUserId().toString())
                .issuedAt(now)
                .expiresAt(now.plusSeconds(expiresIn))
                .claim("scope", scopes)
                .build();
        var jwtValue = jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
        return ResponseEntity.ok(new LoginResponse(jwtValue, expiresIn));
    }
}
