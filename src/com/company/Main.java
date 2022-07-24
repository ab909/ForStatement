package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("$10,000 at 2% interest = " + calculateInterest(10000, 2));

        for(int i=8;i>=2;i--){
         //   System.out.println("Loop " + i + " hello!");
            System.out.println("$10,000 at " + i + "% interest = " + calculateInterest(10000,i));
        }
        int count = 0;
        int sum = 0;

        for (int i=1;i<=1000;i++){
            if((i%3==0) && (i % 5 ==0)){
               count ++;
               sum +=i;
                System.out.println("Found number = " + i);
            }
            if (count==5){
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate /100));


    }
}
