package app;

import java.util.Scanner;

import javax.naming.InvalidNameException;

import exceptions.NumberLessThanZeroException;

public class Application {

	public static void main(String[] args) {
		print("CIAO");

		// ********************* EXCEPTIONS EXAMPLES *********************
//		int[] numbers = { 1, 2, 3, 4 };
//		System.out.println(numbers[10]); // <-- UNCHECKED

//		int a = 100, b = 1;
//		double c = 100, d = 0;
//
//		System.out.println(c / d);
//
//		try {
//			System.out.println(a / b); // <-- UNCHECKED
//			int[] numbers = generateNumbers(4);
//			System.out.println(numbers[3]);
////			String s = "Ciao";
////			System.out.println(s.charAt(10));
//
//			String s2 = null;
//			System.out.println(s2.toLowerCase());
//
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("C'è stato un errore aritmetico!");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			System.out.println("C'è stato un errore con la gestione dell'array!");
//		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			System.out.println("C'è stato un errore generico!");
//		}

		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Dammi il primo numero");
			int a = Integer.parseInt(in.nextLine());
			System.out.println("Dammi il secondo numero");
			int b = Integer.parseInt(in.nextLine());
			System.out.println(a + b);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("No bueno!");
		} finally {
			in.close();
		}

		// ************************ CUSTOM UNCHECKED EXCEPTION ************************

//		int x = -10;
//
//		try {
//			if (x < 0) {
//				throw new NumberLessThanZeroException("Il numero inserito deve essere maggiore o uguale a zero", x);
//			}
//
//		} catch (NumberLessThanZeroException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}

		try {
			Rectangle r = new Rectangle(10, -10);
			// r.calc();
			r.setName("Bl");

		} catch (NumberLessThanZeroException e) {
			System.out.println(e.getMessage());
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}


	}

	public static void print(String str) {
		// print(str);
		System.out.println(str);
	}

	public static int[] generateNumbers(int n) {
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = i;
		}
		return numbers;
	}

}
