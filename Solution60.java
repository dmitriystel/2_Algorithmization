package by.introduction.first.leaner1.main;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/
public class Solution60 {

	public static void main(String[] args) {
		
		int n = 9;
		
		System.out.println(calculateSumOfFactorialsOfEvenNumbers(n));		
	}
	
	private static int calculateSumOfFactorialsOfEvenNumbers(int n) {
		
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			int factorial = 1;
			if (i % 2 == 0) {
				
				for (int j = 1; j <= i; j++) {
					factorial *= j ;
				}				
				result += factorial;				
			}			
		}		
		return result;
	}
}
