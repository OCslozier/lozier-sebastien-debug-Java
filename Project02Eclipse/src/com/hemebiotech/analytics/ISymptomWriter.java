package com.hemebiotech.analytics;

import java.util.Map;

/**
 * L'interface ISymptomWriter définit une méthode pour écrire des informations
 * sur les symptômes. Les implémentations de cette interface sont responsables
 * de l'enregistrement des données des symptômes, dans un fichier (ou autre)
 */

public interface ISymptomWriter {

	/**
	 * 
	 * Écrit les informations sur les occurrences des symptômes.
	 * 
	 * @param occurrences Un objet de type Map où chaque clé représente un symptôme
	 *                    et la valeur associée représente le nombre d'occurrences
	 *                    de ce symptôme.
	 */
	public void writeSymptoms(Map<String, Integer> occurrences);
}
