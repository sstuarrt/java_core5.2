package com.company.java_core.homework4.task2;

public class Calculator {
    private double number1;
    private double number2;
    private double number3;

    public Calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public Calculator(double number1, double number2, double number3){
        this(number1, number2);
        this.number3 = number3;
    }

    public double add_two(){
        double result = number1 + number2;
        System.out.println(result);
        return result;
    }

    public double add_three(){
        double result = number1 + number2 + number3;
        System.out.println(result);
        return result;
    }
}
