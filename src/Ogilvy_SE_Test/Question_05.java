package Ogilvy_SE_Test;

import java.util.ArrayList;

public class Question_05 {
    public static void main(String[] args) {

        int [] inputArray = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> results = filterEvenNumbers(inputArray);
        System.out.println(results);

    }

    private static ArrayList<Integer> filterEvenNumbers(int[] inputArray) {

        //Creating an ArrayList instead of an array because we don't know about how many even numbers containing
        ArrayList<Integer> evenArray = new ArrayList<Integer>();

        //Iterating through the array and adding even numbers to the arraylist
        for (int i=0; i<inputArray.length;i++) {
            if(inputArray[i]%2==0){
                evenArray.add(inputArray[i]);
            }
        }
        return evenArray;
    }
}
