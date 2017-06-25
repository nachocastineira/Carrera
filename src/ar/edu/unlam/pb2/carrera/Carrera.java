package ar.edu.unlam.pb2.carrera;

import java.util.TreeSet;

public class Carrera {
	
	private String nombreCarrera;
	
	
	private TreeSet <Materia> materias = new TreeSet <Materia>();
	
	
	//contar cantidad de materias
	public Integer contarCantidadDeMateria()
	{
		return materias.size();
	}
	
	//mostrar materias
	public TreeSet<Materia> mostrarMaterias()
	{
		return materias;
	}
	

	
	//admitir materia en la carrera
	public void admitirMateria (Materia materia)
	{
		materias.add(materia);
	}

	
	//getters y setters
	public TreeSet<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(TreeSet<Materia> materias) {
		this.materias = materias;
	}
	
	

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	
	
	
	
	

}
