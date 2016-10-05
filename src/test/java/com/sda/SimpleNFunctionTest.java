package com.sda;

import com.sda.functionalinterfaces.QuadraFunction;
import com.sda.functionalinterfaces.TriFunction;
import org.junit.Test;

public class SimpleNFunctionTest {

	@Test
	public void triFunction() {
		TriFunction<Integer, Integer, Integer, Integer> average = (Integer first, Integer second,
				Integer third) -> (first + second + third) / 3;

		System.out.println(average.tri(2, 6, 7));
	}

	/*
	 * Twoim zadaniem teraz jest napisac QuadraFunction, bioraca 4 argumenty i
	 * zwracajaca jedna wartosc.
	 */
	@Test
	public void quadraFunction() {
		QuadraFunction<Integer, Integer, Integer, Integer, Integer> average = (Integer first, Integer second,
				Integer third, Integer fourth) -> (first + second + third + fourth) / 4;

		System.out.println(average.quad(5, 7, 7, 1));
	}

}
