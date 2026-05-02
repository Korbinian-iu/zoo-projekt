public class Zoo{
	
	public static void main(String[] args) {
		System.out.println("Der Zoo ist eröffnet");
		
		
		Tiere[] meinZoo = {
				new Affe("Affe", "Löwen",2),
				new Löwe("Löwe", "Affen" ,4)
		};
		
		for(Tiere t: meinZoo) {
			t.geräusche();
			t.futter("Löwen");
			t.futter("Löwen", 4);
			t.beine(2);
			
			System.out.println(t.name);
		}
		
	}
	
	}