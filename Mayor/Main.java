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
        
        CuentaBancaria c1 = new CuentaBancaria("Juan", 1000, 1234);

        c1.retirar(200, 1234);
        c1.retirar(200, 1111);
    
        Cursos_Calificaciones ca1 = new Cursos_Calificaciones("Programacion", 70, 65, 80);

        System.out.println("Promedio: " + ca1.promedio());
        System.out.println("Estado: " + ca1.estado());
	}

}
