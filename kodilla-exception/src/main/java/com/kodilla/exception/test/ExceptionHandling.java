package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.8, 1.5);
        } catch (Exception e) {
            System.out.println("We have a problem!");
        } finally {
            System.out.println("Hmm it's very interesting");
        }
    }
}
