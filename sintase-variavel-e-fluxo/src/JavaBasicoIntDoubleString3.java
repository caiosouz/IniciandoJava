
public class JavaBasicoIntDoubleString3 {
	public static void main(String[] args) {
		double alturaParede = 3;
		double larguraParede = 5;
		double alturaAzulejo = 0.50;
		double larguraAzulejo = 1.50;
		System.out.println("as medidas da parede são " + alturaParede + " metros de altura e " + larguraParede + " metros de largura");
		System.out.println("as medidas dos azulejos são " + alturaAzulejo + " cm de altura e " + larguraAzulejo + " cm de largura");
		double quantidade = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);
		System.out.println("A quantidade necessaria para cobrir a parede de azulejos é de " + quantidade);
	}

}
