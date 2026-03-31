package com.gla.Wrapper;

public class WrapperAutoboxExample {
     public static void main(String[] args) {
         int a=10;//primitive

         Integer value=Integer.valueOf(a);
         System.out.println("Value : "+value);
         System.out.println("------------------------------");

         int unbox = value;
         int i3 = value.intValue();
         System.out.println(i3);
         System.out.println("Unboxing : "+unbox);

    }
}
