package by.introduction.first.leaner1.main;

import java.util.Random;

public class Solution63 {
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого 
    являются цифры числа N.
*/
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = 1000000 +  rand.nextInt(1000000000);
		
		System.out.println("number is: " + n);
		
		int [] array = arrCreating(n);
				
		System.out.print("array is: ");
		
		for (int elem : array) {
			System.out.print(elem + " ");			
		}				
	}

	private static int [] arrCreating(int n) {
		int num = n; 
		int m = 0; 
		int res = 0; 
				
		while (num > 0) {
			num /= 10;
			m++;
		}
				
		int [] arr = new int [m];
				
		for (int i = 0; i < arr.length; i++) {
			res = n % 10;
			n = n /10; 
			
			arr[arr.length - 1 - i] = res;
 		}
		
	return arr; 	
	} 	
}
