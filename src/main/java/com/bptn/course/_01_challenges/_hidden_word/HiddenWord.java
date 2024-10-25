package com.bptn.course._01_challenges._hidden_word;

public class HiddenWord {
	// Instance variable to store the hidden word
    private String hiddenWord;

    // Constructor to initialize the hidden word
    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    // Method to provide a hint based on the guess
    public String getHint(String guess) {
        StringBuilder hint = new StringBuilder();

        for (int i = 0; i < hiddenWord.length(); i++) {
            char hiddenChar = hiddenWord.charAt(i);
            char guessChar = guess.charAt(i);

            if (guessChar == hiddenChar) {
                // If the letter is in the correct position
                hint.append(guessChar);
            } else if (hiddenWord.indexOf(guessChar) != -1) {
                // If the letter is in the word but in the wrong position
                hint.append('+');
            } else {
                // If the letter is not in the word
                hint.append('*');
            }
        }

        return hint.toString();
    }
	public static void main(String[] args) {
		 HiddenWord puzzle = new HiddenWord("HARPS");
	        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
	        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
	        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
	        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
	        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

	}

}
