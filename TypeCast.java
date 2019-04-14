public class TypeCast {
public static void main ( String [] args ) {

	int I = 1000;
	long L = 5000;
	double D = 7.0;

	I = (int)(D * 0.5); // risultato : I=3
	System.out.println(I);
	
	I=(int)L; // risultato : I =5000
	System.out.println(I);
		
	L=(long)(D * 0.5); // risultato : L=3
	System.out.println(L);
	
	D=(double)(5/2); // risultato : D =2.0
	System.out.println(D);
	
	D=(double)5/(double)2; // risultato : D =2.5
	System.out.println(D);
	
	D=(double)5/2; // risultato : D =2.5
	System.out.println(D);
	
	}
}
