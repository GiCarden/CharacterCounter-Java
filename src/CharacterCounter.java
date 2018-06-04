
/**
 * Write a program that asks the user to enter a string. The program should then count and display
 * the occurrences of alphabetical and non-alphabetical characters in that string.
 */
class CharacterCounter {
//--------------------------------------------------------------------------------------------------------------------//
    private static final int NUMBER_OF_ALPHABETIC_CHARACTERS = 26;

    private static int[] UPPER_CASE_CHARACTERS = new int[NUMBER_OF_ALPHABETIC_CHARACTERS];
    private static int[] LOWER_CASE_CHARACTERS = new int[NUMBER_OF_ALPHABETIC_CHARACTERS];

    //The CURRENT_CHAR character being processed
    private static char CURRENT_CHARACTER;

    //Counter for all characters
    private static int TOTAL_CHARACTER_COUNT = 0;

    //Counter for alphabetic characters
    private static int TOTAL_ALPHABETIC_COUNT = 0;

    //Counter for non-alphabetic characters
    private static int TOTAL_NON_ALPHABETIC_COUNT = 0;
//--------------------------------------------------------------------------------------------------------------------//

//Constructor---------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Private Methods-----------------------------------------------------------------------------------------------------//
    private static void print() {

        //Print the results
        System.out.println();
        for (int letter = 0; letter < UPPER_CASE_CHARACTERS.length; letter++) {

            StringBuilder stringBuilder = new StringBuilder();

            //Casting the number of letter + A into a char, Then printing count of each char
            stringBuilder.append((char) (letter + 'A'));
            stringBuilder.append(": ");
            stringBuilder.append(UPPER_CASE_CHARACTERS[letter]);
            stringBuilder.append('\t');
            stringBuilder.append((char) (letter + 'a'));
            stringBuilder.append(": ");
            stringBuilder.append(LOWER_CASE_CHARACTERS[letter]);

            System.out.println(stringBuilder.toString());
        }
        System.out.println();
        System.out.println("Total Character Count: " + TOTAL_CHARACTER_COUNT);
        System.out.println("Total Alphabetic Character Count: " + TOTAL_ALPHABETIC_COUNT);
        System.out.println("Total Non-Alphabetic Character Count: " + TOTAL_NON_ALPHABETIC_COUNT);
    }
//--------------------------------------------------------------------------------------------------------------------//

//Package Private Methods---------------------------------------------------------------------------------------------//
    static void charCounter(String line) {

        //Count the number of each character occurrence
        for (int ch = 0; ch < line.length(); ch++) {

            CURRENT_CHARACTER = line.charAt(ch);

            if (CURRENT_CHARACTER >= 'A' && CURRENT_CHARACTER <= 'Z') {

                UPPER_CASE_CHARACTERS[CURRENT_CHARACTER - 'A']++;
                TOTAL_CHARACTER_COUNT++;
                TOTAL_ALPHABETIC_COUNT++;
            } else if (CURRENT_CHARACTER >= 'a' && CURRENT_CHARACTER <= 'z') {

                LOWER_CASE_CHARACTERS[CURRENT_CHARACTER - 'a']++;
                TOTAL_CHARACTER_COUNT++;
                TOTAL_ALPHABETIC_COUNT++;
            } else {

                TOTAL_CHARACTER_COUNT++;
                TOTAL_NON_ALPHABETIC_COUNT++;
            }
        }
        print();
    }
//--------------------------------------------------------------------------------------------------------------------//

//Public Methods------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Setters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Getters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

}//End of Class.
