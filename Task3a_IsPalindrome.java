import java.util.Scanner;

public class Task3a_IsPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int len = str.length();

		for (int i = 0; i <= len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				System.out.println(false);
				return;
			}
		}

		System.out.println(true);
		
		sc.close();
	}
}
