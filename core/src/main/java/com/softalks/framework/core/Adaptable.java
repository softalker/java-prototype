package com.softalks.framework.core;

public interface Adaptable<I> {
	<O> O adapt(Class<O> target);
	Class<I> getInput();
}