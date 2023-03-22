
public class JavaBasicoIntDoubleString {
	public static void main(String[] args) {
		System.out.println("Conversao de temperatura de Celsius (C) para Kelvin (K), Reaumur (Re)"
				+ ", Rankine (Ra) e Fahrenheit (F)");
		double Celsios = 32.0;
		double Kelvin = Celsios + 273.15;
		double Reaumur = Celsios * 0.8;
		double Rankine = (Celsios * 1.8) + 32 + 459.67;
		double Fahrenheit = (Celsios * 1.8) + 32;
		
		System.out.println("A conversao de Celsios para Kelvin é igual a " + Kelvin + "!");
		System.out.println("A conversao de Celsios para Reaumur é igual a " + Reaumur + "!");
		System.out.println("A conversao de Celsios para Rankine é igual a " + Rankine + "!");
		System.out.println("A conversao de Celsios para Fahrenheit é igual a " + Fahrenheit + "!");
		
	}

}
