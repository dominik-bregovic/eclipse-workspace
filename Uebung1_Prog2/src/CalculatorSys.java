import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CalculatorSys {
	
	
	/*
	 * Calculator 
	 * choose first number, operator, second number
	 *  to start a mathematical operation
	 * Author: Dominik Bregovic
	 * Last change: 12.03.2021
	 */
	
	public static Double verifyNumber(String input, Scanner scanner) {
		input = scanner.nextLine().trim();
		char [] validIn = input.toCharArray();
		boolean verify = true;
		while (verify) {
			for (int i = 0; i < validIn.length; i++) {
				
				if (!Character.isDigit(validIn[i])) {
					System.out.println("11Error - arguments must be of the type NUMBER1 {'*','/','+','-'} NUMBER2");
					input = scanner.nextLine();
					validIn = input.toCharArray();
				}else {
					verify = false;
				}
			}
			
		}
			Double inputNumb = Double.valueOf(input);
			return inputNumb;
	}
	
	public static String verifyOperator(String operator, Scanner scanner) {
		operator = scanner.nextLine();
		
		while (!operator.equals("/") || operator.equals("*") || operator.equals ("-") || operator.equals("+")) {
			System.out.println("Error - arguments must be of the type NUMBER1 {'*','/','+','-'} NUMBER2");
			operator = scanner.nextLine();
		}
		return operator;
	}
	
	public static Double calculate(Double number1, Double number2, String operator) {
		System.out.printf("%1.2f", number1);
		System.out.print(operator);
		System.out.printf("%1.0f", number2);
		System.out.print(" = ");
		
		if (operator.equals("+")) {
			number1 += number2;
			return number1;
		}else if (operator.equals("-")) {
			number1 -= number2;
			return number1;
		}else if (operator.equals("/")) {
			number1 /= number2;
			return number1;
		}else {
			number1 *= number2;
			return number1;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = "0";
		String operator = "0";
		List<String> sign = new ArrayList<String>();
		List<Double> numbers = new ArrayList<Double>();
		
		numbers.add(verifyNumber(input, scanner));
		sign.add(verifyOperator(operator, scanner));
		numbers.add(verifyNumber(input, scanner));
		System.out.printf("Value 1: "+"%1.2f", numbers.get(0));
		System.out.println("\nOperator: " + sign.get(0));
		System.out.printf("Value 2: "+"%1.0f", numbers.get(1));
		System.out.println();
		System.out.printf("%1.2f", calculate(numbers.get(0), numbers.get(1), sign.get(0)));
		
	}

}
