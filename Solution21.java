package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
2. Algorithmization
    
   Одномерные массивы
    
2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, 
   большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Solution21 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int res = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the array >>");
		int n = Integer.parseInt(reader.readLine());
		
		System.out.println("please enter z >>");
		int z = Integer.parseInt(reader.readLine());
				
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
			if (intArray[j] > z) {
				intArray[j] = z;
				res++;
			}						
		}					
		System.out.print("newArray is: ");		
		for (int newElement : intArray){            
		    System.out.print( newElement + " ");
		}
		System.out.println();			
		System.out.println("number of replacements: " + res);			
	}
}
