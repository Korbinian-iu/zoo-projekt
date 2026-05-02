
public class Tiere {
	
	String name;
	String lieblingsFutter;
	int beine;
	Tiere(String name, String lieblingsFutter, int beine){
		this.name= name;
		this.lieblingsFutter=lieblingsFutter;
		this.beine=beine;
	}
	public void beine(int beine) {
		System.out.println(name + " hat " + beine + "Beine");
	}
	public void geräusche() {
		System.out.println("Das Tier macht Geräusche");
	}
	public void futter(String futter) {
		System.out.println(name + " frisst " + futter);
	}
	public void futter(String futter, int futterMenge) {
		System.out.println(name + " frisst " + futterMenge + futter);
	}
	
}
