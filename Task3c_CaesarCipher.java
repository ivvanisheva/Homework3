import java.util.Scanner;

public class Task3c_CaesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentence: ");
		String str = sc.nextLine();
		System.out.println("Please enter encode or decode!");
		String operation = sc.nextLine();

		if (operation.equals("encode")) {

			for (char c : str.toCharArray()) {

				if (Character.isLetter(c)) {
					char nextLetter = (char) (c + 1);

					if (c == 'z') {
						nextLetter = 'a';
					}

					System.out.print(nextLetter);
				} else {
					System.out.print(c);
				}
			}

		} else if (operation.equals("decode")) {

			for (char c : str.toCharArray()) {

				if (Character.isLetter(c)) {
					char nextLetter = (char) (c - 1);

					if (c == 'a') {
						nextLetter = 'z';
					}

					System.out.print(nextLetter);
				} else {
					System.out.print(c);
				}
			}

		} else {
			System.out.println("Wrong command [encode/decode].");
		}

		System.out.println();

		sc.close();
	}

}
