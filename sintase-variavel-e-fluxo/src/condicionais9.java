
public class condicionais9 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		if (x < y && x < z && y < z) {
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		} else if (y < x && y < z && z < x) {
			System.out.println(y);
			System.out.println(z);
			System.out.println(x);
		} else if (z < x && z < y && y < x) {
			System.out.println(z);
			System.out.println(y);
			System.out.println(x);
		} else if (y < x && y < z && x < z) {
			System.out.println(y);
			System.out.println(x);
			System.out.println(z);
		} else if (x < y && x < z && z < y) {
			System.out.println(x);
			System.out.println(z);
			System.out.println(y);
		} else if (z < x && z < y && x < y) {
			System.out.println(z);
			System.out.println(x);
			System.out.println(y);
		}
	}
}