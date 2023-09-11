package com.hemebiotech.analytics;

	import java.util.Map;
	import java.util.List;
	import java.util.TreeMap;
	

	public class SymptomCounter {
		
		
		public Map<String, Integer> countOccurrences(List<String> symptoms) {
	        Map<String, Integer> occurrences = new TreeMap<>();

	        // lire et compter les occurences
	        for (String symptom : symptoms) {
	            occurrences.put(symptom, occurrences.getOrDefault(symptom, 0) + 1);
	        }
	        
	        return occurrences;
	    }
	}