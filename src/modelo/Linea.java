package modelo;

import java.util.ArrayList;

public class Linea {

	int codBillete;
	Linea linea1 = new Linea();
	

	public Linea() {

	}

	public Linea(int Billete, ArrayList<Municipio> municipios, ArrayList<Autobus> autobus) {
		int codBillete;
		
		
	}

	public int getCodBillete() {
		return codBillete;
	}

	public void setCodBillete(int codBillete) {
		this.codBillete = codBillete;
	}

	public Linea getLinea1() {
		return linea1;
	}

	public void setLinea1(Linea linea1) {
		this.linea1 = linea1;
	}

	public ArrayList<Linea> getLineas() {
		return Lineas;
	}

	public void setLineas(ArrayList<Linea> lineas) {
		Lineas = lineas;
	}

}
