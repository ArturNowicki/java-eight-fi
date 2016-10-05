package com.sda.functionalinterfaces;

import java.util.function.Consumer;

public class SayReversedStringConsumer implements Consumer<String> {

    @Override
    public void accept(String value) {
        String reversed = new StringBuilder(value).reverse().toString();
        System.out.println(reversed);
    }

}
