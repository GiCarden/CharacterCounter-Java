import java.util.Scanner;

/**
 * Write a program that asks the user to enter a string. The program should then count and display
 * the occurrences of alphabetical and non-alphabetical characters in that string.
 *
 * Test Class
 */
public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        CharacterCounter.charCounter(cin.nextLine());
    }
}