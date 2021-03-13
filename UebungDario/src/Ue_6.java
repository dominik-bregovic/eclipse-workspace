import java.util.Scanner;

/*
 * Fibbonacci
 * alternate fib.
 * Author:		Bregovic Dominik 
 * Last Change:	22.11.2020
 */
public class Ue_6 {
	
//	a b c
//	0 1 1 2 3 5 8 13 21 34
//	public static void iterative(int n) {
//		int a=0;
//		int b=1;
//		int c=1;
//			
//		for (int l=0;l<n;l++) {
//			System.out.println(a);
//			c=a+b;
//			a=b;
//			b=c;
//		}	
//	}
	
	public static void iterative2(int n) {
		int a=0;
		int b=1;
		int c=1;
		int z=0;
			
		for (int l=0;l<n;l++) {
			c=a+b;
			a=b;
			b=c;
			
			//until here only fib, from here pos. or neg.
			if (l%2 == 0) {
				//System.out.println(a);		//even
				z+=a;
			} else {
				//System.out.println(-a);		//odd
				z+=-a;
			}
			System.out.print(z);			
		}		
	}
	
	public static int fibCalc(int n) {
		if (n>=3) {
			return(fibCalc(n-1)+fibCalc(n-2));
		} else if (n==0) {
			return 0;
		} else {
			return 1;
		}
		
	}
	
//	public static void fibCalc2(int n) {
//		int z=0;
//		for (int i = 1; i <= n; i++) {
//			if (i%2 == 0) {
//				z -= fibCalc(i);
//			} else {
//				z += fibCalc(i);
//			}
//			System.out.print(z);
//		}
//	}
	
	
	// joining methods for formated printing
	
	public static void fibPrint(int n) {
		int a=0;
		int b=1;
		int c=1;
		int z=0;
		int y=0;
		
		System.out.println("Nr|Iterative|Recursive|Equal");
		
		for (int i = 1; i <= n; i++) {
			System.out.print(" "+i+"|       ");
			c=a+b;
			a=b;
			b=c;
			
			if (i%2 == 0) {
				z+=-a;
				
				y -= fibCalc(i);
			} else {
				z+=a;
				
				y += fibCalc(i);
			}
			
			// if y and z are zero
			if (y>=0 && z>=0) {
				System.out.print(" "+z+"|       ");
				System.out.print(" "+y+"| ");
			} else {
				System.out.print(z+"|       ");
				System.out.print(y+"| ");
			}
			
			// if true or false
			if (y==z) {
				System.out.print(true);
			} else {
				System.out.print(false);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int number=0;
		boolean loopTrue= true;
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.print("Enter a positive number: ");
			while(!scanner.hasNextInt()) {
				System.out.print("Enter a positive number: ");
				scanner.next();
			}
			number=scanner.nextInt();
			if(number>0) {
				loopTrue=false;
			}
			
		}while(loopTrue);
		scanner.close();
		
		fibPrint(number);
	}
}
