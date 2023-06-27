package polimorfismo;

public final class Raso extends Militar {
  
	private static final String RASO = "RASO" ;

	public Raso() {
		super(RASO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.rango;
	}

}
