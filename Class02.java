class is_prime {
	public is_prime(int a) {
		int b = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				b = b + 1;
			}
		}
		if (b == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

public class Class02 {
	public static void main(String[] args) {
		is_prime show0 = new is_prime(23);
		is_prime show1 = new is_prime(37);
		is_prime show2 = new is_prime(39);
	}
}
