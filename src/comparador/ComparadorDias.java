package comparador;

import java.util.Comparator;

import clases.Dia;

public class ComparadorDias implements Comparator<Dia>{

	public static final int temperatura=1;
	public static final int humedad=2;
	private int ordenar;
	
	public ComparadorDias(int como) {
		if (como==temperatura|como==humedad) {
			ordenar=como;
		}
	}
	
	public int compare(Dia o1, Dia o2) {
		int devolver=0;
		if (ordenar==temperatura) {
			devolver=o1.getTemperatura()-o2.getTemperatura();
		}
		if (ordenar==humedad) {
			devolver=o1.getHumedad()-o2.getHumedad();
		}
		return devolver;
	}
		
	

}
