package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Algorithmization

   Одномерные массивы

6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
   являются простыми числами.
 */
public class Solution25 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

        double sum = 0;	
		int count = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the array >>");
		int n = Integer.parseInt(reader.readLine());
				
		double [] arr = new double[n];
 
		System.out.println("please fill the array with numbers");
		 
		for (int i = 0; i < n; i++) {
			System.out.println(">>");
			arr[i] = Double.parseDouble(reader.readLine());
		}
		System.out.print("intArray is: ");		

		for (double element : arr){            
		    System.out.print( element + " ");
		}
        System.out.println();
		
		for (int j = 0; j < arr.length; j++) {
			count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum+= arr[j];
			}
		}
		System.out.println(sum);
	}
}



