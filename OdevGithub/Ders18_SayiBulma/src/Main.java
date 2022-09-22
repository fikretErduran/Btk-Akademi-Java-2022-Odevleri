
public class Main {

	public static void main(String[] args) {
		int aranacakSayi = 9;

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				System.out.println("aranan sayi :" + " " + aranacakSayi);
			}

		}

	}

}
