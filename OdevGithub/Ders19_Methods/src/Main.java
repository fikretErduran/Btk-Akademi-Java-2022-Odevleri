
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 6;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMı = true;
				break;
			}
		}

		String mesaj = "Sayi Mevcut Degildir" + aranacakSayi;
		if (varMı) {
			mesajVer(mesaj);

		} else {
			mesajVer("Sayi Mevcut Degildir" + " " + aranacakSayi);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
