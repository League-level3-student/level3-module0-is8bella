package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] StringArray = new String[]{"one", "two", "three", "four", "five"};
		//2. print the third element in the array
		System.out.println(StringArray[3]);
		//3. set the third element to a different value
		StringArray[3] = "not four";
		//4. print the third element again
		System.out.println(StringArray[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < StringArray.length; i++) {
			StringArray[i] = "not numbers";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < StringArray.length; i++) {
			System.out.println(StringArray[i]);
		}
		//7. make an array of 50 integers
		int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random randint = new Random();
		for (int i = 0; i < integers.length; i++) {
			integers[i] = randint.nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = 0;
		for (int i = 0; i < integers.length; i++) {
			if (smallest > integers[i]) {
				smallest = integers[i];
			}
			if (smallest < integers[i]) {
				smallest = smallest;
			}
			if (smallest == integers[i]) {
				smallest = smallest;
			}
			
		}
		System.out.println("smallest # = " + smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < integers.length; i++) {
			System.out.println("entire array: " + integers[i]);
		}
		//11. print the largest number in the array.
		int largest = 0;
		for (int i = 0; i < integers.length; i++) {
			if (largest > integers[i]) {
				largest = largest;
			}
			if (largest < integers[i]) {
				largest = integers[i];
			}
			if (largest == integers[i]) {
				largest = largest;
			}
		}
		System.out.println("largest # = " + largest);
		//12. print only the last element in the array
		System.out.println("last element in array: " + integers[49]);
	}
}
