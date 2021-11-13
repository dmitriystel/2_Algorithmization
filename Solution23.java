package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Algorithmization

   Одномерные массивы

4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
*/
public class Solution23 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		int minIndex = 0;
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the array >>");
		int n = Integer.parseInt(reader.readLine());
				
		int[] intArray = new int[n];
 
		System.out.println("please fill the array with numbers");
		 
		for (int i = 0; i < n; i++) {
			System.out.println(">>");
			intArray[i] = Integer.parseInt(reader.readLine());
		}
		System.out.print("intArray is: ");		

		for (int element : intArray){            
		    System.out.print( element + " ");
		}
        System.out.println();
		       
		for (int j = 0; j < intArray.length; j++) {
			if (intArray[j] > max) {
				max = intArray[j];
				maxIndex = j;
			} 					
		}	
					
		for (int k = 0; k < intArray.length; k++) {
			if (intArray[k] <  min) {
				min = intArray[k];
				minIndex = k;
			} 					
		}
		
		int tempMax = max;
		intArray[maxIndex] = min;
		intArray[minIndex] = tempMax; 
		
		System.out.print("newArray is: ");		
		for (int newElement : intArray){            
		    System.out.print( newElement + " ");
		}	
	}
}


