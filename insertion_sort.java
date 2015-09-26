package sorting;

import java.util.Scanner;

public class insertion_sort {

	public static int[] sort(int[] numbers) {
		int key = 0, k = 0;
		System.out.println("Before Sorting");
		print(numbers);
		for (int j = 1; j < numbers.length; j++) {
			key = numbers[j];
			k = j - 1;
			while (k >= 0 && numbers[k] > key) {
				numbers[k + 1] = numbers[k];
				k = k - 1;

			}
			numbers[k + 1] = key;
		}

		return numbers;

	}
public static void print(int[] numbers){
	for (int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + "==>");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World. Enter the number of numbers");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int[] numbers = new int[n];
		System.out.println("Hello World. Enter the list of numbers");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter number" + i);
			numbers[i] = input.nextInt();
		}

		numbers=sort(numbers);
		System.out.println("\n After Sorting");
		print(numbers);
	}

}
