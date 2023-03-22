
public class condicionais7 {
	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 20;
		int numero3 = 30;
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O maior numero e o " + numero1);	
		}else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O maior numero e o " + numero2);
		}else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println("O maior numero e o " + numero3);
			} 
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("E o menor numero e o " + numero1);
		}else if (numero2 <= numero1 && numero2 <= numero3) {
			System.out.println("E o menor numero e o " + numero2);
		}else if (numero3 <= numero1 && numero3 <= numero2) {
			System.out.println("E o menor numero e o " + numero3);
		}
	}

}
 