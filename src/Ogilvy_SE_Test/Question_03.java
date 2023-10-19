package Ogilvy_SE_Test;

public class Question_03 {

    public static void main(String[] args) {

        String input = "Hello World";

        int result;
        result = vowelCount(input);
        System.out.println(result);
    }

    private static int vowelCount(String input) {
        char[] charArray = input.toCharArray();

        //iterating through the array while counting how many vowels are there
        int count =0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='o'||charArray[i]=='u'||charArray[i]=='i'){
                count++;
            }
        }

        return count;
    }
}
