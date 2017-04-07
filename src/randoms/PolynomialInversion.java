package randoms;

public class PolynomialInversion {
	private final static int HIGHEST_POWER = 20;
	private final static int Y_CONSTANT = -4;
	
	public static void main(String[] args) {
		
		System.out.println(getSumOfCoefficients(HIGHEST_POWER, Y_CONSTANT));
	}
	
	public static long getSumOfCoefficients(int n, int a) {
		
		long op = 0;
		a = 1 - a;
		
		for(int i = 0; i <= n; i++) {
			//coeff = Math.pow(a, i);
			op = op + (long)(Math.pow(a, i)*((i%2 == 0)?1:-1));
		}

		
		return op;
		
	}
	
}
