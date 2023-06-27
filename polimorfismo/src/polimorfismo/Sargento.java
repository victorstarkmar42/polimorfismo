package polimorfismo;

public final class Sargento extends Militar{
	
	private static final String SARGENTO = "SARGENTO";
	
	public Sargento(){
		super(SARGENTO);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.rango;
	}
	
	

}
