package com.ronak.designpattern.singleton;

/**
 * This version solves problem of thread 2 reading incomplete initialized
 * instance by using volatile. volatile variable guaranteeing happens-before
 * relationship, all the write will happen on volatile instance before any read
 * of instance variable.This was not the case prior to Java 5, and that's why
 * double checked locking was broken before.
 * 
 * Other note In modern day of Test driven development, Singleton is regarded as
 * anti pattern because of difficulty it present to mock its behavior, so if you
 * are TDD practitioner better avoid using Singleton pattern.
 * 
 * @author Ronak
 *
 */
public class Singleton4 {

	private static volatile Singleton4 instance;

	private Singleton4() {
	}

	public static synchronized Singleton4 getInstance() {

		if (instance == null)
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}

		return instance;
	}
}
