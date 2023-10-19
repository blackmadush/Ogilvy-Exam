package Ogilvy_SE_Test;

import java.util.Arrays;

public class Question_02 {

    public static void main(String[] args) {
        int[] input_list = {30,40,10,40,20};
        int result;
        result=find_second_largest(input_list);
        System.out.println(result);
    }

    private static int find_second_largest(int[] inputList) {

        //Sorting the array into the descending order
        for(int j=0; j<inputList.length;j++) {
            for (int i = 0; i < inputList.length-1; i++) {
                if (inputList[i] < inputList[i + 1]) {
                    int temp = inputList[i];
                    inputList[i] = inputList[i + 1];
                    inputList[i + 1] = temp;
                }
            }
        }

        //Checking and removing duplicates
        int index = 0;
        for (int i = 1; i < inputList.length; i++) {
            if (inputList[i-1] != inputList[i]){
                inputList[index]=inputList[i-1];
                index++;
            }
        }

        //returning the second-largest number which contains in index 1;
        return inputList[1];
    }
}
