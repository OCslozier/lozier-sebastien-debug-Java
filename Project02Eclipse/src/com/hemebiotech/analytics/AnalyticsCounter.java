package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;

/**
 * La classe AnalyticsCounter est responsable de l'analyse des symptômes
 * (lecture, comptabilité) et de la gestion des occurrences (affichage et
 * écriture)
 */

public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;

	/**
	 * Le constructeur de la classe AnalyticsCounter.
	 *
	 * @param reader Le lecteur de symptômes à utiliser pour lire les données des
	 *               symptômes.
	 * @param writer Le redacteur de symptômes à utiliser pour écrire le résultat de
	 *               l'analyse.
	 */

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;

	}

	/**
	 * Récupère la liste des symptômes en utilisant le lecteur de symptômes reader.
	 *
	 * @return Retourne une liste représentant les symptômes.
	 */

	public List<String> getSymptoms() {

		return reader.GetSymptoms();

	}

	/**
	 * Compte les occurrences de chaque symptôme dans la liste donnée.
	 *
	 * @param symptoms La liste des symptômes à analyser.
	 * @return Retourne une Map associant chaque symptôme à son nombre
	 *         d'occurrences.
	 */

	public Map<String, Integer> countOccurrences(List<String> symptoms) {
		Map<String, Integer> occurrences = new TreeMap<>();

		for (String symptom : symptoms) {
			occurrences.put(symptom, occurrences.getOrDefault(symptom, 0) + 1);
		}

		return occurrences;
	}

	/**
	 * Affiche les symptômes leurs occurrences dans la console.
	 *
	 * @param occurrences La Map des symptômes et de leurs occurrences à afficher.
	 */

	public void displayOccurrences(Map<String, Integer> occurrences) {
		for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	/**
	 * Écrit les symptômes et leurs occurrences en utilisant le redacteur de
	 * symptômes writer.
	 *
	 * @param symptoms La Map des symptômes et de leurs occurrences à écrire.
	 */

	public void writeSymptoms(Map<String, Integer> symptoms) {

		writer.writeSymptoms(symptoms);

	}
}
