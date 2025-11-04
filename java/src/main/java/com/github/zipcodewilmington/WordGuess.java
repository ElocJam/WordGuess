package com.github.zipcodewilmington;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class WordGuess 
{
public static void main(String [] args) {

    System.out.println("Welcome to WordGuess!");
    String secretWord = "hello";
    int userGuessesNum = 1;
    int userLives = 5;
    Scanner scanner = new Scanner(System.in);
    var wrongGuesses = new ArrayList<String>();
    var correctGuesses = new ArrayList<String>();

    while (true) {
    System.out.println("This is guess number " + userGuessesNum);
    System.out.println("Lives left " + userLives);

    String displayWord = "";
    for (int i = 0; i < secretWord.length(); i++){
        String letter = String.valueOf(secretWord.charAt(i));
        if (correctGuesses.contains(letter)) {
            displayWord += letter + " ";
        } else {
            displayWord += "_ ";
        }
    }
    System.out.println("Secret word is: " + displayWord);

    System.out.println("Wrong Guesses: " + wrongGuesses);
    System.out.println("Enter a letter? (or quit)");
    String userInput = scanner.nextLine().toLowerCase();

    boolean isCorrect = secretWord.contains(userInput);

        if (isCorrect) {
            correctGuesses.add(userInput);
            System.out.println("Correct letter!");
        } else {
            wrongGuesses.add(userInput);
            userLives--;
            System.out.println("Wrong!");
        }

        boolean allLettersGuessed = true;
        for (int i = 0; i < secretWord.length(); i++) {
            String letter = String.valueOf(secretWord.charAt(i));
            if (!correctGuesses.contains(letter)) {
                allLettersGuessed = false;
                break;
            }
        }

        if (allLettersGuessed) {
            System.out.println("You Won! The word was: " + secretWord);
            break;
        }

        if (userLives == 0) {
            System.out.println("You Died, Loser! The word was: " + secretWord);
            break;
        }

        userGuessesNum++;
    }

    System.out.println("Goodbye");
    scanner.close();
}
}