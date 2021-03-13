import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		String input;
//		String alphabethL="abcdefghijklmnopqrstuvwxyz";
//		String alphabethU="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int rotation;
		boolean loopTrue=true;
		char [] alphLow="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char [] alphUpp="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		Scanner scanner = new Scanner(System.in);
		//Scan if first word is uppercase
		input=scanner.nextLine();
		char result = input.charAt(0);
	//	char[] letters= input.toCharArray();
		
		//fist upperletter controll
		if (java.lang.Character.isUpperCase(result) ) {
			for (int i = 0; i < alphUpp.length; i++) {
				if (alphUpp[i]==result) {
					System.out.println(alphUpp[i]);
				}
			}
		}
	}

}
