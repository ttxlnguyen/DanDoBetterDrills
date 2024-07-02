package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Modified by kristofer 3/4/2024.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String answer = "Hello World";
        return answer;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String answer = firstSegment + secondSegment;
        return answer;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String answer = firstSegment + secondSegment;
        return answer;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        return input.substring(input.length()-3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        boolean compare = true;
        if(inputValue == comparableValue){
            return  compare;
        } else if (inputValue != comparableValue){
            compare = false;
        }
        return compare;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
//        int length = inputValue.length();
//        int middle = length/2;
//        return inputValue.charAt(middle);

        if (inputValue.length() % 2 == 0) {
            int half = inputValue.length() / 2;
            return inputValue.charAt(half - 1);
        } else {
            int half = inputValue.length() / 2;
            return inputValue.charAt(half);
        }

    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String arr[] = spaceDelimitedString.split(" ", 2);
        String first = arr[0];
        return first;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String arr[] = spaceDelimitedString.split(" ", 3);
        String first = arr[1];
        return first;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        return new StringBuilder(stringToReverse).reverse().toString();
    }
}
