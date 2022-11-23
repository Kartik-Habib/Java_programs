package com.jav8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        // Basic examples
        List<Integer> numbers= List.of(12,5,8,4,2,6,3,8,10);
        //Using filer
        System.out.println("Printing the even numbers");
        numbers.stream().filter(num->num%2==0).forEach(num-> System.out.print(num +" "));

        System.out.println("\nPrinting the odd numbers");
        numbers.stream().filter(num->num%2!=0).forEach(num-> System.out.print(num +" "));

        //Using map
        System.out.println("\nPrinting the Square of numbers");
        numbers.stream().map(x->x*x).forEach(x-> System.out.print(x +" "));


    }
}
