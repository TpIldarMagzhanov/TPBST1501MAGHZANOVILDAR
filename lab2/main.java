import java.util.Scanner;
public class main {
	public static void main (String[] args){
		System.out.println("Vvedite Chislo coordinaty");
		Point s=new Point();
		double x=vvod(null);
		double y=vvod(null);
		double x1=vvod(null);		
		double y1=vvod(null);
		double x2=vvod(null);
		double y2=vvod(null);
		s.a=s.leight(x,y,x1,y1);	
		s.b=s.leight(x1,y1,x2,y2);
		s.c=s.leight(x2,y2,x,y);
		s.s=s.Plo(s.a,s.b,s.c);
		System.out.println(s.s);
	}
		public static double vvod(String[] args){
			Scanner in=new Scanner(System.in);
			double n=in.nextInt();
			return n;
		}
}