package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;

public class AnalyticsCounter {

	ISymptomReader reader;
	ISymptomWriter writer;

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;

	}

	public List<String> getSymptoms() {

		return reader.GetSymptoms();

	}

	public Map<String, Integer> countOccurrences(List<String> symptoms) {
		Map<String, Integer> occurrences = new TreeMap<>();

		for (String symptom : symptoms) {
			occurrences.put(symptom, occurrences.getOrDefault(symptom, 0) + 1);
		}

		return occurrences;
	}

	public void displayOccurrences(Map<String, Integer> occurrences) {
		for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public void writeSymptoms(Map<String, Integer> symptoms) {

		writer.writeSymptoms(symptoms);

	}
}
