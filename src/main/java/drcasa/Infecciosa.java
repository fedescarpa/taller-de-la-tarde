package drcasa;

public class Infecciosa {

	private int cantidadCelulasAmenazadas;

	public void setCantidadCelulasAmenazadas(int cantidadCelulasAmenazadas) {
		this.cantidadCelulasAmenazadas = cantidadCelulasAmenazadas;
	}

	public boolean esAgresiva(Persona unaPersona) {
		return unaPersona.getCantidadCelulasTotales() * 0.1
				< this.cantidadCelulasAmenazadas;
	}

}
