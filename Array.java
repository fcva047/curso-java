public class Array
{
	private int[] array;

	public Array(int size)
	{
		array = new int[size];
	}

	public void agregarArray(int indice, int valor)
	{
		array[indice] = valor;
	}

	public int mostrarArray(int valor)
	{
		return array[valor];
	}


	public static void main(String[] args)
	{
		Array array = new Array(3);

		array.agregarArray(0, 11);
		array.agregarArray(1, 22);
		array.agregarArray(2, 33);

		for (int i=0; i<3; i++) {
			
			System.out.println(array.mostrarArray(i));
		}
	}
}