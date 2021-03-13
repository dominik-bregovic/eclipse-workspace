import java.util.Scanner;

/*
 * Methods
 * diverse math operations:
 * min,max,sum,sumFromTo;delta,mean,gcd,lcm,primes
 * Author:		Bregovic Dominik 
 * Last Change:	12.11.2020
 */

public class Methods {

	
	public static int min(int d, int f) {
		if (d<f) {
			return d;
		} else {
			return f;
		}
	}
//	Same with as void method:
//	
//	public static void min(int d, int f) {
//		if (d<f) {
//			System.out.println(d);
//		} else {
//			System.out.println(f);
//		}
//	}
	
	private static int max(int d, int f) {
		if (d>f) {
			return d;
		} else {
			return f;
		}
	}
	
	public static int sum(int d, int f) {
		return (d+f);
	}
	
	public static int sumFromTo(int minimum, int maximum) {
		int sum=0;
		for (int i = minimum; i <= maximum; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int delta(int minimum, int maximum) {
		return (maximum-minimum);
	}
	
	public static double mean(int d, int f) {
		double sum=sum(d,f);
		return (sum/2);
	}
	
	public static int gcd(int d, int f) {
		int gcd = 1;
	    for (int i = 1; i <= d && i <= f; i++) {
	        if (d % i == 0 && f % i == 0) {
	            gcd = i;
	        }
	    }
	    return gcd;
	}
	
	public static int lcm(int d, int f) {
	    int max = max(d, f);
	    int min = min(d, f);
	    int lcm = max;
	    while (lcm % min != 0) {
	        lcm += max;
	    }
	    return lcm;
	}
	
	public static void primes(int a, int b, int minimum, int maximum) {
		System.out.print("primes("+a+","+b+") = {"); // a and b are only for printing 
		
		while (minimum <= maximum) {
            boolean even = false;

            for(int i = 2; i <= minimum/2; ++i) {	// we are starting from 2 because the numbers underneath are no primes
                // condition for nonprime number
                if(minimum % i == 0) {				// if it is an even number then break the programm, increase min and go again
                    even = true;
                    break;
                }
            }

            if (!even && minimum != 0 && minimum != 1) {	//0 and 1 are no primes, this case is only for the numb 2
            	System.out.print(minimum + ",");
            }

            ++minimum;
        }
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		int a=0;
		int b=0;
		boolean loopTrue= true;
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.print("Enter a positive number: ");
			while(!scanner.hasNextInt()) {
				System.out.print("Enter a positive number: ");
				scanner.next();
			}
			a=scanner.nextInt();
			if(a>0) {
				loopTrue=false;
			}
			
		}while(loopTrue);
		
		loopTrue=true;
		
		do {
			System.out.print("Enter a positive number: ");
			while(!scanner.hasNextInt()) {
				System.out.print("Enter a positive number: ");
				scanner.next();
			}
			b=scanner.nextInt();
			if(b>0) {
				loopTrue=false;
			}	
		}while(loopTrue);
		
		int min=min(a,b);
		int max=max(a,b);
		int sum=sum(a, b);
		int sumFromTo=sumFromTo(min,max);
		int delta=delta(min, max);
		double mean=mean(a, b);
		int gcd=gcd(a, b);
		int lcm=lcm(a, b);
		
		System.out.println("min("+a+","+b+") = "+min);
		System.out.println("max("+a+","+b+") = "+max);
		System.out.println("sum("+a+","+b+") = "+sum);
		System.out.println("sumFromTo("+a+","+b+") = "+sumFromTo);
		System.out.println("delta("+a+","+b+") = "+delta);
		System.out.printf("mean("+a+","+b+") = "+mean);
		System.out.println("gcd("+a+","+b+") = "+gcd);
		System.out.println("lcm("+a+","+b+") = "+lcm);
		primes(a, b, min, max);
		
		scanner.close();
	}

	

}
