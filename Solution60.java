package by.introduction.first.leaner1.main;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/
public class Solution60 {

	public static void main(String[] args) {
		
		int n = 9;
		
		System.out.println(sumOfFactorialsOfEvenNumbers(n));		
	}
	
	private static int sumOfFactorialsOfEvenNumbers(int n) {
		
		int res = 0;
		
		for (int i = 1; i <= n; i++) {
			int factorial = 1;
			if (i % 2 == 0) {
				
				for (int j = 1; j <= i; j++) {
					factorial *= j ;
				}				
				res += factorial;				
			}			
		}		
		return res;
	}
}
