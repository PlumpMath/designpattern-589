package com.ronak.designpattern.singleton;

/**
 * This version solves performance issue with Singleton2 version.
 * 
 * This implement lazy initialization first if check if initialization is
 * required. If required then acquire lock otherwise get initialized version.
 * 
 * problem with this version is when thread 1 is in process of initializing
 * Singleton thread 2 will notice that instance is not null and return
 * incomplete initialized instance. If thread 2 uses it then it crash program.
 * 
 * @author Ronak
 *
 */
public class Singleton3 {

	private static Singleton3 instance;

	private Singleton3() {
	}

	public static synchronized Singleton3 getInstance() {

		if (instance == null) // check and try acquire lock only if null
			synchronized (Singleton3.class) {
				if (instance == null) {// when thread 1 was trying to acquire
										// lock other thread might have acquired
										// lock and initialized instance
										// so check again
					instance = new Singleton3();
				}
			}

		return instance;
	}

}
