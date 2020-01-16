package modelo;

import java.util.ArrayList;

public class Autobus {

	Autobus autobus1 = new Autobus();

	

	String codAutobus;
	int numPlazas;
	double consumo;
	int Km;
	String color;

	ArrayList<Autobus> Autobus1 = new ArrayList<Autobus>();
	
	public Autobus() {

	}

	public Autobus(String codAutobus, int numPlazas, double consumo, int Km, String color) {

		this.codAutobus = codAutobus;
		this.numPlazas = numPlazas;
		this.consumo = consumo;
		this.Km = Km;
		this.color = color;

	}

	public void setAutobus1(Autobus autobus1) {
		this.autobus1 = autobus1;
	}

	public ArrayList<Autobus> getAutobus1() {
		return Autobus1;
	}

	public void setAutobus1(ArrayList<Autobus> autobus1) {
		Autobus1 = autobus1;
	}

	public String getCodAutobus() {
		return codAutobus;
	}

	public void setCodAutobus(String codAutobus) {
		this.codAutobus = codAutobus;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public int getKm() {
		return Km;
	}

	public void setKm(int km) {
		Km = km;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
