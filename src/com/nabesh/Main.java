package com.nabesh;

public class Main {

    public static int Summation(int n){
        //Base Case is the final condition to end the recursiveness
        if (n <= 0){
            return 0;
        }else{
            //Recursive case
            return n + Summation(n - 1);
        }
    }

    public static int Factorial(int n){
        if (n <= 1){
            return 1;
        }else{
            return n * Factorial(n - 1);
        }
    }

    //function to raise a number to a power
    public static int exponential(int n, int p){
        if (p <=0){
            return 1;
        }else {
            return n * exponential(n, p - 1);
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(exponential(3,4));
    }
}
