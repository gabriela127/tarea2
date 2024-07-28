package tarea2;

public class Persona {
	//Id, primerNombre, segundoNombre, primerApellido, segundoApellido, genero, dpi, edad, ciudad.

private int id;
private String Pnombre, Snombre;
private String Papellido, Sapellido;
private String genero;
private String DPI;
private int edad;
private String ciudad;


public Persona(int id, String pnombre, String snombre, String papellido, String sapellido, String genero, String DPI,
		int edad, String ciudad) {
	super();
	this.id = id;
	this.Pnombre = pnombre;
	this.Snombre = snombre;
	this.Papellido = papellido;
	this.Sapellido = sapellido;
	this.genero = genero;
	this.DPI = DPI;
	this.edad = edad;
	this.ciudad = ciudad;
}

public int getId() {
	return id;
}
public String getPnombre() {
	return Pnombre;
}
public String getSnombre() {
	return Snombre;
}
public String getPapellido() {
	return Papellido;
}
public String getSapellido() {
	return Sapellido;
}
public String getGenero() {
	return genero;
}
public String getDpi() {
	return DPI;
}
public int getEdad() {
	return edad;
}
public String getCiudad() {
	return ciudad;
}

public String getNombreCompleto() {
	return Pnombre+" " +Snombre+" " +Papellido+" " +Sapellido+" ";
}


	
	
	


}
