
public class Uebung_3 {

	public static void main(String[] args) {
	
		int personenkennzahl= 2010832022;
		int numb1= 2;
		int numb2= 0;
		int numb3= 1;
		int numb4= 0;
		int numb5= 8;
		int numb6= 3;
		int numb7= 2;
		int numb8= 0;
		int numb9= 2;
		int sum= numb1+numb2+numb3+numb4+numb5+numb6;
		int product= numb7*numb8*numb9;
		
	
	
		
		// Pre-Inkrimentiere product und Post-Inkrimentiere sum , bildung der Differenz laut Angabe
		
		int product2= ++product;	//von 0 zu 1 vor zuweisung inkrimentiert
		int sum2= sum++;			//von 14 zu 15 nach zuweisung inkrimentiert
		int diff= product2-sum2;		//-13
		
		//Differenz wird mit sum multipliziert
			 
		int product3= diff*sum;		//-210
		
		
		//Divident (product3) / Divisor (pnrLetzteZahl)
		
		
		int pnrzahl= ++personenkennzahl; 		// vor zuweisung erhöt ...2 auf...3
		int pnrLetzteZahl= pnrzahl % 10;		// letzte zahl durch Modulo ermittelt :3
		int quotient= product3/pnrLetzteZahl;	
		
			
		//Ausgabe auf Konsole
				
				System.out.println("Personenkennzahl = "+ --personenkennzahl+ "\n");
				
				System.out.println("Result = "+product3);
			
				System.out.printf("Integer Division = %3d\n", quotient);
				
				System.out.println("Rest = "+ product3%pnrLetzteZahl );
		
		// Integer quotient zu Float + Ausgabe
				
		float quotient1= (float)quotient;
	
				System.out.printf("Division = %1.2f", quotient1);
		

	}

}
