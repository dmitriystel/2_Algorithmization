package by.introduction.first.leaner1.main;

import java.util.Random;
/* 
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего 
   кратного двух натуральных чисел:
*/
public class Solution54 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
				
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("greatest common divisor is " + calculateGreatestCommonDivisor(a, b));
		System.out.println("least common multiple is " + calculateLeastCommonMultiple(a, b));		
	}
	
	private static int calculateGreatestCommonDivisor(int a, int b) {
		int result = 0; 
		
		if (a <= b) {
			for (int i = a; i > 0; i--) {
				if (a % i == 0 && b % i == 0){
					result = i;
					break;
				}
			}
			
		} else if (b <= a) {
			for (int i = b; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					result = i; 
					break;
				}
			}
		}
		return result;				
	  }	
	
	private static int calculateLeastCommonMultiple(int a, int b) {
		int result = 1;
		
		while (true) {
			result++;
			if (result % a == 0 && result % b == 0)
				break;			
		}
		
		return result;		
	}		
}
