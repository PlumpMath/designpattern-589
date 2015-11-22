package com.ronak.designpattern.singleton;

/**
 * problem with this singleton it is not thread safe while thread 1 is in
 * processing of initializing constructor thread 2 will not get null,but uncomplete
 * initialized object.
 * 
 * Other problem is two thread might execute this together so there will be two
 * object which fails this pattern.
 * 
 * @author Ronak
 *
 */
public class Singleton1 {

	private static Singleton1 instance;

	private Singleton1() {

	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}

		return instance;
	}
}
