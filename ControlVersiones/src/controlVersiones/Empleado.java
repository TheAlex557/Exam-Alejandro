package controlVersiones;

/**
 * @author Alejandro
 *@version 1, 2021
 *@since 24/05/2021
 */
public class Empleado {
	/**
	 * Nombre del empleado
	 * Apellidos del empleado
	 * Salario del empleado
	 */
	private String nombre;
	private String apellidos;
	private double salario; 


/**
 * @param nombre
 * @param apellido
 * @param salario
 */
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
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
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}

/**
 * Aumenta el salario del empleado
 */
public void subirsalario (double subida) {
	salario=salario+subida;
}


}