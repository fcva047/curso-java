public class Array2
{
	private int[] array;

	private int indice;

	public Array2(int size)
	{
		array = new int[size];

		indice = 0;
	}

	public void agregarArray(int valor)
	{
		array[indice] = valor;

		indice++;
	}

	public void mostrarArray()
	{
		for (int i=0; i<indice; i++) {
			
			System.out.print(array[i]+" ");
		}

		System.out.println();
	}


	public static void main(String[] args)
	{
		Array2 array = new Array2(6);

		array.agregarArray(11);
		array.agregarArray(12);
		array.agregarArray(13);
		array.agregarArray(14);
		array.agregarArray(15);
		array.agregarArray(16);

		array.mostrarArray();
	}
}