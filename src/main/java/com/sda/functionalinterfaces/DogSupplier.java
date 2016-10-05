package com.sda.functionalinterfaces;

import com.sda.eight.animals.EDog;
import java.util.function.Supplier;

public class DogSupplier implements Supplier<EDog> {

    @Override
    public EDog get() {
        return new EDog();
    }

}
