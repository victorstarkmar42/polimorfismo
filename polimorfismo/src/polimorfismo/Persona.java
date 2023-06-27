package polimorfismo;

public final class Persona {  //el final protege a la case contra escritura
	
	private final String nombre;  // Con final el valor no puede ser modificado
	private  Empleo empleo;  // el valor puede ser modificado mediante le metodo set establecido
	private final String curp;
	
	public Persona(String nombre, Empleo empleo, String curp) {
		super();
		this.nombre = nombre;
		this.empleo = empleo;
		this.curp = curp;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Empleo getEmpleo() {
		return empleo;
	}

	public void setEmpleo(Empleo empleo) {
		this.empleo = empleo;
	}

	public String getCurp() {
		return curp;
	}
	
	@Override
	public final boolean equals( Object obj) {    //se protege el metodo equals contra modificación de escritura

		if(obj instanceof Persona) {
			Persona persona = (Persona) obj;
			if((persona.curp == this.curp) && (persona.nombre == this.nombre)){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

}
