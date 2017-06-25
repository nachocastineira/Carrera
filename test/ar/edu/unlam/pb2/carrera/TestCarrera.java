package ar.edu.unlam.pb2.carrera;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCarrera {

	@Test
	public void testDeCarreraConMaterias() {
		Carrera miCarrera = new Carrera();
		
		Materia miMateria1 = new Materia("pb2");
		Examen miExamen1M1 = new Examen(1);
		Examen miExamen2M1 = new Examen(2);
		miMateria1.setExamen1(miExamen1M1);
		miMateria1.setExamen2(miExamen2M1);
		
		Materia miMateria2 = new Materia("web1");
		Examen miExamen1M2 = new Examen(1);
		Examen miExamen2M2 = new Examen(2);
		miMateria2.setExamen1(miExamen1M2);
		miMateria2.setExamen2(miExamen2M2);
		
		Materia miMateria3 = new Materia("bd1");
		Examen miExamen1M3 = new Examen(1);
		Examen miExamen2M3 = new Examen(2);
		miMateria3.setExamen1(miExamen1M3);
		miMateria3.setExamen2(miExamen2M3);
		
		miCarrera.admitirMateria(miMateria1);
		miCarrera.admitirMateria(miMateria2);
		miCarrera.admitirMateria(miMateria3);
		
		assertEquals(miCarrera.contarCantidadDeMateria(), 3, 0);
		
		
		
	}

}
