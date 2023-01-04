package proyectodeConvertidor;

import java.util.Scanner;

public class convertidor {

	public static void main(String[] args) {
		externa:
		while (true) {
			System.out.println("conversor de monedas");
			System.out.println(
					"1)_pesos argentinos a dolares " + "2)_ pesos mexicanos a dolar " + " 3)_real a dolar " + "4)_Salir");
			System.out.println();
			System.out.println("ingrese una opcion: ");
			Scanner leer = new Scanner(System.in);
			char opcion = leer.next().charAt(0);
			
             
			switch (opcion) {
			case '1':
				convertir(306.97, "pesos argentinos con impuestos");
				break;
			case '2':
				convertir(19.41, "pesos mexicanos a dolar");
				break;
			case '3':
				convertir(5.48, "Real a dolar");
				break;
			case '4':
				System.out.println("salir del programa");
				break externa;
			default:
				System.out.println("opcion invalido, pruebe con las opciones establecidas");
				break;
			}

		}

	}

	static void convertir(double valorDolar, String pais) {
		Scanner leer = new Scanner(System.in);
		System.out.printf("ingrese la cantidad a transformar: ", pais);
		double cantidadMoneda = leer.nextDouble();

		double Dolares = cantidadMoneda / valorDolar;

		Dolares = (double) Math.round(Dolares * 100d) / 100;

		System.out.println("-----------------------------");
		System.out.println("|son $ : " + Dolares + " dolares|");
		System.out.println("-----------------------------");

	}

}
