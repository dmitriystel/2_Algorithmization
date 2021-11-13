package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

8. Задан массив D. Определить следующие суммы:
   D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
   Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных 
   элементов массива с номерами от k до m.
*/
public class Solution61 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int n = 50;
		int k = rand.nextInt(47);
		int m = k + 2;
		
		System.out.println("the number of cells in the array: " + n );

		int [] arr = new int[n];
		
		initArray(arr);
		
		System.out.print("array: ");
		
		for (int elem : arr ) 
		
		System.out.print(elem + " ");
		
		System.out.println();
		
		System.out.print("sums of three consecutively arranged array elements from " + k  + " to " + m + ": ");
		
		System.out.println(sumOfThreeConsecutiveElements (arr, k, m));
	}
	
	private static void initArray(int[] arr) {

		if (arr == null) {
			return;
		}
		
		Random rand = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rand.nextInt(10);
			}					
	  }	
	
	private static int sumOfThreeConsecutiveElements (int[] arr, int k, int m) {
		
		int res = 0; 
		
		for (int i = k; i <= m; i++ ) {
			res += arr[i];
		}		
		return res;
	}
}
