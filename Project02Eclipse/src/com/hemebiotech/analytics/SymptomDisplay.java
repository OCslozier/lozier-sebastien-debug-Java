package com.hemebiotech.analytics;

import java.util.Map;

public class SymptomDisplay {

    public void displayOccurrences(Map<String, Integer> occurrences) {
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
