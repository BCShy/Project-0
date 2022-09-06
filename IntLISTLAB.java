// Brian Chhor
// HW4 LAB Assignment 1
// 3/20/2022

//First commit 

import java.util.Scanner;

public class IntLISTLAB {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter your values: ");
		int vals = scnr.nextInt();
		int[] arr = new int[vals];
		for(int x = 0; x < vals; x++)
			arr[x] = scnr.nextInt();
		
		int bound = scnr.nextInt();
		for(int y = 0; y < vals; y++)
			if(arr[y] <= bound)
				System.out.print(arr[y] + ", ");
	}
}
