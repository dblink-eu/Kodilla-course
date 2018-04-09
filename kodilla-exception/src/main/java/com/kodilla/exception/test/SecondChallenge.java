package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {

            if (x >= 2 || x < 1 || y == 1.5){
                throw new ExceptionHandling();
            }
            return "Done!";
    }

    public static void main(String args[]) {
            SecondChallenge secondChallenge = new SecondChallenge();
            try {
                secondChallenge.probablyIWillThrowException(3,1.5);
            } catch (ExceptionHandling e) {
                System.out.println("Numbers over the rule: " + e );
            } finally {
                System.out.println("Finish!");
            }
    }

}
