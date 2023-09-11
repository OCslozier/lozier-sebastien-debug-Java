package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headacheCount = 0;	
	private static int rashCount = 0;		
	private static int dialatedpupilCount = 0;
	
	public static void main(String args[]) throws Exception {
		
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();

		while (line != null) {
		
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headacheCount++;
				
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.equals("dialated pupils")) {
				dialatedpupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		reader.close();
		
		System.out.println("number of headaches: " + headacheCount);
		System.out.println("number of rash: " + rashCount);
		System.out.println("number of dialated pupils: " + dialatedpupilCount);
		
		// next generate output
		FileWriter fileWriter = new FileWriter("result.out", false);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + dialatedpupilCount + "\n");
		writer.close();
		System.out.println("Fichier généré: result.out");
	}
}
