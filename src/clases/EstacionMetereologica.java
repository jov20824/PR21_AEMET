package clases;

import java.util.Arrays;

import comparador.ComparadorDias;

public class EstacionMetereologica {
	
	private static final int p1 = 28;
	private static final int p2 = 29;
	private static final int p3 = 30;
	private static final int p4 = 31;
	
	private Dia[] mes;
	
	public EstacionMetereologica(int cantidad) {
		if (cantidad==p1|cantidad==p2|cantidad==p3|cantidad==p4) {
			mes = new Dia[cantidad];
			for (int i=0;i<mes.length;i++) {
				mes[i] = new Dia();
			}
		}
	}

	public void ordenarTemperartura() {
		ComparadorDias cd = new ComparadorDias(ComparadorDias.temperatura);
		Arrays.sort(mes,cd);
	}
	public void ordenarHumedad() {
		ComparadorDias cd = new ComparadorDias(ComparadorDias.humedad);
		Arrays.sort(mes,cd);
	}
	
	@Override
	public String toString() {
		
		return "Este mes consta de "+mes.length+" dias\n"+"Temperaturas y humedades: \n"+"[" +Arrays.toString(mes) + "]";
		
		
				
				
	}
	
	
}
