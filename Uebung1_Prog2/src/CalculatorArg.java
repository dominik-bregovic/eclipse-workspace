import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CalculatorArg {
	
	/*
	 * Calculator 
	 * choose operator to start a mathematical operation
	 * Author: Dominik Bregovic
	 * Last change: 12.03.2021
	 */
	
	public static String verifyOperator(String operator, Scanner scanner) {
		operator = scanner.nextLine();
		
		while (!operator.equals("/") || operator.equals("*") || operator.equals ("-") || operator.equals("+")) {
			System.out.println("Error - arguments must be of the type NUMBER1 {'*','/','+','-'} NUMBER2");
			operator = scanner.nextLine();
		}
		return operator;
	}
	
	public static Double calculate(String num1, String num2, String operator) {
		Double number1 =Double.parseDouble(num1);
		Double number2 =Double.parseDouble(num2);
		System.out.print(number1 + operator + number2 + " = ");
		
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
		String operator = "0";
		List<String> signs = new ArrayList<String>();

		signs.add(verifyOperator(operator, scanner));
		System.out.println(calculate(args[0], args[1], signs.get(0)));
		
		

	}

}
