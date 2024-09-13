package org.example;

public class FizzBuzz implements apresentar {
    private int x;

    public FizzBuzz(int n) {
        x = n;
    }

    public void executar() {
        int p = 0;
        Buzz buzz = new Buzz();
        Fizz fizz = new Fizz();
        PT pt = new PT();
        for (int n = 1; n<=x; n++){
            if(n%3==0 && n%5==0){
                imprimir();
            }else if(n%5==0){
                buzz.imprimir();
            }else if(n%3==0){
                fizz.imprimir();
            }else if(n%13==0) {
                pt.imprimir();
                p=p+1;
            }else{
                System.out.println(n);
            }
        }
        System.out.println("foram apresentados "+p+" PTs");
    }

    @Override
    public void imprimir() {
        System.out.println("FizzBuzz");
    }
}