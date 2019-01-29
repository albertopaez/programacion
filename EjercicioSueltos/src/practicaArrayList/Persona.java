package practicaArrayList;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private int idPersona;
	private String nombre;
	private int altura;

	public Persona(int idPersona, String nombre, int altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona-> ID: " + idPersona + " Nombre: " + nombre + " Altura:" + altura + "\n";
	}

	public void listar(List<Persona> lp) {
		for (int x = 0; x < lp.size(); x++) {
			System.out.println(lp.get(x).toString());
		}

	}

	public void crear(List<Persona> lp) {
		int i = lp.get(lp.size())+1;
		lp.add(new Persona(i, "Persona" + i, r.nextInt(100) + 100));
	}

	/*
	 * Listar Crear Consultar (id) Actualizar (id) Borrado (id)
	 */

}