import java.util.Scanner;

public class Task3b_PrintLetterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int[] letterCount = new int[26];

		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				letterCount[Character.toLowerCase(c) - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (letterCount[i] > 0) {
				System.out.printf("%c(%d)%n", i + 'a', letterCount[i]);
			}
			
			sc.close();
		}

	}

}
