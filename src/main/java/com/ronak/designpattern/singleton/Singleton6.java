package com.ronak.designpattern.singleton;

/**
 * This version does same as Singleton4 but provides error checking
 * 
 * @author Ronak
 *
 */
public class Singleton6 {
	private static final Singleton6 instance;

	static {
		try {
			instance = new Singleton6();
		} catch (Exception e) {
			throw new RuntimeException("An error occurred!", e);
		}
	}

	public static Singleton6 getInstance() {
		return instance;
	}

	private Singleton6() {
	}
}
