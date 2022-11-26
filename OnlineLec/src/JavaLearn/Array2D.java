package JavaLearn;

public class Array2D {
	
	
	
	public static void main(String[] args) {
		
		String[][] array = new String [4][5];
		array[0][0] = "apple";
		array[0][1] = "mango";
		array[0][2] = "banana";
		array[0][3] = "grape";
		array[0][4] = "papaya";
		
		array[1][0] = "red";
		array[1][1] = "blue";
		array[1][2] = "yellow";
		array[1][3] = "green";
		array[1][4] = "orange";
		
		array[2][0] = "1";
		array[2][1] = "2";
		array[2][2] = "3";
		array[2][3] = "4";
		array[2][4] = "5";
		
		array[3][0] = "a";
		array[3][1] = "b";
		array[3][2] = "c";
		array[3][3] = "d";
		array[3][4] = "e";
		
		
		
		
		for (int row = 0;row < array.length; row++) {
			for (int column = 0; column < array[0].length; column++) {
				System.out.print(array[row][column] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
