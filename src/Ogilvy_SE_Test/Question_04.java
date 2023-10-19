package Ogilvy_SE_Test;

import java.util.*;

public class Question_04 {
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        boolean result;
        result = is_palindrome(input);
        System.out.println(result);
    }

    private static boolean is_palindrome(String input) {

        //Removing blank spaces
        String in = input.replaceAll("\\s", "");

        //Converting to the lower cases
        String lowerCase = in.toLowerCase();

        //creating an array and putting string into the array
        String lowerCaseReversed;
        char [] lowerCaseArray = lowerCase.toCharArray();

        //creating array for the reversed string and reversing the array
        char [] loweCaseReversedArray = new char[lowerCaseArray.length];
        for(int i=0; i<loweCaseReversedArray.length;i++ ){
            loweCaseReversedArray[i] = lowerCaseArray[lowerCaseArray.length-1-i];
        }

        //comparing two arrays and return the boolean value
        boolean isPalindrome = Arrays.equals(lowerCaseArray,loweCaseReversedArray);
        return isPalindrome;
    }
}
