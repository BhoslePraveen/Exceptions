package com.velocity.transientdemo;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -570075030785935779L;
	String name;
	transient int age;
	static String classs;
	String location;

}
