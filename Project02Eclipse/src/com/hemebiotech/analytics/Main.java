package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws Exception {

		String filepath = "Project02Eclipse/symptoms.txt";
		String outpath = "Project02Eclipse/result.txt";

		ReadSymptomDataFromFile aReader = new ReadSymptomDataFromFile(filepath);
		WriteSymptomDataToFile aWriter = new WriteSymptomDataToFile(outpath);
		AnalyticsCounter counter = new AnalyticsCounter(aReader, aWriter);

		List<String> symptoms = counter.getSymptoms();
		Map<String, Integer> occurrences = counter.countOccurrences(symptoms);
		counter.displayOccurrences(occurrences);
		counter.writeSymptoms(occurrences);

	}

}