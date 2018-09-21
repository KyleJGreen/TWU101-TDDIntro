package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        int result = 1;

        if(i < 0)
            throw new IllegalArgumentException("n must be positive");

        while(i > 1)
        {
            result *= i;
            i--;
        }

        return result;
    }
}
