package test;

import java.time.LocalDate;

public class Factory {
	private String factoryName;
	private static Factory instance;
	
	private Factory() {
		factoryName = Factory.class.getSimpleName();
	}
	
	public static Factory getInstance() {
		if(instance == null) {
			instance = new Factory();
		}
		return instance;
	}
}