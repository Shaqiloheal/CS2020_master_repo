package org.example;

import java.util.Scanner;


import org.json.simple.JSONObject;

public class Addition {
    public static void main(String[] args) {
        Welcome1.printWelcome();
        
        System.out.println ("Hello " +args[0]);
        
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Enter first integer: ");
        int number1 = input.nextInt();
        
        System.out.print ("Enter second integer: ");
        int number2 = input.nextInt();
        
        int sum = number1 + number2;
        
        System.out.printf("Sum is %d%n", sum);
        
        JSONObject obj = new JSONObject();
        String jsonText;
        obj.put("number1", new Integer(number1));
        obj.put("number2", new Integer(number2));
        obj.put("result", new Integer(sum));
        jsonText = obj.toString();
        
        System.out.println(jsonText);
        
    }
}