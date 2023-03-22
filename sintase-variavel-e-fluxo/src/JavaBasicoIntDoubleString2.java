
public class JavaBasicoIntDoubleString2 {
	public static void main(String[] args) {
		double massa = 1500.00;
		double altura = 5;
		double segundos = 3.0;
		int cavalos = (int) ((int) (massa * altura / segundos) / 745.6999);
		System.out.println("A quantidade de cavalos é de " + cavalos + "!");
	}

}
