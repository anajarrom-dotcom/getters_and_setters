package Mayor;

public class Main {
	public static void main(String[]arsg ) {

		Persona prs1 = new Persona("Antony","Najarro",20);
		Persona prs2 = new Persona("David","Lopez",-76);
		Persona prs3 = new Persona("Fernanda","Aguilar",60);

		System.out.println(prs1);
		System.out.println(prs2);
		System.out.println(prs3);
		
		Producto p1 = new Producto("001", "Laptop", 5000, 10);

        p1.vender(3);
        p1.vender(8);

        System.out.println("Stock final: " + p1.getStock());
    
	}

}
