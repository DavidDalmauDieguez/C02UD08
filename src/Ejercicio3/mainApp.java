package Ejercicio3;

import java.util.Scanner;

import Ejercicio3.Electrodomestico.Color;
import Ejercicio3.Electrodomestico.consumoEnergia;

public class mainApp {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Llamamos la clase
		Electrodomestico electrodomesticoBase = new Electrodomestico();
		
		// Mostramos electrodomestico por defecto
		System.out.println(electrodomesticoBase);
		System.out.println();

		// Pedimos valores
		System.out.println("Añade el precio del electrodomestico");
		electrodomesticoBase.setPrecioBase(sc.nextInt());
		colorPicker(electrodomesticoBase);
		System.out.println("Añade el peso del electrodomestico");
		electrodomesticoBase.setPeso(sc.nextInt());
		energiaPicker(electrodomesticoBase);

		// Mostramos electrodomestico con los cambios preguntados
		System.out.println(electrodomesticoBase);
		
	}

	public static void colorPicker(Electrodomestico electrodomestico) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un boolean para el bucle
		boolean bucle = false;

		// Mientras bucle sea false seguimos
		do {
			// Preguntamos por el color
			System.out.println("Añade el color que quieres: ");
			for(Color recorrerColorElectrodomestico: Color.values()) {
				System.out.println(recorrerColorElectrodomestico + " ");
			}
			// Escribimos el color
			String color = new String(sc.next());
			color = color.toUpperCase();

			// Switch con los colores a escribir
			switch (color) {
			case "BLANCO":
				electrodomestico.setColor(color);
				bucle = true;
				break;

			case "NEGRO":
				electrodomestico.setColor(color);
				bucle = true;
				break;

			case "ROJO":
				electrodomestico.setColor(color);
				bucle = true;
				break;

			case "AZUL":
				electrodomestico.setColor(color);
				bucle = true;
				break;

			case "GRIS":
				electrodomestico.setColor(color);
				bucle = true;
				break;

			default:
				System.out.println("Escribe uno de los colores en stock");
				break;

			}
		}while(!bucle);
	}

	public static void energiaPicker(Electrodomestico electrodomestico) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un boolean para el bucle
		boolean bucle = false;

		// Mientras bucle sea false seguimos
		do {
			// Pedimos el tipo de consumoEnergetico
			System.out.println("Añade el tipo de consumo que quieres: ");
			for(consumoEnergia recorrerConsumoEnergia: consumoEnergia.values()) {
				System.out.println(recorrerConsumoEnergia + " ");
			}

			// Escribimos eltipo de consumo
			String consumo = new String(sc.next());
			consumo = consumo.toUpperCase();

			// Creamos el char con los valores de la enumeracion consum
			char tipoConsumo = consumo.charAt(0);

			// Switch con los valores a escribir
			switch (tipoConsumo) {
			case 'A':
				electrodomestico.setConsumoEnergetico(tipoConsumo);
				bucle = true;
				break;

			case 'B':
				electrodomestico.setConsumoEnergetico(tipoConsumo);
				bucle = true;
				break;

			case 'C':
				electrodomestico.setConsumoEnergetico(tipoConsumo);
				bucle = true;
				break;

			case 'D':
				electrodomestico.setConsumoEnergetico(tipoConsumo);
				bucle = true;
				break;

			case 'E':
				electrodomestico.setConsumoEnergetico(tipoConsumo);
				bucle = true;
				break;

			case 'F':
				electrodomestico.setConsumoEnergetico(tipoConsumo);
				bucle = true;
				break;

			default:
				System.out.println("Escribe un tipo de consumo de los que hay en stock");
				break;

			}
		}while(!bucle);
	}
}