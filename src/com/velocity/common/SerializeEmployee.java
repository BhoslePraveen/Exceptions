package com.velocity.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) throws IOException {

		Employee emp1 = new Employee(2022, "Ravi");
		Employee emp2 = new Employee(2020, "Lata");
		Employee emp3 = new Employee(2019, "Shyam");
		FileOutputStream file = new FileOutputStream("C:\\Users\\praveen bhosle\\Desktop\\Demo\\velocitydata.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(emp1);
		out.writeObject(emp2);
		out.writeObject(emp3);
		out.flush();
		out.close();
		file.close();
		System.out.println("Serialization is successfully done ..!");

	}
}
