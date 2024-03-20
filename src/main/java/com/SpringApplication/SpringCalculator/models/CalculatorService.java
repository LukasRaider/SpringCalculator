package com.SpringApplication.SpringCalculator.models;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public float calculate(CalculatorDTO calculator){
        String operation = calculator.getOperation();
        float numberA = calculator.getNumberA();
        float numberB = calculator.getNumberB();

        switch (operation) {
            case "+":
                return numberA + numberB;
            case "-":
                return numberA - numberB;
            case "*":
                return numberA * numberB;
            case "/":
                if (numberB == 0) {
                    throw new IllegalArgumentException("Second number cannot be 0!!");
                }
                return numberA / numberB;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
