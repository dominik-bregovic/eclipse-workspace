import java.util.Scanner;



public class ChoicesAndLoops {
	/*
	 * Choices and loops
	 * diverse math operations
	 * Author:		Bregovic Dominik 
	 * Last Change:	29.10.2020
	 */
	
	public static void main(String[] args) {
		
		int amoutOfInputs;
		int input=0;
		int sum=0;
		int min=0;
		int max=0;
		double mean=0;
		double reciprocalOfMean=0;
		double aiom=0;
		double afom=0;
		int domam=0;
		int sonfmtm=0;
		
		boolean isWrong; // control var
		boolean isWrong1; // control var
		Scanner scanner = new Scanner(System.in);	 // scanner declaration
		
		do {
			isWrong = false;
			System.out.print("Amount: ");			
			if (scanner.hasNextInt()) {				// checking if integer form "Amount"
				amoutOfInputs = scanner.nextInt();	//saving integer in amount of inputs and empties scanner at the same time 
				
				if (amoutOfInputs>0) {				//checking if positiv for the rest of programm
					do {
						isWrong1 = false;			// to exit the do-while loop if all if-s are wrong
						System.out.print("#1: ");	// my programm doesn`t print #1 so i did it manualy
						if (scanner.hasNextInt()) {	// asking if integer for the amount of numbers
							input = scanner.nextInt();// put number into input and out of the scanner
							if (input>0) {
								sum+=input;
								min=input;
								max=input;
							} else {
								isWrong1=true;
							}
						} else {
							isWrong1=true;
							scanner.next();
						}
					} while (isWrong1);
					
					//scan numbers and sum them into sum
					for(int i=1; i<amoutOfInputs; i++) {		//rechenoperation
						do {
							isWrong1 = false;
							System.out.print("#"+(i+1)+": ");	// +1 to not save the value so it doesnt count twice and print# in front of number
							
							if (scanner.hasNextInt()) {
								input = scanner.nextInt(); // VALIDATION !!!!!!!
								if (input>0) {
									sum+=input;
									
									//getting the smallest number of scanned numbers
									if(min>input) {
										min=input;
									}
									
									//getting the highest number of scanned numbers
									if(max<input) {
										max=input;
									}
								} else {
									isWrong1=true;
								}
							} else {
								isWrong1=true;
								scanner.next();
							}
						} while (isWrong1);
						
					}
					// definition for the printlines 
					mean=(double)sum/amoutOfInputs;
					reciprocalOfMean=1/mean;
					aiom=(-mean);
					if (mean<0) {
						afom=mean*(-1);
					} else {
						afom=mean;
					}
					domam=max-min;
					for (int j = min; j<=max; j++) {
						sonfmtm+=j;
					}
					
					
					//print sum
					System.out.println("Sum: "+sum);
					
					//print minimum
					System.out.println("Min: "+min);
					
					//print maximum
					System.out.println("Max: "+max);
					
					//average
					System.out.println("Mean: "+mean);
					
					//reciprocal of mean
					System.out.println("Reciprocal of mean: "+reciprocalOfMean);
					
					//Additive inverse of mean
					System.out.println("Additive inverse of mean: "+aiom);
					
					//Absolute value of mean
					System.out.println("Absolute value of mean: "+afom);
					
					//Delta of minimum and maximum
					System.out.println("Delta of minimum and maximum: "+domam);
					
					//Sum of numbers from minimum to maximum
					System.out.println("Sum of numbers from minimum to maximum: "+sonfmtm);
				} else if(amoutOfInputs<=0) {
					isWrong=true;	//if negative number, set while loop true to scan again
				}
			} else {
				isWrong=true;		//if wrong Datatype let while loop to scan again,
				scanner.nextLine(); // to empty scanner, prevents looping
			}
			
		} while (isWrong);
		scanner.close();
	}
}
