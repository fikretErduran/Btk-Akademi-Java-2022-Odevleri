
public class Main {

	public static void main(String[] args) {
		String ogrenci1="Erdal";
		String ogrenci2="inci";
		String ogrenci3="Ahmet";
		String ogrenci4="Eda";
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------");
		
		
		String [] ogrenciler = new String [4];
		ogrenciler[0]="Erdal";
		ogrenciler[1]="inci";
		ogrenciler[2]="Ahmet";
		ogrenciler[3]="Eda";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("----------------------");
	     for (String ogrenci:ogrenciler) {
	    	 System.out.println(ogrenci);
	     }

	}

}
