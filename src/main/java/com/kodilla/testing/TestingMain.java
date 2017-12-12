package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
        public static void main(String[] args) {
            //System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")){
                System.out.println("Test OK");
            } else {
                System.out.println("Error!");
            }

            //Test Calculator
            int a=5;
            int b=3;
            Calculator calc = new Calculator(a,b);
            int addResult = calc.add();
            if (addResult==(a+b)) {
                System.out.println("Test OK");
            } else {
                System.out.println("Error");
            }

            int subResult = calc.subtract();
            if (subResult==(a-b)) {
                System.out.println("Test OK");
            } else {
                System.out.println("Error");
            }

        }
}
