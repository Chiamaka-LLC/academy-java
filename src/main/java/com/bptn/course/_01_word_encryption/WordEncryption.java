package com.bptn.course._01_word_encryption;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		    	Scanner scan = new Scanner(System.in);   //create a scanner object
		        System.out.println("Enter a word to encrypt: ");
		        String word = scan.nextLine();
		        
		        String encryptedWord = encryptWord(word);  // Encrypt the word
		        	
		        System.out.println("Encrypted word: " + encryptedWord);  // Display the encrypted word
		        
	}
	 // Method to encrypt the word by shifting each letter
    public static String encryptWord(String word) {
    	String encrypted = "";

        // Iterate through each character of the input word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is lower-case letter
            if (ch >= 'a' && ch <= 'z') {
                encrypted +=((char) ((ch - 'a' + 1) % 26 + 'a'));
            }
            // Check if the character is upper-case letter
            else if (ch >= 'A' && ch <= 'Z') {
                encrypted +=((char) ((ch - 'A' + 1) % 26 + 'A'));
            }
            // If not a letter, leave the character unchanged
            else {
                encrypted +=(ch);
            }
        }

        // Return the encrypted word
        return encrypted;
    }
} 
