package com.ronak.designpattern.singleton;

/**
 * This version is to avoid eager initialization in Singleton5. static nested
 * class loads when getInstance is called.
 * 
 * @author Ronak
 *
 */
public class Singleton7 {
	private Singleton7() {
	}

	private static class SingletonHolder {
		public static final Singleton7 instance = new Singleton7();
	}

	public static Singleton7 getInstance() {
		return SingletonHolder.instance;
	}

}
