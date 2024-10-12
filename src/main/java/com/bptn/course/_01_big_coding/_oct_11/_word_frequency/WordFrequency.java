package com.bptn.course._01_big_coding._oct_11._word_frequency;
import java.util.HashMap;
import java.util.Map;
public class WordFrequency {

	public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";

        // Split the sentence into words using split() method and store the result in a String array called words
        String[] words = sentence.split(" ");
        
        
        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterate through each word in the sentence
        for (String word : words) {
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(word)) {
            	 int currentFrequency = wordFrequency.get(word);
                 wordFrequency.put(word, currentFrequency + 1);  
            
            // If the word is not in the map, add it with a frequency of 1
            }else {
            	wordFrequency.put(word, 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}
