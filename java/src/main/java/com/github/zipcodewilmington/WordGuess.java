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
        int userGuessesNum = 0;
        int userLives = secretWord.length() + 3;
        Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("This is guess number " + userGuessesNum);
        System.out.println("Secret word is: _ _ _");
        System.out.println("Wrong guesses: ");
        System.out.println("Enter a letter? (or quit)");
        String userInput = scanner.nextLine();
        System.out.println("User typed: " + userInput);
        System.out.println("Lives left " + userLives);
                
        if (userLives == 0.0) {
            System.out.println("You Died!");
        }
        
        if (userInput.equals("quit")) {
            break;
        }

        userGuessesNum++;
        userLives--;

    }
    System.out.println("Goodbye");
    scanner.close();
    }
}



/* 
// java version for jshell KRIS CODE
import java.util.Scanner;

System.out.println("Welcome to Word Guess!");
String secretWord = "cat";
int userGuessesNum = 0;
Scanner scanner = new Scanner(System.in);

// is infinite loop ok?
while (true) {
    System.out.print("Enter a letter? (or quit) ");
    String userInput = scanner.nextLine();
    System.out.println("User typed: " + userInput);
    if (userInput.equals("quit")) {
        break;
    }
    userGuessesNum++;
    // handle the guess
}

System.out.println("Ba-Bye!");
scanner.close();

*/