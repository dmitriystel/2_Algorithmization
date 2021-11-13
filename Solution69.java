package by.introduction.first.leaner1.main;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
    Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать 
    декомпозицию.
*/
public class Solution69 {

	public static void main(String[] args) {

		int [] a = {1235, 1234, 7953, 2587, 7539, 2468, 1753, 8462, 7733, 8648, 1953, 8842, 9371};
		
		int res = sumOfNumContainOddNum(a);
				
		System.out.println("sum of numbers containing odd digits: " + res);
		
		System.out.println("the number of even digits in the found sum: " + numOfEvenDigits(res));
		
	}

	private static int sumOfNumContainOddNum(int [] a) {
		
		int [] arr = new int[4];
		int sum = 0;
		int lastDigit = 0;
		int num = 0; 
		
		for (int i = 0; i < a.length; i++) {
		
			num = a[i];
			int odd = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				lastDigit = num % 10;	
				num = num /10;	
				
				arr[arr.length - 1 - j] = lastDigit; 											
			}
			
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] % 2 != 0) {
					odd++;
				}
			}
			
			if (odd == 4) {
				sum += a[i];
			}
		}		
		
		return sum;
	}
	
	private static int numOfEvenDigits(int res) {
		
		int quantity = 0;
		int lastDigit = 0;
				
		while (res > 0) {
		
			lastDigit = res % 10;	
			res = res /10;	
			
			if (lastDigit % 2 == 0) {
				quantity++;
			}
		}
				
		return quantity;
	}
}
