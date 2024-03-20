package com.SpringApplication.SpringCalculator.models;

public class CalculatorDTO {
    private float numberA;
    private float numberB;
    private String operation;
    /**
     * get field
     *
     * @return numberA
     */
    public float getNumberA() {
        return this.numberA;
    }

    /**
     * set field
     *
     * @param numberA
     */
    public void setNumberA(float numberA) {
        this.numberA = numberA;
    }

    /**
     * get field
     *
     * @return numberB
     */
    public float getNumberB() {
        return this.numberB;
    }

    /**
     * set field
     *
     * @param numberB
     */
    public void setNumberB(float numberB) {
        this.numberB = numberB;
    }

    /**
     * get field
     *
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * set field
     *
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
}
