package com.gla.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class replace0to1 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        String n=sc.next();
        String str = n.replace('0','1');
        System.out.println(str);

    }
}



