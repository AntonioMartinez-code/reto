package modelo;

import java.util.ArrayList;

public class Parada {

	Parada parada1 = new Parada();

	String codParada;
	String calle;
	String nombreParada;
	String coordenadas;
	ArrayList<Parada> Paradas = new ArrayList();
	
	public Parada() {

	}

	public Parada(String codParada, String calle, String nombreParada, String coordenadas) {
		this.codParada=codParada;
		this.calle=calle;
		this.nombreParada=nombreParada;
		this.coordenadas=coordenadas;
	}

	public Parada getParada1() {
		return parada1;
	}

	public void setParada1(Parada parada1) {
		this.parada1 = parada1;
	}

	public String getCodParada() {
		return codParada;
	}

	public void setCodParada(String codParada) {
		this.codParada = codParada;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNombreParada() {
		return nombreParada;
	}

	public void setNombreParada(String nombreParada) {
		this.nombreParada = nombreParada;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	
}
