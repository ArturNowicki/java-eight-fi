package com.sda.functionalinterfaces;

@FunctionalInterface

public interface QuadraFunction<A, B, C, D, R> {
	R quad(A a, B b, C c, D d);
}

