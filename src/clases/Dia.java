package clases;

public class Dia {
	
	private int temperatura;
	private int humedad;
	
	public Dia() {
		this.rellenar();
	}
	
	private void rellenar() {
		temperatura=(int)(Math.random()*30-10);
		humedad=(int)(Math.random()*70+30);
	}

	@Override
	public String toString() {
		return "[temperatura=" + temperatura + ", humedad=" + humedad + "]\n";
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}
	
}
