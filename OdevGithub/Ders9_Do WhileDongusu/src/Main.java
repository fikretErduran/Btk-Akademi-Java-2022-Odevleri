
public class Main {

	public static void main(String[] args) {
		// do while
		// sart uymasas bile do while dongusu bir kere calisicaktir
		// int f 1'den baslattık f++ artirdik....
		int f = 1;
		do {
			System.out.println(f);
			f++;
		} while (f < 10);
		System.out.println("do while dongusu 1'den 10'a kadar donguyu siraladi");
		System.out.println("-----------------------------------");

		// int g 1'den baslattık g+2 artirdik....
		int g = 1;
		do {
			System.out.println(g);
			g += 2;
		} while (g < 10);
		System.out.println("do while dongusu 1'den 10'a kadar Tek sayi donguyu siraladi");
		System.out.println("-----------------------------------");

		// int c 2'den baslattık g+2 artirdik....
		int c = 2;
		do {
			System.out.println(c);
			c += 2;
		} while (c < 10);
		System.out.println("do while dongusu 1'den 10'a kadar cift sayilari dondurdu");

	}

}
