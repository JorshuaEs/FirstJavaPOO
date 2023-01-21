
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(4);
		Cuenta cuenta2 = new Cuenta(333);
		Cuenta cuenta3 = new Cuenta(444);
	
		System.out.println(Cuenta.getTotal());
	}
}
