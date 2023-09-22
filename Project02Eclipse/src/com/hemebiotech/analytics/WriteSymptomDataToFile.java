package com.hemebiotech.analytics;

import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * La classe WriteSymptomDataToFile implémente l'interface ISymptomWriter. Elle
 * est utilisée pour écrire les informations sur les occurrences des symptômes
 * dans un fichier. Chaque symptôme et son nombre d'occurrences sont enregistrés
 * dans le fichier de sortie.
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String outpath;

	/**
	 * Constructeur de la classe WriteSymptomDataToFile
	 * 
	 * @param outpath chemin complet ou partiel vers le fichier contenant des
	 *                chaînes de symptômes , une par ligne
	 * 
	 */
	public WriteSymptomDataToFile(String outpath) {
		this.outpath = outpath;
	}

	@Override
	public void writeSymptoms(Map<String, Integer> symptomsOccurrences) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outpath))) {
			for (Map.Entry<String, Integer> entry : symptomsOccurrences.entrySet()) {
				writer.write(entry.getKey() + ": " + entry.getValue());
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}