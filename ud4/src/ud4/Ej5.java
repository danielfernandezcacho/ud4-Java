package ud4;

public class Ej5 {

	public static void main(String[] args) {

		int A=1,B=2,C=3,D=4;
		
		//B toma el valor de C
		B=C;
		System.out.println(C);
		//C toma el valor de A
		C=A;
		System.out.println(A);
		//A toma el valor de D
		A=D;
		System.out.println(D);
		//D toma el valor de B
		D=B;
		System.out.println(B);

	}

}
