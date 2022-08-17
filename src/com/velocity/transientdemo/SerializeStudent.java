package com.velocity.transientdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "abc";
		s.age = 12; // won’t be serialized.
		s.classs = "8th";
		s.location = "pune";
		Student s1 = new Student();
		s1.name = "ram";
		s1.age = 12; // won’t be serialized.
		s1.classs = "8th";
		s1.location = "mubai";

		try {
			FileOutputStream file = new FileOutputStream(
					"C:\\Users\\praveen bhosle\\Desktop\\Demo\\studentobject.text");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(s);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Serialization is done...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
