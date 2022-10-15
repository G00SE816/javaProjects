package ej1;

class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        int x = 0;
        for(int i = n; i > 0; i--){
            if ((n % i)==0){
                System.out.println(i+" es divisor");
                x = x+i;
            }
        }
        return x;
    }
}