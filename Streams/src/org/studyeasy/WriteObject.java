package org.studyeasy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike",9444);
		Vehicle car = new Vehicle("car",3453);
		
		try(FileOutputStream fos = new FileOutputStream("studyeasy\\vehiles.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)) {
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object writter on to the file");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}

	}

}
