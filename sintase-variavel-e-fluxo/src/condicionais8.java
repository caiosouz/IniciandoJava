
public class condicionais8 {
	public static void main(String[] args) {
		double bananas = 1.90;
		double uvas = 5.49;
		double biscoitos = 2.50;
		if (bananas <= uvas && bananas <= biscoitos) {
			System.out.println("Compre bananas, sao mais baratas");
		} else if (uvas <= bananas && uvas <= biscoitos) {
			System.out.println("Compre uvas, sao mais baratas");
		} else if (biscoitos <= bananas && biscoitos <= uvas) {
			System.out.println("Compre biscoitos, sao mais baratos");
		}
	}
}