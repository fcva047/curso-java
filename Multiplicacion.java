import javax.swing.*;

public class Multiplicacion
{
	private int[][] matriz1;

	private int[][] matriz2;

	private int[][] multiplicacion;

	private int fila;

	private int columna;

	private int valor1;

	private int valor2;

	public void ordenMatriz()
	{
		fila = Integer.parseInt(JOptionPane.showInputDialog("Igrese fila: "));

		columna = Integer.parseInt(JOptionPane.showInputDialog("Igrese columna: "));

		matriz1 = new int[fila][columna];

		matriz2 = new int[fila][columna];

		multiplicacion = new int[fila][columna];
	}

	public void agregarMatriz1()
	{
		for (int i=0; i<matriz1.length; i++) {
			
			for (int j=0; j<matriz1[i].length; j++) {
				
				valor1 = Integer.parseInt(JOptionPane.showInputDialog("Igrese valores de la matirz 1: "));

				matriz1[i][j] = valor1;

			}
		}
	}

	public void mostrarMatriz1()
	{
		System.out.println("------ Matriz 1 ------");

		for (int i=0; i<matriz1.length; i++) {
			
			for (int j=0; j<matriz1[i].length; j++) {
				
				System.out.print(matriz1[i][j]+" ");	
			}

			System.out.println();
		}
	}

	public void agregarMatriz2()
	{
		for (int i=0; i<matriz2.length; i++) {
			
			for (int j=0; j<matriz2[i].length; j++) {
				
				valor2 = Integer.parseInt(JOptionPane.showInputDialog("Igrese valores de la matirz 2: "));

				matriz2[i][j] = valor2;

			}
		}
	}

	public void mostrarMatriz2()
	{
		System.out.println("------ Matriz 2 ------");

		for (int i=0; i<matriz2.length; i++) {
			
			for (int j=0; j<matriz2[i].length; j++) {
				
				System.out.print(matriz2[i][j]+" ");	
			}

			System.out.println();
		}
	}

	public void multiplicacionMatriz()
	{
		System.out.println("------ Multiplicación de Matrices ------");

		for (int i=0; i<fila; i++) {
			
			for (int j=0; j<columna; j++) {
				
				multiplicacion[i][j] = 0;

				for (int k=0; k<columna; k++) {
					
					multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j];
				}

				System.out.print(multiplicacion[i][j]+" ");
			}

			System.out.println();
		}
	}


	public static void main(String[] args)
	{
		Multiplicacion multiplicacion = new Multiplicacion();

		multiplicacion.ordenMatriz();

		multiplicacion.agregarMatriz1();

		multiplicacion.mostrarMatriz1();

		multiplicacion.agregarMatriz2();

		multiplicacion.mostrarMatriz2();

		multiplicacion.multiplicacionMatriz();
	}
}