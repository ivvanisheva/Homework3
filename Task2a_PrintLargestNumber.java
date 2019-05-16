import java.util.Scanner;

public class Task2a_PrintLargestNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter how many numbers want to add: ");
        
        int numberCount = sc.nextInt();
        
        System.out.println("Now write " + numberCount + " numbers with enter after everyone:");
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < numberCount ; i++) {
            int n = sc.nextInt();
            
            if(max < n) {
                max = n;
            }
        }
        
        System.out.println("Largest number is " + max + ".");
        
        sc.close();
    }
	
	
	}


