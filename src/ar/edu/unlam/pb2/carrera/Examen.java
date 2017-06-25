package ar.edu.unlam.pb2.carrera;

public class Examen {
	
	private Integer nota;
	private Integer numeroParcial;
	
	
	//constructor
	public Examen (Integer numeroParcial)
	{
		this.numeroParcial = numeroParcial;
	}

	// getters y setters
	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Integer getNumeroParcial() {
		return numeroParcial;
	}

	public void setNumeroParcial(Integer numeroParcial) {
		this.numeroParcial = numeroParcial;
	}


	//metodos
	
//		public Integer calificarNota(Integer nota) //metodo limpio sin excepciones
//		{
//			if (nota>=1 && nota<=10) {
//				return nota;
//			}
//			
//			else {
//
//				System.out.println("El valor de la nota debe ser entre 1 y 10");
//				return 0;
//		    }
//		}
	
	
//	public Integer calificarNota(Integer nota) //metodo con try-catch
//	{
//		if (nota>=1 && nota<=10) {
//			
//			try
//			{
//			return nota;
//			}
//			
//			catch (Exception e)
//			{
//				System.out.println("No se puede asigna la nota");
//				return 0;
//			}
//		}
//		
//		else
//		{
//		System.out.println("El valor de la nota debe ser entre 1 y 10");
//		return 0;
//		}
//	}
	
	
	public Integer calificarNota(Integer nota) throws Exception
	{
		if (nota>=1 && nota<=10) {
			
			return nota;
		}
		
		
		else
		{
			throw new Exception ("El valor de la nota debe ser entre 1 y 10");	
		}
	}
}
