package hu.iit.me.service;

public class BasicCalculator implements CalculatorInterface {

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        if(b!=0)
            return a/b;
        else throw new ArithmeticException();
    }
}
