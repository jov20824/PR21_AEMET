package main;

import clases.EstacionMetereologica;

public class Start {

	public static void main(String[] args) {
		
		EstacionMetereologica aemet = new EstacionMetereologica(30);
		System.out.println(aemet);
		
		//ordena los datos por el criterio de la temperatura e imprimir
		aemet.ordenarTemperartura();;
		System.out.println(aemet);
		
		//ordena los datos por el criterio de la humedad e imprimir
		aemet.ordenarHumedad();
		System.out.println(aemet);
	}

}
