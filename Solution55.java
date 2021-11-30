package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
*/
public class Solution55 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
		int c = rand.nextInt(100);
		int d = rand.nextInt(100);
				
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
		System.out.println("d is " + d);
		System.out.println("greatest common divisor is " + calculateGreatestCommonDivisor(a, b, c, d));		
	}
	
	private static int calculateGreatestCommonDivisor(int a, int b, int c, int d) {
		int result = 0; 
		int min = a;  
		
		int [] array = {a, b, c, d};
		
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}				
		}						
			for (int i = min; i > 0; i--) {
				if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0){
					result = i;
					break;
				}
			}
					
		return result;				
	  }			
}

