import java.util.Scanner;

class is_prime {
	
	public is_prime(int a) {
		int b = 0;
		
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				b = b + 1;
			}
		}
		if (b == 1) {
			System.out.print(a);
			System.out.println("     YES");
		} else {
			System.out.print(a);
			System.out.println("     NO");
		}
	}
}

public class Class02 {
	public static void main(String[] args) {
		  
		System.out.print("Input a number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		is_prime show0 = new is_prime(number);
		
	}
}
