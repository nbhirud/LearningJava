package misc;

public class NumberProcessor {
	
	
	public float[] getRandomArray(int size) {
		float[] arr = new float[size];
		
//		Math.random() Returns a double value with a positive sign, greater than or equal 
//		to 0.0 and less than 1.0. Returned values are chosen pseudorandomly 
//		with (approximately) uniform distribution from that range. 
//		When this method is first called, it creates a single 
//		new pseudorandom-number generator, exactly as if by the expression 

//		We return a float between 0 and 100
//		float x = (float) (Math.random()*100)%100;
		
		for(int i=0; i<size; i++) {
			arr[i] = (float) (Math.random()*100)%100;
		}
		return arr;
	}
	
	public void printFloatArray(float[] farr) {
		String op = "";
		for (float f : farr){
			op = op + f + "\t";
		}
		op = op.substring(0, op.length()-1);
		System.out.println(op);
	}
}
