/***
 * Java Programming Assignment 2
 * 
 * When the program is run, the user will first enter a string. After that, the program should ask the user which operation they want to execute on the string. The available operations are listed below: Append, CountWords, Replace, isPalindrome, Splice, Split, MaxRepeatingCharacter, Sort, Shift, and Reverse. Each method should perform its respective operation based on the user's input.
 * 
 * Methods that are  Implemented in this Program - 
 * 
 * 1. Append - Appends the newString provided by the user to the existing string. The method should remember the appended result.
 * 2. Count Words - Counts the total number of words in the current string.
 * 3. Replace - Replaces all occurrences of character a with character b in the current string.
 * 4. Palindrome - Checks if the current string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward.
 * 5. Split - Splits the current string into an array of words.
 * 6. Max Repeat - Finds and returns the character that appears the most frequently in the current string.
 * 7. Sort - Sorts the characters of the current string in alphabetical order.
 * 8. Shift - Moves the first n characters from the start to the end of the current string.
 * 9. Splice - Removes a substring from the current string starting at index start and of length length.
 * 10. Reverse - Reverses the current string.
 * 
 * 
 * Program Owner - Keshav Kumar
 * Date - 04/09/2024
 * 
 */


import java.util.Scanner;

public class Operation {

    //Method to splice a String

    public static void splice(String input,int index,int length){
        Constant constant = new Constant();
        char arr[] =input.toCharArray();
        char arr1[] = new char[arr.length-length];
        for (int i = 0; i < arr.length; i++) {
            if (i < index){
                arr1[i]=arr[i];
            }
            else if(i> (index + length -1)){
                arr1[i-length]=arr[i];
            }
        }
        System.out.println(constant.Output5);
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]);
        }
            System.out.println();
    }

    //Method to Sort Array in alphabetical Order.

    public static void sort(String s1){
        char arr[] = s1.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
            System.out.println();
    }

    //Method to Reverse a String.

    public static String reverse(String first) {
        if (first == null || first.length() == 0) {
            return first;
        }

        char[] strArray = first.toCharArray();
        int left = 0;
        int right = strArray.length - 1;

        while (left < right) {
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;

            left++;
            right--;
        }

        return new String(strArray);
    }

    //Method to find Maximum character that got repeated in a string.

    public class StringMaxRepeat {

        public static void maxRepeat(String text) {
            int maxCount = 0;
            char maxChar = text.charAt(0);
    
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                int count = 0;
                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = currentChar;
                }
            }
    
            System.out.print(maxChar );
            System.out.println(maxCount);
    }

    //Method to replace a character from the string.

    public static void replace(String name , char replacechar , char replacewith) {
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (currentChar == replacechar) {
                result = result + replacewith;
            } else {
                result = result + currentChar;
            }
        }
        System.out.println(result);
    }

    //Method to find the number of words in a string.
    
    public static int wordCount(String s1){
        if(s1 == null || s1.length() == 0){
            return 0 ;
        }
        int count = 0 ;
        boolean isWord = false;
        for(int i = 0 ; i < s1.length() ; i++ ){
            char ch = s1.charAt(i);
            if(ch != ' ' && ch!= '\t' && ch != '.'){
                if(!isWord){
                    count++;
                    isWord = true;
                }
            }else{
                isWord = false;
            }
        }
        return count;
    }

    //Method to find if the string is Palindrome or not.

    public static boolean palindrome(String input)
    {
        int length = input.length();

        char[] arr = input.toCharArray();
        for (int i = 0; i < length; i++)
        {
            if (arr[i] >= 'A' && arr[i] <= 'Z')
            {
                arr[i] = (char) (arr[i] + ('a' - 'A'));
            }
        }
        for (int i = 0, j = length - 1; i <= j; i++, j--)
        {
            if (arr[i] != arr[j])
            {
                return false;
            }
        }

        return true;
    }

    //Method to shift character from end.

    public static void shift(String first , int n){
        Constant constant = new Constant();
        n= n % first.length();
        char[] arr = new char[first.length()];
        int index = 0;
        for(int i =first.length() - n;i<first.length();i++ ){
            arr[index++] = first.charAt(i);
        }
        for(int i = 0; i < first.length() - n ; i++){
            arr[index++] = first.charAt(i);
        }
        System.out.print(constant.Shift2);
        System.out.println(arr);
    }

    //Method to Split strings in different words.

    public static String[] split(String first){
        String temp = first;
        String[] words = new String[wordCount(first)];
        temp = " "+temp+" ";
        int index = 0;
        for(int i = 0;i<temp.length()-1;i++){
            for(int j = i+1;j<temp.length();j++){
                if(temp.charAt(i)==' ' && temp.charAt(j)==' ' && temp.charAt(i+1) != ' '){
                    words[index++] = temp.substring(i,j);
                    i = j;
                }
            }
        }
        return words;
    }

    static public void options(){

        Constant constant = new Constant();
        System.out.println(constant.Operation);
        System.out.println(constant.Append);
        System.out.println(constant.Count);
        System.out.println(constant.Replace);
        System.out.println(constant.Palindrome);
        System.out.println(constant.Splice);
        System.out.println(constant.Split);
        System.out.println(constant.Repeat);
        System.out.println(constant.Sort);
        System.out.println(constant.Shift);
        System.out.println(constant.Reverse);
        System.out.println(constant.Exit);
        System.out.print(constant.Choice);
    }


    
    public static void main(String[] args){
        Constant constant = new Constant();
        Scanner input = new Scanner(System.in);
        System.out.print(constant.Enter_String);
        String first = input.nextLine();
        System.out.println(constant.Entry + first);

        options();
        
        String choice = input.next();
        boolean quit = false;
        do{
            switch (choice) {
                case "1":
                    System.out.print(constant.Append1);
                    String second = input.next();
                    first = first + " "+ second;
                    System.out.println(constant.Output1 + first);

                    break;
                    
                case "2":
                    System.out.println(constant.Output2 + wordCount(first));
                    break;

                case "3":
                    System.out.print(constant.Replace1);
                    char replacechar = input.next().charAt(0);
                    System.out.print(constant.Replace2);
                    char replacewith = input.next().charAt(0);
                    replace(first,replacechar,replacewith);
                    break;

                case "4":
                    System.out.println(constant.Output4 + palindrome(first));
                    break;

                case "5":
                    System.out.print(constant.Splice1);
                    int index = input.nextInt();
                    System.out.print(constant.Splice2);
                    int length = input.nextInt();
                    splice(first, index, length);
                    break;


                case "6":
                    String[] arr = split(first);
                    for (String s : arr) {
                        System.out.print("'"+ s +"'"+ ",");
                    }
                    System.out.println();
                    break;

                case "7":
                    String s1 = first;
                    System.out.println(constant.Output7);
                    maxRepeat(s1);
                    break;

                case "8":
                    sort(first);

                    break;
                case "9":
                    System.out.print(constant.Output9);
                    int position = input.nextInt();
                    shift(first,position);
                    break;
                case "10":
                    System.out.println(constant.Output10 + reverse(first));
                    reverse(first);
                    break;

                case "0":
                    quit = true;
                    break;

                default:
                    System.out.println(constant.Invalid);

                    break;
            }
            if(!quit){
                options();
                choice = input.next();
            }
        }while(!quit);
        input.close();
        
    }

}
}
