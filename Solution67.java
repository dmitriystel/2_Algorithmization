package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
    возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения 
    задачи использовать декомпозицию.
*/
public class Solution67 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int k = rand.nextInt(10000000);
		
		System.out.println("Armstrong numbers from 1 to " + k + ":");
		
		int [] arr = armstrongNum(k);
		
		for (int elem : arr) {
			System.out.print(elem + " ");	
		}
	}

	private static int [] armstrongNum(int k) {

		int lastDigit = 0; 
		int lastDigit1 = 0;
		int numberOfcells1 = 0; 
		
		int [] arr;	
		int [] arr1;	
		
		for (int i = 1; i <= k; i++) {	
			
			int n = 0; 
			int num = i; 
			int num1 = i; 
			
			while (num > 0) {	
				
				num /= 10; 
				n++; 
					
			}
	
			arr = new int [n];	
			
			for (int j = 0; j < arr.length; j++) {
				
				lastDigit = num1 % 10;	
				num1 = num1 /10;	
				
				arr[arr.length - 1 - j] = lastDigit;	
												
			}
						
			int res1 = 0; 
			for (int l = 0; l < arr.length; l++) { 
				res1 += (int) Math.pow(arr[l], n);
			}
			
			if (res1 == i) {
				numberOfcells1++;				
			}						

			arr = null;	
			
		}
		
		int [] array = new int [numberOfcells1];
	
				
		int index = 0; 
		for (int i1 = 1; i1 <= k; i1++) {
			
			int n1 = 0; 
			int num2 = i1; 
			int num3 = i1; 

		
			while (num2 > 0) {	// i = 123
				num2 /= 10; // 12  
				n1++; // 1
			}
					
			arr1 = new int [n1];	
			
			for (int j = 0; j < arr1.length; j++) {
				lastDigit1 = num3 % 10;	
				num3 = num3 /10;	
				
				arr1[arr1.length - 1 - j] = lastDigit1;	
	 		}
		
			int res2 = 0; 
			for (int l1 = 0; l1 < arr1.length; l1++) { 
				res2 += (int) Math.pow(arr1[l1], n1);
			}
			
				if (res2 == i1) {
					
					array[index] = i1;
					index++;
				}
			
				arr1 = null;			
		}		
		return array;
	}	
}
