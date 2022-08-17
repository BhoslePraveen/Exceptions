package com.velocity.transientdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\praveen bhosle\\Desktop\\Demo\\studentobject.text");
			ObjectInputStream in = new ObjectInputStream(file);
			Object o1 = in.readObject(); // Read the object
			Object o2 = in.readObject(); // Read the object
			Student s1 = (Student) o1;// convert to student
			Student s2 = (Student) o2;// convert to student
			System.out.println(s1.name);
			System.out.println(s1.age); // wont be deserialize,will printdefault value
			System.out.println(s1.location);
			System.out.println(s1.classs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
