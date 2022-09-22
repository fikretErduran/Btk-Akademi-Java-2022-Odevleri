
public class Main {

	public static void main(String[] args) {
		// remainder kalan deger
		int number = -2;
		int remainder = number % 2;
		 System.out.println(remainder);
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("Asal degıldır");
			return;
		}
		if (number < 1) {
			System.out.println("Gecersiz sayi");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
			if (isPrime) {
				System.out.println("sayi asaldir");
			} else {
				System.out.println("sayi asal degildir");
			}
		}

	}

}
