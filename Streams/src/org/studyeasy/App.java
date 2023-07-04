package org.studyeasy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) {
		File file = new File("studyeasy");
		file.mkdir();
		file = new File("studyeasy/team.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			
			
			bw.write("sushmitha");
			bw.newLine();
			bw.write("harry");
			bw.newLine();
			bw.write("potter");
			bw.newLine();
			System.out.println("Writing on to the file completed");
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error occured while writing on to the file");
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("studyeasy/team.txt"));
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
