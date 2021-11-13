package by.introduction.first.leaner1.main;
/*
2. Algorithmization

   Одномерные массивы

9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
   Если таких чисел несколько, то определить наименьшее из них. 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Solution28 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("the number of cells in the array >>");
		
		int n = Integer.parseInt(reader.readLine());
		
		int frequency = 0;
		int maxFreq = 0;
		int res = 0;
		
		int [] arr = new int[n];
		
		initArray(arr);

        System.out.print("array is:     ");  		
		for (int element : arr){            
		    System.out.print( element + " ");
		}
		
	        for (int i = 0; i < arr.length - 1; i++) {
	        	frequency = 0;
	        	for (int j = i + 1; j < arr.length; j++)	
	            if (arr[i] == arr[j]) {
	            	frequency++;
	            	
	            	if (frequency > maxFreq) {
		            	res = arr[i];
	            	} else if (frequency == maxFreq) {
	            		if (arr[i] < res) {
	            			res = arr[i];
	            		}
	            	}
	            }
	        }
	        
	        System.out.println();	        	      			
        System.out.println("result: " + res);              
	}
		
	private static void initArray(int[] arr) {
		if (arr == null) {
			return;
		}
		
		Random rand = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rand.nextInt(1000);
			}					
	}
}

