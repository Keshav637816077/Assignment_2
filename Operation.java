
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
    static Constant constant = new Constant();

    /*
     * Method to splice a String
     * This method takes the first string ,index for splice and length of character
     * that we want to slice as input.
     * This method returns the spliced string as output.
     * This method takes the string and converts it into character array and then
     * prints only the characters after avoiding index character and upto given
     * length character.
     */

    public static void splice(String input, int index, int length) {
        char array[] = input.toCharArray();
        char array2[] = new char[array.length - length];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                array2[i] = array[i];
            } else if (i > (index + length - 1)) {
                array2[i - length] = array[i];
            }
        }
        System.out.println(constant.Output5);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }
        System.out.println();
    }

    /*
     * Method to Sort Array in alphabetical Order.
     * It takes input as the first string and alphabetically sorts the array in
     * which character> uppercase letters and then lowercse letters.
     * It gives the sorted string as the output.
     */

    public static void sort(String name) {
        char array[] = name.toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    /*
     * Method to Reverse a String.
     * It takes the first string as the input.
     * This method uses a temperory variable to move or reverse the characters in
     * the string.
     * This method gives the reversed string of the first string as the output.
     */

    public static String reverse(String first) {
        char[] stringArray = first.toCharArray();
        int left = 0;
        int right = stringArray.length - 1;
        while (left < right) {
            char temp = stringArray[left];
            stringArray[left] = stringArray[right];
            stringArray[right] = temp;
            left++;
            right--;
        }
        return new String(stringArray);
    }

    /*
     * Method to find Maximum character that got repeated in a string.
     * This method takes the first string as the input and finds the maximum
     * character that is repeated.
     * This method returns the maximum character and the number of times it gets
     * repeated.
     */

    public class StringMaxRepeat {
        public static void maxRepeat(String text) {
            int maximumCount = 0;
            char maximimCharacter = text.charAt(0);
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                int count = 0;
                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count > maximumCount) {
                    maximumCount = count;
                    maximimCharacter = currentChar;
                }
            }
            System.out.print(maximimCharacter);
            System.out.println(maximumCount);
        }

        /*
         * Method to replace a character from the string.
         * This method takes the first string, the character you want to replace and
         * character you want to be replaced with as input.
         * This method find the relacechar string and rplaces it with replacewith
         * character.
         * It returns replaced string as the output.
         */

        public static void replace(String name, char replacechar, char replacewith) {
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

        /*
         * Method to find the number of words in a string.
         * This method takes the current string as the input and find the number of
         * words in the method.
         * This methos returns the number of words as the integer.
         */

        public static int wordCount(String name) {
            int count = 0;
            boolean Word = false;
            for (int i = 0; i < name.length(); i++) {
                char character = name.charAt(i);
                if (character != ' ' && character != '\t' && character != '.') {
                    if (!Word) {
                        count++;
                        Word = true;
                    }
                } else {
                    Word = false;
                }
            }
            return count;
        }

        /*
         * Method to find if the string is Palindrome or not.
         * This method returns the first string as the input and find if the string is
         * the palindrome or not.
         * This method returns boolean as the output i.e. either it is palindrome or
         * not.
         */

        public static boolean palindrome(String input) {
            int length = input.length();
            char[] array = input.toCharArray();
            for (int i = 0; i < length; i++) {
                if (array[i] >= 'A' && array[i] <= 'Z') {
                    array[i] = (char) (array[i] + ('a' - 'A'));
                }
            }
            for (int i = 0, j = length - 1; i <= j; i++, j--) {
                if (array[i] != array[j]) {
                    return false;
                }
            }
            return true;
        }

        /*
         * Method to shift character from end.
         * This method takes the first string and the position or the index from which
         * we want to rotate the string .
         * This method gives the shifted i.e. rotated string as the Output.
         */

        public static void shift(String first, int position) {
            position = position % first.length();
            char[] array = new char[first.length()];
            int index = 0;
            for (int i = first.length() - position; i < first.length(); i++) {
                array[index++] = first.charAt(i);
            }
            for (int i = 0; i < first.length() - position; i++) {
                array[index++] = first.charAt(i);
            }
            System.out.print(constant.Shift2);
            System.out.println(array);
        }

        /*
         * Method to Split strings in different words.
         * This method takes the first string as the input.
         * This method converts the input in the string array and splits the string into
         * different strings that are seperated by space or . .
         * This method gives the words as the array as the output.
         */

        public static String[] split(String first) {
            String temp = first;
            String[] words = new String[wordCount(first)];
            temp = " " + temp + " ";
            int index = 0;
            for (int i = 0; i < temp.length() - 1; i++) {
                for (int j = i + 1; j < temp.length(); j++) {
                    if (temp.charAt(i) == ' ' && temp.charAt(j) == ' ' && temp.charAt(i + 1) != ' ') {
                        words[index++] = temp.substring(i, j);
                        i = j;
                    }
                }
            }
            return words;
        }

        // This function clls the constant strings that is called twice.

        static public void options() {
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

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print(constant.Enter_String);
            String first = input.nextLine();
            System.out.println(constant.Entry + first);

            options();

            String choice = input.next();
            boolean quit = false;
            do {
                switch (choice) {
                    case "1":
                        System.out.print(constant.Append1);
                        String second = input.next();
                        first = first + " " + second;
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
                        replace(first, replacechar, replacewith);
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
                            System.out.print("'" + s + "'" + ",");
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
                        shift(first, position);
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
                if (!quit) {
                    options();
                    choice = input.next();
                }
            } while (!quit);
            input.close();
        }
    }
}
