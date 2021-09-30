package com.collection;

import java.util.Arrays;
 
class A {
    private static void check(int[] arr, int toCheckValue)
    {
    	boolean test = false;
    	for (int element : arr) {
    	if (element == toCheckValue) {
        test = true;
        break;
    }
}

// Print the result
    	System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }

    public static void main(String[] args){

    	int arr[] = { 8, 1, 9, 0, 22, 16, 50 };

    	int toCheckValue = 0;        //value to be checked

    	System.out.println("Array: "+ Arrays.toString(arr));

    	check(arr, toCheckValue);          //check if 0 is present in the array
    }
}