package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * La classe Main est le point d'entrée du programme d'analyse de symptômes.
 * Elle charge les données des symptômes à partir d'un fichier, effectue son
 * analyse (lecture, comptabilité) et restitue le résultat (affichage, écriture
 * d'un fichier)
 */
public class Main {

	/**
	 * Point d'entrée du programme
	 *
	 * @param args Les arguments de ligne de commande (non utilisés dans ce
	 *             programme)
	 * @throws Exception Si une exception est levée lors du traitement
	 */

	public static void main(String args[]) throws Exception {

		// Chemin vers le fichier de symptômes en entrée
		String filepath = "Project02Eclipse/symptoms.txt";

		// Chemin vers le fichier de sortie pour l'écriture des résultats
		String outpath = "Project02Eclipse/result.txt";

		// Créer une instance de lecture des symptômes à partir du fichier d'entrée
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);

		// Créer une instance d'écriture des symptômes pour le fichier de sortie
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(outpath);

		// Créer une instance de AnalyticsCounter qui réalise l'analyse
		AnalyticsCounter counter = new AnalyticsCounter(reader, writer);

		// Récupère la liste des symptômes
		List<String> symptomsList = counter.getSymptoms();

		// Comptabilisation des occurrences des symptômes
		Map<String, Integer> symptomsOccurrences = counter.countOccurrences(symptomsList);

		// Affichage des occurrences des symptômes
		counter.displayOccurrences(symptomsOccurrences);

		// Écriture des symptômes et des occurrences dans le fichier de sortie
		counter.writeSymptoms(symptomsOccurrences);

	}

}