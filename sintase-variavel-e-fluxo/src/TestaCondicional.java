
public class TestaCondicional {

	public static void main(String[] args) {
		     
		System.out.println("testando condicionais, if else");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("voce esta na maioridade");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18, mas pode entrar pois esta acompanhado");
			} else {
				System.out.println("infelismente voce nao pode entrar");

			}
			System.out.println("exercicios");
			double salario = 3300.0;
			
	        if(salario < 2600.0) {
	            System.out.println("A sua aliquota é de 15%");
	            System.out.println("Você pode deduzir R$ 350");
	        }

	        if(salario < 3750.0) {
	            System.out.println("A sua aliquota é de 22,5%");
	            System.out.println("Você pode deduzir R$ 636");
	        }
		}
	}
}
