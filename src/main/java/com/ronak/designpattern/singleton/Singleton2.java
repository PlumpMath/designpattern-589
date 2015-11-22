package com.ronak.designpattern.singleton;

/**
 * 
 * this is thread safe version this version is not great in performance In this
 * version thread acquires lock even though instance is initialized.
 * synchronization when needed increases performance by 100 times
 * 
 * @author Ronak
 *
 */
public class Singleton2 {

	private static Singleton2 instance;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (instance == null)
			instance = new Singleton2();

		return instance;
	}

}
