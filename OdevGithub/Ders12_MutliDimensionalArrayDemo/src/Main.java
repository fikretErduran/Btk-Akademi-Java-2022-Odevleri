
public class Main {

	public static void main(String[] args) {
String [][] sehirler=new String[3][3];
		
		sehirler[0][0]= "istanbul";
		sehirler[0][1]= "Ankara";
		sehirler[0][2]= "İzmir";
		sehirler[1][0]= "Antalya";
		sehirler[1][1]= "Trabzon";
		sehirler[1][2]= "Diyarbakır";
		sehirler[2][0]= "Kayseri";
		sehirler[2][1]= "Van";
		sehirler[2][2]= "Mersin";

		for(int i=0;i<=2;i++) {
			System.out.println("--------------------------------");
			for(int f=0;f<=2;f++) {
				System.out.println(sehirler[i][f]);
			}

	}

}
}
