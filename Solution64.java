package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
*/
public class Solution64 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 10000000 +  rand.nextInt(1000000000);
		int m = 100000 +  rand.nextInt(1000000);
		System.out.println("number one is: " + n);
		System.out.println("number two is: " + m);
		
		if (calculateNumOfDigits(n, m) > 0) {
			if (calculateNumOfDigits(n, m) == n) {
				System.out.println(n + " contains more digits");
			} else if (calculateNumOfDigits(n, m) == m) {
				System.out.println(m + " contains more digits");
			}
		} else if (calculateNumOfDigits(n, m) == 0) {
			System.out.println("number contains the same number of digits");
		}		
	}
	
	private static int calculateNumOfDigits(int n, int m) {
		
		int num1 = n; 
		int num2 = m;		
		int count1 = 0; 
		int count2 = 0;
		int result = 0; 
				
		while (num1 > 0) {
			num1 /= 10;
			count1++;
		}
		
		while (num2 > 0) {
			num2 /= 10;
			count2++;
		}
		
		if (count1 > count2) {
			result = n; 
		} else if (count1 < count2) {
			result = m; 
		} else if (count1 == count2) {
			result = 0;
		}		
	return result; 	
	} 
}


