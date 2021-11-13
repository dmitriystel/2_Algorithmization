package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

5. Составить программу, которая в массиве A[N] находит второе по величине число 
   (вывести на печать число, которое меньше максимального элемента массива, но больше 
    всех других элементов).
*/
public class Solution58 {

	public static void main(String[] args) {

		Random rand = new Random();
		int n = 5 + rand.nextInt(15);
		System.out.println("the number of cells in the array: " + n );

		int [] arr = new int[n];
		
		initArray(arr);
 		
        System.out.print("array is:     ");  
        
		for (int element : arr){            
		    System.out.print( element + " ");
		}
        System.out.println();
        
        
        System.out.println("the second largest number: " + secondMax(arr));
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
	
	private static int secondMax(int[] arr) {
		int max = arr[0];  
		int max2 = arr[0];
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];					
				}
			}			
		}
		
		for (int k = 0; k < arr.length - 1; k++) {
			for (int l = 1; l < arr.length; l++) {
				if (max2 < arr[l] && arr[l] < max) {
					max2 = arr[l];
				}
			}
		}		
		return max2;		            
	}
}
