package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
    Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать 
    декомпозицию.
*/
public class Solution70 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(1000);
		
		System.out.println("given number: " + num);
		System.out.println("result: " + numberOfSubtractions(num));
	}

	private static int numberOfSubtractions(int num) {
		
		int res = 0;
		
		while (num > 0) { 
			int n = num; 
			int lastDigit = 0; 
			int sum = 0; 
		
			while (n > 0) { 
			
				lastDigit = n % 10;	
				n = n /10; 
			
				sum += lastDigit ;  			
			}
			
			num -= sum; 
			res++; 		
		}		
		return res;
	}
}
