package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/
public class Solution59 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int a = 2 + rand.nextInt(100);
		int b = 2 + rand.nextInt(100);
		int c = 2 + rand.nextInt(100);
		
		System.out.println("given three numbers: " + a + ", " + b + ", " + c );
		
		System.out.println("Are these integers coprime?");
		
		System.out.println(coprimeIntegers(a, b, c));
		
	}
	
	private static boolean coprimeIntegers(int a, int b, int c) {
		
		int min = 0;
		int count = 0; 
		
		if (a <= b && a <= c) {
			min = a; 
		} else if (b <= a && b <= c) {
			min = b; 
		} else if (c <= a && c <= b) {
			min = c; 
		}
		
		for (int i = 2; i < min; i++) {
			
			if (a % i == 0 && b % i == 0 && c % i == 0 ) {
				count++;
			}  
		}		
		return count == 0;		
	 }
}
