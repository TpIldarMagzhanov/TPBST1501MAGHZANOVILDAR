import java.util.Scanner;
public class laba1{

	public static void main(String[] args){
			System.out.println("Vvedite Chislo 1 ili 2");
		int n=vvod(null);
		switch(n)
		{
			case 1:
				Primes.main(null);
				break;
			case 2:
				Polidrom.main(null);
				break;
			default: System.out.println ("neverno");
		}
	}
	public static int vvod(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		return n;
	}
}