package modelo;

public class Billete {

	Billete billete1 = new Billete();

	String numBillete;
	String fecha;
	String linea;
	String paradaOG;
	String paradaDT;

	public Billete() {

	}
	public Billete(String numBillete, String fecha, String linea, String paradaOG, String paradaDT) {
		this.numBillete=numBillete;
		this.fecha=fecha;
		this.linea=linea;
		this.paradaOG=paradaOG;
		this.paradaDT=paradaDT;
	}

	public Billete getBillete1() {
		return billete1;
	}

	public void setBillete1(Billete billete1) {
		this.billete1 = billete1;
	}

	public String getNumBillete() {
		return numBillete;
	}

	public void setNumBillete(String numBillete) {
		this.numBillete = numBillete;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getParadaOG() {
		return paradaOG;
	}

	public void setParadaOG(String paradaOG) {
		this.paradaOG = paradaOG;
	}

	public String getParadaDT() {
		return paradaDT;
	}

	public void setParadaDT(String paradaDT) {
		this.paradaDT = paradaDT;
	}

	

}
