package app;

public class Application {

	public static void main(String[] args) {
		print("CIAO");

//		int[] numbers = { 1, 2, 3, 4 };
//		System.out.println(numbers[10]); // <-- UNCHECKED

		int a = 100, b = 1;

		try {
			System.out.println(a / b); // <-- UNCHECKED
			int[] numbers = generateNumbers(4);
			System.out.println(numbers[3]);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("C'è stato un errore aritmetico!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("C'è stato un errore con la gestione dell'array!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("C'è stato un errore generico!");
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
