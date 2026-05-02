
public class Löwe extends Tiere {

	Löwe(String name, String lieblingsFutter, int beine){
		super(name, lieblingsFutter, beine);
		
	
	}
	public void geräusche() {
		System.out.println("Der Löwe macht Miau");
	}
	@Override
	public void futter(String futter) {
		
		super.futter("Affen");
		
	}
	@Override
	public void futter(String futter, int futterMenge) {
		super.futter("Affen", 5);
	}
	@Override
	public void beine(int beine) {
		super.beine(4);
	}
	
}
