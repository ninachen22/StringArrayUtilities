package com.zipcodewilmington;

import sun.security.util.ArrayUtil;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];

        for (int i = 0; i <= array.length - 1; i++) { //goes through the string array starting at sub 0 to the last index by increments of 1
            newArray[i] = array[(array.length - i) - 1]; //new array beginning at sub 0 is replaced with the og array's decrementing by the i value - 1
        }
        return newArray;
//        return null;
}

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
         if (Arrays.equals(array, reverse(array))) { //called method from prev problem
             return true;
         }
         return false;
//        String[] toCompare = new String[array.length];
//
//        for (int i = 0; i <= array.length - 1; i++) {
//            toCompare[i] = array[(array.length - i) - 1]; {
//                if (Arrays.equals(array, toCompare)) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arrayStr = Arrays.toString(array).toLowerCase();
        String abcs = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < abcs.length(); i++) {
            if (!arrayStr.contains(String.valueOf(abcs.charAt(i)))) {
                return false;
            }
        }
        return true;
//        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int freq = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].contains(value)) {
                freq++;
            }
        }
        return freq;
//        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArr = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                newArr[i] = array[i];
            }
        }
        return newArr;
//        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
