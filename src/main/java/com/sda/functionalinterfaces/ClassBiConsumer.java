package com.sda.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class ClassBiConsumer implements BiConsumer<List<String>, String> {

	@Override
	public void accept(List<String> list, String string) {
		list.add(string);
	}

}
