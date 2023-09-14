package com.hemebiotech.analytics;

import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String outpath;

	/**
	 * 
	 * @param outpath a full or partial path to file with symptom strings in it, one
	 *                per line
	 */
	public WriteSymptomDataToFile(String outpath) {
		this.outpath = outpath;
	}

	@Override
	public void writeSymptoms(Map<String, Integer> occurrences) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outpath))) {
			for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
				writer.write(entry.getKey() + ": " + entry.getValue());
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}