package org.example.uitests;

import java.util.Arrays;
import java.util.Collections;

public class RevertArray {
/*function reverses the elements of the array*/
    public static void main(String[] args) {
        Integer[] myArray = {1, 3, 5, 7, 9};
        System.out.println("Original Array:" + Arrays.asList(myArray)); reverse(myArray);
    }
    static void reverse(Integer myArray[]) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }
}
