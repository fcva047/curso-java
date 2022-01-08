import javax.swing.*;

public class Matriz
{
	private int[][] matriz;

	private int fila;

	private int columna;

	private int valor;

	public void ordenMatriz()
	{
		fila = Integer.parseInt(JOptionPane.showInputDialog("Igrese fila: "));

		columna = Integer.parseInt(JOptionPane.showInputDialog("Igrese columna: "));

		matriz = new int[fila][columna];
	}

	public void agregarMatriz()
	{
		for (int i=0; i<matriz.length; i++) {
			
			for (int j=0; j<matriz[i].length; j++) {
				
				valor = Integer.parseInt(JOptionPane.showInputDialog("Igrese valores: "));

				matriz[i][j] = valor;

				/*array.agregarMatriz(0,0);
				array.agregarMatriz(0,1);
				array.agregarMatriz(0,2);
				array.agregarMatriz(1,0);
				array.agregarMatriz(1,1);
				array.agregarMatriz(1,2);
				array.agregarMatriz(2,0);
				array.agregarMatriz(2,1);
				array.agregarMatriz(2,2);*/

			}

			System.out.println();
		}
	}

	public void mostrarMatriz()
	{
		for (int i=0; i<matriz.length; i++) {
			
			for (int j=0; j<matriz[i].length; j++) {
				
				System.out.print(matriz[i][j]+" ");	
			}

			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Matriz matriz = new Matriz();

		matriz.ordenMatriz();

		matriz.agregarMatriz();

		matriz.mostrarMatriz();
	}
}