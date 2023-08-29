package ago29;

public class Variables {

	public static void main(String[] args) {
		int variable1 = 5;
		char variable2 = 'c';
		double variable3 = 3.1416;
		String variable4 = "Antonio";

		System.out.println("La variable1 = " +variable1);
		System.out.println("La variable2 = " +variable2);
		System.out.println("La variable3 = " +variable3);
		System.out.println("La variable4 = " +variable4);
		
		System.out.println("");
		
		System.out.printf("La variable1 = %d\n", variable1);
		System.out.printf("La variable2 = %c\n", variable2);
		System.out.printf("La variable3 = %f\n", variable3);
		System.out.printf("La variable4 = %s\n", variable4);
		
		System.out.println("");

		System.out.println("variable1 = " + variable1 + " variable2 = " + variable2 + " variable3 = " + variable3 + " variable4 = " + variable4);
		System.out.printf("variable1 = %d variable2 = %c variable3 = %f variable4 = %s",variable1,variable2,variable3,variable4);
	}
}
