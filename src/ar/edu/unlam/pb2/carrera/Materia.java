package ar.edu.unlam.pb2.carrera;

public class Materia implements Comparable<Materia>{
	
		private String nombreMateria;
		private Examen examen1;
		private Examen examen2;
		
		public Materia (String nombreMateria)
		{
			this.examen1 = new Examen(0);
			this.examen2 = new Examen(0);
			this.nombreMateria = nombreMateria;
		}

		
		//getters y setters
		public String getNombreMateria() {
			return nombreMateria;
		}

		public void setNombreMateria(String nombreMateria) {
			this.nombreMateria = nombreMateria;
		}
	
		public Examen getExamen1() {
			return examen1;
		}

		public void setExamen1(Examen examen1) {
			this.examen1 = examen1;
		}

		public Examen getExamen2() {
			return examen2;
		}

		public void setExamen2(Examen examen2) {
			this.examen2 = examen2;
		}


		//metodos para evaluar		
		
		public void evaluar(Integer numeroParcial, Integer nota)  throws Exception
		{
			if (examen1.getNumeroParcial()==1)
			{
				examen1.calificarNota(nota);
			}
			
			else {
				throw new Exception ("No puede asignar la nota a ese parcial");						
			       }
			
			if (examen2.getNumeroParcial()==2)
			{
				examen2.calificarNota(nota);
			}
			else {
				throw new Exception ("No puede asignar la nota a ese parcial");
				   }
		}


		// hash y equals
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nombreMateria == null) ? 0 : nombreMateria.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Materia other = (Materia) obj;
			if (nombreMateria == null) {
				if (other.nombreMateria != null)
					return false;
			} else if (!nombreMateria.equals(other.nombreMateria))
				return false;
			return true;
		}
		
		
		public int compareTo(Materia otro) {
			return this.nombreMateria.compareTo(otro.getNombreMateria());   //uso el metodo .compareTo
		}
		
		
		
		
	}
		
		

