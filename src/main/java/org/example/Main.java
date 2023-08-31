package org.example;

import org.process.*;

public class Main {
    public static void main(String[] args) {
        int firstValue = 10;
        int secondValue = 5;

        View.print(firstValue, secondValue, Logics.multiplication(firstValue,secondValue),
                Logics.division(firstValue, secondValue), Logics.addition(firstValue, secondValue),
                Logics.subtraction(firstValue, secondValue));
    }
}