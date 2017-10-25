package com.company.Test;

public class Divide {
    public double doOperation(double num, double den) {
        if (den==0)
            throw new IllegalArgumentException("D B Zero");
        return num/den;
    }
}
