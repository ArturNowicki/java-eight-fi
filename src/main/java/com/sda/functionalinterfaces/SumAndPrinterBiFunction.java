package com.sda.functionalinterfaces;

import java.util.function.BiFunction;

public class SumAndPrinterBiFunction implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer a, Integer b) {
        int sum = a + b;
        System.out.println(String.format("Sum of %d and %d is equal to %d", a, b, sum));
        return sum;
    }

}
