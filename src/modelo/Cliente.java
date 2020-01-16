package modelo;

public class Cliente {

	Cliente cliente1 = new Cliente();

	String dni;
	String nombre;
	String apellidos;
	String sexo;
	String contrasena;

	public Cliente() {

	}

	public Cliente(String dni, String nombre, String apellidos, String sexo, String contraseña) {
		 this.dni=dni;
		 this.nombre=nombre;
		 this.apellidos=apellidos;
		 this.sexo=sexo;
		 this.contrasena=contrasena;
	}

	public Cliente getCliente1() {
		return cliente1;
	}

	public void setCliente1(Cliente cliente1) {
		this.cliente1 = cliente1;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
