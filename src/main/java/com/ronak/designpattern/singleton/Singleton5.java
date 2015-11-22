package com.ronak.designpattern.singleton;

/**
 * Creating object is not costly then use eager initialization. This version
 * creates object when class loads before any thread uses it.
 * 
 * use of final makes sures that instance cannot be rereferenced to other object
 * 
 * @author Ronak
 *
 */
public class Singleton5 {
	private static final Singleton5 instance = new Singleton5();

	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		return instance;
	}
}
