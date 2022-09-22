
public class Main {

	public static void main(String[] args) {
		 //iki sekildede yazabiliriz
		double [] myList = new double[4];
		double [] myList1 = {1.10,4.50,2.22,3.45};
		
		double total=0;
		double max=myList1[0];
		
	   for(double number:myList) {
		   total=total+number;
			System.out.println(number);
		}
	   System.out.println("Total=" +total);
		System.out.println("--------------------------");
		
		
		for (double number1:myList1) 
		{
			if(max<number1) {
				max=number1;
			}
			total=total+number1;
			System.out.println(number1);
		}
		System.out.println("Total=" +total);
		System.out.println("En buyuk sayi"+max);

	}

}
