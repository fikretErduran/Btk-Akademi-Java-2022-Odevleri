
public class Main {

	public static void main(String[] args) {
		
		String mesaj="Bugun hava cok guzel";
		 String yeniMesaj= sehirVer();
		 System.out.println(yeniMesaj);
		 int sayi=topla(5,7);
		 System.out.println(sayi);
		 System.out.println(mesaj);
		 int topla=topla2(1,5,8,6,7,5);
		 System.out.println(topla);
	}
		public static void Ekle() {
			System.out.println("Eklendi");
		}
		public static void sil() {
			System.out.println("Silindi");
		}
		public static void guncelle() {
			System.out.println("Guncellendi");
		}
		public static int topla(int sayi1,int sayi2) {
			return sayi1+sayi2;
		}
		
		public static int topla2 (int... sayilar) {
		 int toplam=1;
		 for(int sayi:sayilar) {
			 toplam+=sayi;
		 }return toplam;
		}
		
		public static String sehirVer() {
			return "Ankara";
		}

	

}
