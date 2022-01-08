public class ArrayBidimensional
{
	private int[][] array;

	public ArrayBidimensional(int sizeFila, int sizeColumna)
	{
		array = new int[sizeFila][sizeColumna];
	}

	public void agregarMatriz(int indiceFila, int indiceColumna, int valor)
	{
		array[indiceFila][indiceColumna] = valor;
	}

	public int mostrarMatriz(int indiceFila, int indiceColumna)
	{
		return array[indiceFila][indiceColumna];
	}


	public static void main(String[] args)
	{
		ArrayBidimensional array = new ArrayBidimensional(3,3);

		array.agregarMatriz(0,0,1);
		array.agregarMatriz(0,1,2);
		array.agregarMatriz(0,2,3);
		array.agregarMatriz(1,0,4);
		array.agregarMatriz(1,1,5);
		array.agregarMatriz(1,2,6);
		array.agregarMatriz(2,0,9);
		array.agregarMatriz(2,1,9);
		array.agregarMatriz(2,2,9);

		for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++) {
				
				System.out.print(array.mostrarMatriz(i, j)+" ");
			}

			System.out.println();
		}
	}
}