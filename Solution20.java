package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
2. Algorithmization
    
   Одномерные массивы
  
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Solution20 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int res = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the array >>");
		int n = Integer.parseInt(reader.readLine());
		
		System.out.println("please enter k >>");
		int k = Integer.parseInt(reader.readLine());
				
		int[] intArray = new int[n];
 
		System.out.println("please fill the array with numbers >>");
		 
		for (int i = 0; i < n; i++) {
			System.out.println(">>");
			intArray[i] = Integer.parseInt(reader.readLine());
		}
		System.out.print("intArray is: ");		

		for (int element : intArray){            
		    System.out.print( element + " ");
		    System.out.println();
		}
		
		for (int j = 0; j < intArray.length; j++) {
			if (intArray[j] % k == 0) {
				res += intArray[j];
			}
		}		
		System.out.println("the sum of elements that are multiples of K is: " + res);			 
	}
}
