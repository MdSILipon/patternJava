package root;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int i, j, patternSize;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter size number of pattern: ");
		patternSize = input.nextInt();
		//RIGHT HALF TRIANGLE PATTERN
		System.out.println("RIGHT HALF TRIANGLE PATTERN");
		for (i = 0; i < patternSize; i++) {
			for (j = 0; j < (patternSize - i); j++) {
				System.out.print(" " + " ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.print("\n");
		}
		
		//LEFT HALF TRIANGLE PATTERN
		System.out.println("LEFT HALF TRIANGLE PATTERN");
		for (i = 0; i < patternSize; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" " + "*");
			}
			System.out.print("\n");
		}
		
		//PIRAMID PATTERN
		System.out.println("PIRAMID PATTERN");
		for (i = 0; i < patternSize; i++) {
			for (j = 0; j < (patternSize - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.print("\n");
		}

	}
}
