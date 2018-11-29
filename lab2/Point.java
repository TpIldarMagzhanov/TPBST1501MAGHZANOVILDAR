public class Point{
	double x;// Абисса первой точки
	double y;// Ордина первой точки
	double x1;// Абцисса второй точки
	double y1;// Ордината второй точки
	double a; // Длинна отрезка
	double b;
	double c;
	double s; // Площадь
	double p;
	public double leight (double x, double y, double x1, double y1)
	{
		a=Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
		return a;
	}
	public double Plo (double a,double b, double c)
	{	
		p=(a+b+c)/2;
		s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
}