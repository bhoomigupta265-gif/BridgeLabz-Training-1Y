package com.gla.Test;

import java.util.Scanner;
public class primenumber {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Number is not prime number");
            return;
        }
        int count=0;
        for(int i = 1;i<num;i++ ){
            if(num%i==0){
                count++;
            }
        }
        if(count<=2){
            System.out.println("Number is prime number");
        }else{
            System.out.println("Number is not prime number");
        }

    }
}

