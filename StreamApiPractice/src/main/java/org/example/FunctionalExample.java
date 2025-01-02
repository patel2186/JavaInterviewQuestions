package org.example;

import java.util.stream.IntStream;

public class FunctionalExample {
    public void writeFunctionalExample(){
        PrimeCheck p = (x)->{
            for(int i=2;i<=x/2;i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
        };
        IntStream.range(2,100)
                .forEach(i->
                {
                   if(p.isPrime(i)){
                       System.out.print(i+" ");
                   }
                });
        System.out.println();
    }
}

@FunctionalInterface
interface PrimeCheck{
    boolean isPrime(int num);
}
