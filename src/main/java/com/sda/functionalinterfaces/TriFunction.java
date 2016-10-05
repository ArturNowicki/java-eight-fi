package com.sda.functionalinterfaces;

@FunctionalInterface
public interface TriFunction<A, B, C, R> {
    
    R tri(A a, B b, C c);

}
