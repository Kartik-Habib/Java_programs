package com.jav8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        // Basic examples
       List<Integer> numbers= List.of(12,5,8,4,2,6,3,8,10);

        System.out.println("Printing the even numbers");
        numbers.stream().filter(num->num%2==0).forEach(num-> System.out.print(num +" "));

        System.out.println("\nPrinting the odd numbers");
        numbers.stream().filter(num->num%2!=0).forEach(num-> System.out.print(num +" "));



    }
}
