
public class Encryption_process {
	
	private char [] alphLow="abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char [] alphUpp="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private String numbers="0123456789";
	
	private String sentence;
	private char result;
	private int startNumber;
	private int rotationNumber;
	
	private ScanInput scanner = new ScanInput();
	
	
	public String encryptSentence() {
	return this.sentence;
	}
		
	public void encryptWord() {
	enterWord();
			
		for (int i = 0; i < this.sentence.length(); i++) {
			stringToChar(i);
			if (i==0) {
				System.out.print("  Encrypted text: ");
			}
			if (java.lang.Character.isUpperCase(this.result)) {
				encryptUpperLetters();
			}else if (java.lang.Character.isLowerCase(this.result)) {
				encryptLowerLetters();
			}else
				System.out.print(" ");
		}
	}
	
		
	public void encryptUpperLetters() {
		for (int i = 0; i < this.alphLow.length; i++) {
			if (this.alphUpp[i]==result) {
				secureRotation(i);
				System.out.print(this.alphUpp[i+this.rotationNumber]);
			}
		}
	}

		
	public void encryptLowerLetters() {
		for (int i = 0; i < this.alphLow.length; i++) {
			if (this.alphLow[i]==this.result) {
				secureRotation(i);
				System.out.print(this.alphLow[i+this.rotationNumber]);
			}
		} 
	}
		
	public void enterWord() {
		System.out.print("  Enter text to enrcrypt: ");
		enterText();
		stringToChar();
	}
	
		
	public void startNumb() {
		this.startNumber=this.scanner.scanNumber();
	}
//	public void charToString() {
//		this.result_= Character.toString(this.result);
//	}
	
	
	public int getNumb() {
		return startNumber;
	}
	
	public void chooseProgramm() {
		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("  1 - Encrypt text");
		System.out.println("  2 - Decrypt text ");
		System.out.println("  3 - Quit");
		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.print("  >");
	}
	
	public void enterRotation() {
		scanner.validateNumberRotation();
		this.rotationNumber=scanner.getRotationNumber();
	}
	
	public void enterText() {
		scanner.scanForText();
		this.sentence= scanner.getText();
	}
	
	public void stringToChar() {
		this.result=sentence.charAt(0);
	}
	
	public void stringToChar(int i) {
		this.result=sentence.charAt(0+i);
		i++;
	}
	
	public void secureRotation(int i) {
		if (this.rotationNumber+i>=this.alphLow.length) {
			this.rotationNumber=this.alphLow.length-(i+this.rotationNumber);
		}
	}

}
