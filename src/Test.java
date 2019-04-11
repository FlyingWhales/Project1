import com.allianz.vehicle.*;

public class Test {

	public static void main(String[] args) {
		
		//test1();
		test2();
		
	}
	
	
	
	
	
	private static void test2() {
		
		Traktor t = new Traktor(false);
		System.out.println(t.isRomorkVar());
	}





	public static void test1() {
		Arac a = new Arac();
		//a.renk = "Sarı";
		a.setRenk("Sarı");
		
		System.out.println(a.getRenk());

		
		Araba araba = new Araba();
		araba.setAgirlik(0);
		araba.setKasaTipi("SW");
		araba.setRenk("sari");
		
		System.out.println(araba.getRenk());
		
		araba.setRenk("mavi");
		System.out.println(araba.getRenk());
		
		
		Gemi g = new Gemi();
		g.setPervaneSayisi(5);
		g.setRenk("mavi");
		
		System.out.println(g.getRenk());
	}
	

}
