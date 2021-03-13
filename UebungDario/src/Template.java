import java.util.Scanner;

/*
 * Methods
 * diverse math operations:
 * min,max,sum,sumFromTo;delta,mean,gcd,lcm,primes
 * Author:		Bregovic Dominik 
 * Last Change:
 */

public class Template {

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
		
		//main prog
	}
}
