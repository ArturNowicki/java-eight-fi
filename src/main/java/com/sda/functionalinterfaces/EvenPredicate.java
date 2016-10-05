package com.sda.functionalinterfaces;

import java.util.function.Predicate;

public class EvenPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}

}
