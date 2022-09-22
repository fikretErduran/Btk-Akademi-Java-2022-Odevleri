
public class Main {

	public static void main(String[] args) {
		String mesaj = "       Bugun hava cok guzel       ";

		System.out.println(mesaj.substring(6));
		// Bir metnin içerisinden parça alır
		System.out.println("------------");
		System.out.println("Eleman sayısı:" + " " + mesaj.length());
		// Eleman sayısını getirir.
		System.out.println("------------");
		System.out.println("6.Eleman:" + "" + mesaj.charAt(6));
		// istenilen index'deki karakteri ekrana getirir
		System.out.println("------------");
		System.out.println(mesaj + " ".concat("Antalya'da"));
		// Kelimenin sonuna karakter ekler
		System.out.println("------------");
		System.out.println(mesaj.startsWith("B"));
		// Kelimenin ilk karakteri "B" ile basliyormu? True-False
		System.out.println("------------");
		System.out.println(mesaj.endsWith("l"));
		// Kelimenin Son karakteri "l" ile bitiyormu? True-False
		System.out.println("------------");
		char[] elemanlar = new char[6];
		mesaj.getChars(6, 8, elemanlar, 0);
		System.out.println(elemanlar);
		// Kelimenin baslangıc ve bitis karakterini belirtilen index e gore getirir.
		System.out.println("------------");
		System.out.println(mesaj.indexOf("co"));
		// kelimenin hangi index numarasından basladiğini yazar
		System.out.println("------------");
		System.out.println(mesaj.lastIndexOf("ug"));
		// kelimenin hangi index numarasından basladiğini yazar
		System.out.println("------------");
		System.out.println(mesaj.replace("", "__"));
		// Kelimenin ara bosluklarını vaya karakterini degistirir.
		System.out.println("------------");
		System.out.println(mesaj.substring(6));
		// Kelimenin 6. karakterden sonrasını keserek ekrana yazdırır
		System.out.println("------------");
		System.out.println(mesaj.substring(6, 11));
		// Kelimenin 6.ile 11. karakteri arasını keserek ekrana yazdırır

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		} // Kelimeleri bosluk a gore alt alta ayırır
		System.out.println("------------");
		System.out.println(mesaj.toLowerCase());
		// Kelime yi kucuk harflere cevirerek ekrana yazdırır
		System.out.println("------------");
		System.out.println(mesaj.toUpperCase());
		// Kelimeleri buyuk harf'e cevirerek ekrana yazdirir.

		System.out.println(mesaj.trim());
		// Kelimenin basinda ve sonundaki bosluklari siler

	}

}
