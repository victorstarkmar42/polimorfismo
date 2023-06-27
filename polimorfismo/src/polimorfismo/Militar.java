package polimorfismo;

 abstract class Militar implements Empleo{
	protected final String rango;
	
	
	
	public Militar(String rango) {
		this.rango = rango;
	}


	public String getRango() {
		return rango;
	}

}
