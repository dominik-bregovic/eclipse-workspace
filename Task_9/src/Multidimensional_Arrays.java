
/*
 * Arrays
 * two dimensional array:
 * create in matrix
 * Author:		Bregovic Dominik 
 * Last Change:	16.12.2020
 */

public class Multidimensional_Arrays {
	
	// printing one rotation of each block in a line
	public static void print(String[][] blockT, String[][] blockZ, String[][] blockL, String[][] blockI) {
		
		for (int a = 0; a < 4; a++) {
			for (int t = 0; t < 4; t++) {
				System.out.print(blockT[a][t]);
			}
			System.out.print(" ");
			
			for (int z = 0; z < 4; z++) {
				System.out.print(blockZ[a][z]);
			}
			System.out.print(" ");
			
			for (int l = 0; l < 4; l++) {
				System.out.print(blockL[a][l]);
			}
			System.out.print(" ");
			
			for (int i = 0; i < 4; i++) {
				System.out.print(blockI[a][i]);
			}
			System.out.println();
		}
	}
	
	public static String[][] rotateBlock(String[][] block) {
		
		//creating new empty array 4x4 with 4 times 4  fields reservated
		String [][] temporaryBlock=new String[4][4];
		
		temporaryBlock[0][0]=block[3][0]; temporaryBlock[0][1]=block[2][0]; temporaryBlock[0][2]=block[1][0]; temporaryBlock[0][3]=block[0][0];
		temporaryBlock[1][0]=block[3][1]; temporaryBlock[1][1]=block[2][1]; temporaryBlock[1][2]=block[1][1]; temporaryBlock[1][3]=block[0][1];
		temporaryBlock[2][0]=block[3][2]; temporaryBlock[2][1]=block[2][2]; temporaryBlock[2][2]=block[1][2]; temporaryBlock[2][3]=block[0][2];
		temporaryBlock[3][0]=block[3][3]; temporaryBlock[3][1]=block[2][3]; temporaryBlock[3][2]=block[1][3]; temporaryBlock[3][3]=block[0][3];
		
		return temporaryBlock;
	}

	public static void main(String[] args) {
		String [][] blockT= {
				{"- ","- ","- ","- "},
				{"- ","o ","- ","- "},
				{"o ","o ","o ","- "},
				{"- ","- ","- ","- "}
				};
		
		String [][] blockZ= {
				{"- ","- ","- ","- "},
				{"- ","o ","o ","- "},
				{"o ","o ","- ","- "},
				{"- ","- ","- ","- "}
				};

		String [][] blockL= {
				{"- ","- ","- ","- "},
				{"- ","o ","- ","- "},
				{"- ","o ","- ","- "},
				{"- ","o ","o ","- "}
				};
		
		String [][] blockI= {
				{"- ","- ","o ","- "},
				{"- ","- ","o ","- "},
				{"- ","- ","o ","- "},
				{"- ","- ","o ","- "}
				};
		
		//printing first block
		print(blockT, blockZ, blockL, blockI);
		System.out.println();
		System.out.println();
		
		//printing 3 rotations
		for (int i = 0; i < 3; i++) {
			blockT=rotateBlock(blockT);
			blockZ=rotateBlock(blockZ);
			blockL=rotateBlock(blockL);
			blockI=rotateBlock(blockI);
			print(blockT, blockZ, blockL, blockI);
			System.out.println();
			System.out.println();
		}
		
		//printing last block, no println needed anymore
		blockT=rotateBlock(blockT);
		blockZ=rotateBlock(blockZ);
		blockL=rotateBlock(blockL);
		blockI=rotateBlock(blockI);
		print(blockT, blockZ, blockL, blockI);
	}

}
