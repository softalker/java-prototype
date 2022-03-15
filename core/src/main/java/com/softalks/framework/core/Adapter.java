package com.softalks.framework.core;

public abstract class Adapter<T> {

	public final Class<T> input;
	
	protected Adapter(Class<T> input) {
		this.input = input;
	}
	
}
