import java.util.Scanner;

public class Aufgabe5 {
	
	public static int scanNumb(Scanner sc) {
	    int number;
	    do {
	        System.out.print("Enter a positive number: ");
	        while (!sc.hasNextInt()) {
	            System.out.print("Enter a positive number: ");
	            sc.next();
	        }
	        number = sc.nextInt();
	    } while (number <= 0);
	    return number;
	  }
	
	public static int min(int numb1,int numb2) {
		if (numb1<numb2) {
			return numb1;
		}
		return numb2;
	}
	
	public static int max(int numb1,int numb2) {
		if (numb1>numb2) {
			return numb1;
		} 
		return numb2;
	}
	
	public static int sum(int numb1,int numb2) {
		return numb1+numb2;
	}
	
	public static int sumFromTo(int min,int max) {
		int sum=0;
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int delta(int max,int min) {
		return max-min;
	}
	
	public static double mean(int numb1,int numb2) {
		double sum=sum(numb1,numb2);
		return (sum/2);
	}
	
	public static int gdc(int numb1,int numb2) {
		int gcd = 1;
	    for (int i = 1; i <= numb1 && i <= numb2; i++) {
	        if (numb1 % i == 0 && numb2 % i == 0) {
	            gcd = i;
	        }
	    }
	    return gcd;
	}
	
	public static int lcm(int min,int max) {
		int lcm = max;
	    while (lcm % min != 0) {
	        lcm += max;
	    }
	    return lcm;
	}
	
	public static void primes(int a,int b,int minimum,int maximum) {
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
		Scanner scanner = new Scanner(System.in);
		
		int numb1=scanNumb(scanner);
		int numb2=scanNumb(scanner);
		int min=min(numb1,numb2);
		int max=max(numb1,numb2);
		int sum=sum(numb1,numb2);
		int sumFromTo=sumFromTo(min,max);
		int delta=delta(max,min);
		double mean=mean(numb1,numb2);
		int gdc=gdc(numb1,numb2);
		int lcm=lcm(min,max);
		
		System.out.println("min("+numb1+","+numb2+") = "+min);
		System.out.println("max("+numb1+","+numb2+") = "+max);
		System.out.println("sum("+numb1+","+numb2+") = "+sum);
		System.out.println("sumFromTo("+numb1+","+numb2+") = "+sumFromTo);
		System.out.println("delta("+numb1+","+numb2+") = "+delta);
		System.out.println("mean("+numb1+","+numb2+") = "+mean);
		System.out.println("gdc("+numb1+","+numb2+") = "+gdc);
		System.out.println("lcm("+min+","+max+") = "+lcm);
		primes(numb1, numb2, min, max);
	}
}
