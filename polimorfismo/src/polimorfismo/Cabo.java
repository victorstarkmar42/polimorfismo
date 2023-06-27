package polimorfismo;

public final class Cabo extends Militar {

	private static final String CABO = "CABO";

	public Cabo() {
		super(CABO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.rango;
	}

}
