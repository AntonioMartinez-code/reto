package modelo;

import java.util.ArrayList;

public class Municipio {

	Municipio municipio1 = new Municipio();

	String nombre;
	int codPostal;
	
	ArrayList<Municipio>Municipios=new ArrayList();
	

	public Municipio() {

	}

	public Municipio(String nombre, int codPostal,ArrayList<Parada> Paradas) {
	
		this.nombre= nombre;
		this.codPostal=codPostal;
			

	}

	public Municipio getMunicipio1() {
		return municipio1;
	}

	public void setMunicipio1(Municipio municipio1) {
		this.municipio1 = municipio1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public ArrayList<Parada> getParadas() {
		return Paradas;
	}

	public void setParadas(ArrayList<Parada> paradas) {
		Paradas = paradas;
	}
}
