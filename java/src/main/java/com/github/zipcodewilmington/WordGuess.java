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
        String secretWord = "cow";
        int userGuessesNum = 1;
        int userLives = 6;
        Scanner scanner = new Scanner(System.in);
        var wrongGuesses = new ArrayList<String>();

    while (true) {
        System.out.println("This is guess number " + userGuessesNum);
        System.out.println("Secret word is: _ _ _");
        System.out.println("Wrong Guesses: " + wrongGuesses);
        System.out.println("Enter a letter? (or quit)");
        String userInput = scanner.nextLine();
        System.out.println("User typed: " + userInput);

        if (userInput.equals("cow")) {
            System.out.println("You are a weiner!");
            break;
        }

        System.out.println("Lives left " + userLives);

        if (userLives == 0.0) {
            System.out.println("You Died, Loser!");
            break;
        }

        if (userInput.equals("quit")) {
            break;
        }

        userGuessesNum++;
        userLives--;
        wrongGuesses.add(userInput);

    }
    System.out.println("Goodbye");
    scanner.close();
    }
}