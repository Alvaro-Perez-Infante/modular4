package pakage;

import java.util.Scanner;

public class Ejercicio {

	
	public static void main(String[]args) {
		Scanner teclado= new Scanner(System.in);
		
		int a;
		int b;
		
		int numMayor;
		
		
		a= Util.leerInt("Introduzca un número: ");
		b= Util.leerInt("Introduzca otro número: ");
		

		numMayor = mayor(a, b);
		
		Util.escribir("El mayor es = " + numMayor);
		
		
	}
	
	
	public static int mayor(int n1, int n2) {
		int m;
		if (n1 < n2) {
			
			m = n2;
			
		} else {
			m = n1;
		}
		return m;
	}
	
}

