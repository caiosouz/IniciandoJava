
public class condicional3 {

	public static void main(String[] args) {
		System.out.println("Seu sexo é");
		char letra = 't';
		if (letra == 'F' || letra == 'f') {
			System.out.println("Feminino");
			}else
				if (letra == 'M' || letra == 'm') {
					System.out.println("Masculino");
					}else {
						System.out.println("Sexo invalido");
					}
	}
}