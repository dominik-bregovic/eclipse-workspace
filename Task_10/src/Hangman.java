
public class Hangman {

	
	public void part1() {
		System.out.println("===\n");
	}
	public void part2() {
		for (int i = 0; i < 4; i++) {
			System.out.println(" |");
		}
	}
	public void part2_1() {
		for (int i = 0; i < 2; i++) {
			System.out.println(" |");
		}
	}
	public void part2_2() {
			System.out.println(" |");
	}
	public void part3() {
		System.out.println("  ----");
	}
	public void part4() {
		System.out.println(" |/");
		for (int i = 0; i < 3; i++) {
			System.out.println(" |");
		}
	}
	public void part5() {
		System.out.println(" |/   |");
	}
	public void part6() {
		System.out.println(" |    O");
	}
	public void part7() {
		System.out.println(" |    |");
	}
	public void part7_1() {
		System.out.println(" |   /|");
	}
	public void part7_2() {
		System.out.println(" |   /|\\");
	}
	public void part8() {
		System.out.println(" |   /");
	}
	public void part9() {
		System.out.println(" |   / \\");
	}
	
	public void hang1(int j) {
		if (j==1) {
			part1();
		}else {
			hang2(j);
		}
		
	}
	
	public void hang2(int j) {
		if(j==2) {
			part2();
			part1();
		}else {
			hang3(j);
		}
	}
	public void hang3(int j) {
		if (j==3) {
			part3();
			part2();
			part1();
		} else {
			hang4(j);
		}
	}
	public void hang4(int j) {
		if (j==4) {
			part3();
			part4();
			part1();
		} else {
			hang5(j);
		}
	}
	public void hang5(int j) {
		if (j==5) {
			part3();
			part5();
			part2_1();
			part2_2();
			part1();
		} else {
			hang6(j);
		}
	}
	public void hang6(int j) {
		if (j==6) {
			part3();
			part5();
			part6();
			part2_1();
			part1();
		} else {
			hang7(j);
		}
	}
	public void hang7(int j) {
		if (j==7) {
			part3();
			part5();
			part6();
			part7();
			part2_1();
			part1();
		} else {
			hang8(j);
		}
	}
	public void hang8(int j) {
		if (j==8) {
			part3();
			part5();
			part6();
			part7();
			part8();
			part1();
		}else {
			hang9(j);
		}
	}
	public void hang9(int j) {
		if (j==9) {
			part3();
			part5();
			part6();
			part7();
			part9();
			part1();
		} else {
			hang10(j);
		}
	}
	public void hang10(int j) {
		if (j==10) {
			part3();
			part5();
			part6();
			part7_1();
			part9();
			part1();
		}else {
			hang11(j);
		}
	}	
		public void hang11(int j) {
			if (j==11) {
				part3();
				part5();
				part6();
				part7_2();
				part9();
				part1();
			}
	}
	
}
