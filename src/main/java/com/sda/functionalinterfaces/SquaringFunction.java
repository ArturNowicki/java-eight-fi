package com.sda.functionalinterfaces;

import java.util.function.Function;

public class SquaringFunction implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer n) {
		return n*n;
	}
	
}
