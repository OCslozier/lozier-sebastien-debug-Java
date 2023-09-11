package com.hemebiotech.analytics;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	

	public class SymptomCounter {
		
		
		public Map<String, Integer> countOccurrences(List<String> symptoms) {
	        Map<String, Integer> occurrences = new HashMap<>();

	        // lire et compter les occurences
	        for (String symptom : symptoms) {
	            occurrences.put(symptom, occurrences.getOrDefault(symptom, 0) + 1);
	        }
	        
	        return occurrences;
	    }
	}