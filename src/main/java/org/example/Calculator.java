package org.example;

public class Calculator {

    public int num1;

    public int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) { this.num1 = num1; }

    public int getNum2() { return num2; }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int adding() {
        return this.num1 + this.num2;
    }

    public int subtracting() {
        return this.num1 - this.num2;
    }

    public int multiplying() {
        return this.num1 * this.num2;
    }

    public int dividing() {
        return this.num1 / this.num2;
    }





}
