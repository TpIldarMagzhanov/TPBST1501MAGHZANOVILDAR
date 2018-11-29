import java.util.Scanner;	//Подключаем библиотеку, чтобы в дальнейшем считать число с клавиатуры
public class Primes{

	public static void main(String[] args){
		System.out.println("Vvedite chislo (n)");// Выводим на экран пояснение пользователю
		int n=vvod(null);
		System.out.println("Prostie chisla v zadanom promejutce"); // Выводим на экран пояснение пользователю
		System.out.println("1");// Выводим единицу как априории простого числа
		for (int i=3; i<=n; i++)// Начинаем с 3 т.к. 2 уже простое число
		{
			int o=0;// Флаг
			//Цикл который проходит все значения до заданного пользователем числа
			for (int j=2;j<i;j++)
			{
				// Цикл для проверки числа является ли оно простым, начинается с 2,
				// кончается перед проверяемым числом, так как любое число включая 
				//простое делится само на себя и на "1"
				if (i%j==0)
					o=1;
				// Если число поделилось на что-нибуть кроме себя самого и "1" индификатору
				//присвоим значение отличное от "0", в случае если индефикатор не изменится
				//выводим число, так как оно простое
			}
			if (o==0)
			{
				System.out.println(i);
			}
		}
	}
	public static int vvod(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		return n;
	}
}