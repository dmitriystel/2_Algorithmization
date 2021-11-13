package by.introduction.first.leaner1.main;

import java.util.Random;
/* 
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного 
   двух натуральных чисел:
*/
public class Solution54 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
				
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("gcd is " + gcd(a, b));
		System.out.println("lcm is " + lcm(a, b));		
	}
	
	private static int gcd(int a, int b) {
		int res = 0; 
		
		if (a <= b) {
			for (int i = a; i > 0; i--) {
				if (a % i == 0 && b % i == 0){
					res = i;
					break;
				}
			}
			
		} else if (b <= a) {
			for (int i = b; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					res = i; 
					break;
				}
			}
		}
		return res;
				
	  }	
	
	private static int lcm(int a, int b) {
		int res = 1;
		
		while (true) {
			res++;
			if (res % a == 0 && res % b == 0)
				break;			
		}
		
		return res;		
	}		
}
