
public class TestaIR {

	    public static void main(String[] args) {

	        double salario = 3300.0;
	        if (salario >= 1900.0 && salario <= 2800.0) {
	        	salario = salario - 142;
	        }
	        if (salario >= 2800.01 && salario <= 3751.0) {
	        	salario = salario - 350;
	        }
	        if (salario >= 3751.01 && salario <= 4664.00) {
	        	salario = salario - 363;
	        }
	        System.out.println(salario);
	    }
	}
