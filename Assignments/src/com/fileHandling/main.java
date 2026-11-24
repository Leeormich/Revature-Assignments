package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args) {
		Employee[] emps = {new Employee(101, "Sally", "Acquisitions", 75000), 
				new Employee(102, "Bob", "Accounting", 80000), 
				new Employee(103, "Bruce", "Management", 100000), 
				new Employee(104, "Jane", "Accounting", 900000), 
				new Employee(105, "Rebecca", "Sales", 60000)};
		try(FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			oos.writeObject(emps);
			Employee[] readEmps = (Employee[]) ois.readObject();
			for(Employee e : readEmps) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
