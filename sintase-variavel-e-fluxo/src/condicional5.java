
public class condicional5 {
	public static void main(String[] args) {
		System.out.println("condicional falhada");
		double nota1 = 2;
		double nota2 = 1;
		double media = nota1 + nota2;
		if (media >= 7) {
			System.out.println("Aprovado");
		}else
			if(media == 10) {
				System.out.println("Aprovado com distincao");
			}else{
				System.out.println("Reprovado");
			}
	}

}
