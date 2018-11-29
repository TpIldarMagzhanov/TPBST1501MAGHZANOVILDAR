import java.util.Scanner; // Библиотека для ввода данных
import java.util.Arrays;// Библиотека для создания массивов
public class Polidrom{

	public static void main(String[] args) {		
		System.out.println("Vvedite stroky ");// Выводим на экран пояснение пользователю
		String number1=vvod(null);// Вкладываем в переменную строку введеную пользователем
		int p=0;// Флаг, показзывающий выполнение условия
		number1=number1.replace(" ","");// Удаляем ненужные знаки
		number1=number1.replace(",","");
		number1=number1.replace(".","");
		char[] mass=number1.toCharArray();// Создаем массив из букв
		int i=0;// Создаем счетчик(начало)
		int j=mass.length-1; // Создаем счетчик с конца
		for (; i<=mass.length && j>=0; i++,j--)// Массив для перебора букв
			if (mass[i]!=mass[j])// Сравнение
				p=1;// Флаг
		if (p==0) // Условие вывода
			System.out.println ("Polindrom"); else
		System.out.println ("NE Polindrom");
		//System.out.println (number1);
    } 
    public static String vvod(String[] args){
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		return n;
	}
}