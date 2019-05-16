import java.util.Scanner;

public class Task0b_ReadArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of digits, which you want to insert and then the digits:" );
		int digit = sc.nextInt();

		int[] arr = new int[digit];

		for (int i = 0; i < digit; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < digit - 1; i++) {
			System.out.print(arr[i] + ", ");
		}

		System.out.println(arr[digit - 1]);
		
		sc.close();
	}

}
