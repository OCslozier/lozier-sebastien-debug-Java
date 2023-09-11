package com.hemebiotech.analytics;

import java.util.Map;
import java.util.List;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		String filepath = "Project02Eclipse/symptoms.txt";
		String outpath = "Project02Eclipse/result.txt";	
		
		
		// Créer une instance de SymptomDataReader
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
        List<String> symptoms = reader.GetSymptoms();
		
        // Créer une instance de SymptomCounter
        SymptomCounter counter = new SymptomCounter();
        Map<String, Integer> occurrences = counter.countOccurrences(symptoms);
        
        // Créer une instance de SymptomDisplay
        SymptomDisplay display = new SymptomDisplay();
        display.displayOccurrences(occurrences);
        
        // Créer une instance de WriteSymptomDataToFile
        WriteSymptomDataToFile writer = new WriteSymptomDataToFile(outpath);
        writer.writeSymptoms(occurrences);
        
	}
}