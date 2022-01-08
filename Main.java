public class Main
{


	public static void main(String[] args)
	{
		System.out.println("Matriz");

		/*int[] array = new int[6];*/

		int[] array2 = {1,2,3,4,5,6};

		/*for (int i=0; i<array2.length; i++) {
			
			System.out.println(array2[i]);
		}*/

		System.out.println("--- Array bidimensional ---");

		int[][] array3 = new int[3][3];

		array3[0][0] = 1;
		array3[0][1] = 2;
		array3[0][2] = 3;
		array3[1][0] = 4;
		array3[1][1] = 5;
		array3[1][2] = 6;
		array3[2][0] = 7;
		array3[2][1] = 8;
		array3[2][2] = 9;

		for (int i=0; i<array3.length; i++) {
			
			for (int j=0; j<array3[i].length; j++) {
				
				System.out.print(array3[i][j]+" ");
			}

			System.out.println();
		}

	}
}