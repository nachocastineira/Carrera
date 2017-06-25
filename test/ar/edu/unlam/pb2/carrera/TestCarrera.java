package ar.edu.unlam.pb2.carrera;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCarrera {

	@Test
	public void testDeCarreraConMaterias() throws Exception {  //la excepcion esta en materia y examen
		Carrera miCarrera = new Carrera();
		miCarrera.setNombreCarrera("Desarrollo Web");  //le doy un nombre a la carrera
		
		Materia miMateria1 = new Materia("pb2"); //creacion de la primera materia con sus 2 examenes
		Examen miExamen1M1 = new Examen(1); //creo los objetos examen
		Examen miExamen2M1 = new Examen(2);
		miMateria1.setExamen1(miExamen1M1); //le seteo los examenes creados a esa materia
		miMateria1.setExamen2(miExamen2M1);
		
		Materia miMateria2 = new Materia("web1"); //creacion de la segunda materia con sus 2 examenes
		Examen miExamen1M2 = new Examen(1); //creo los objetos examen
		Examen miExamen2M2 = new Examen(2);
		miMateria2.setExamen1(miExamen1M2); //le seteo los examenes creados a esa materia
		miMateria2.setExamen2(miExamen2M2);
		
		Materia miMateria3 = new Materia("bd1"); //creacion de la tercera materia con sus 2 examenes
		Examen miExamen1M3 = new Examen(1); //creo los objetos examen
		Examen miExamen2M3 = new Examen(2);
		miMateria3.setExamen1(miExamen1M3); //le seteo los examenes creados a esa materia
		miMateria3.setExamen2(miExamen2M3);
		
		miCarrera.admitirMateria(miMateria1);  //se admiten las materia a la carrera
		miCarrera.admitirMateria(miMateria2);
		miCarrera.admitirMateria(miMateria3);
		
		miMateria1.getExamen1().setNota(8);  //se le setean la nota a los examenes
		miMateria1.getExamen2().setNota(8);
		
		miMateria2.getExamen1().setNota(5);
		miMateria2.getExamen2().setNota(9);
		
		miMateria3.getExamen1().setNota(8);
		miMateria3.getExamen2().setNota(7);
		
		assertEquals(miCarrera.contarCantidadDeMateria(), 3, 0);  //compruebo la cantidad de materias admitidas
	
		
		// se evalua cada materia
		miMateria1.evaluar(miMateria1.getExamen1().getNumeroParcial(), miMateria1.getExamen1().getNota());
		miMateria1.evaluar(miMateria1.getExamen2().getNumeroParcial(), miMateria1.getExamen2().getNota());
		
		miMateria2.evaluar(miMateria2.getExamen1().getNumeroParcial(), miMateria2.getExamen1().getNota());
		miMateria2.evaluar(miMateria2.getExamen2().getNumeroParcial(), miMateria2.getExamen2().getNota());
		
		miMateria3.evaluar(miMateria3.getExamen1().getNumeroParcial(), miMateria3.getExamen1().getNota());
		miMateria3.evaluar(miMateria3.getExamen2().getNumeroParcial(), miMateria3.getExamen2().getNota());
		
		assertEquals(miMateria1.getExamen1().getNota(), 8, 0);  //compruebo un valor de un examen
		
		
	}

}
