import java.util.Scanner;

public class Task0c_PrintString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s;
		s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));

		}
		sc.close();

	}
}
