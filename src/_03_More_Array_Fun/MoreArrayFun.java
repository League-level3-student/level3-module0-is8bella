package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun fun = new MoreArrayFun();	
		
		String[] strings = new String[]{"apple", "pear", "peach", "watermelon", "tomato"};
		
		fun.randomString(strings);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printString (String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void reverseString (String[] strings) {
		for (int i = strings.length-1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void otherString (String[] strings) {
		for (int i = 0; i < strings.length+1; i++) {
			System.out.println(strings[i]);
			i++;
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void randomString (String[] strings) {
		Random rand = new Random();
		int r = rand.nextInt(4);
		System.out.println(strings[r]);
		
	}
	
}
