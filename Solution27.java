package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
2. Algorithmization

   Одномерные массивы

8. Дана последовательность целых чисел a1, a2,..., an. Образовать новую последовательность, выбросив 
   из исходной те члены, которые равны min (a1, a2,..., an)  
*/
public class Solution27 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("the number of cells in the array >>");
		
		int n = Integer.parseInt(reader.readLine());
				
		int [] arr = new int[n];
		
		initArray(arr);

        System.out.print("array is:     ");  		
		for (int element : arr){            
		    System.out.print( element + " ");
		}
		
			int min = Integer.MAX_VALUE;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	        	if (arr[i] == min) {
	        		count++; 
	        	}	        	
	        }
	        	        
			int [] res = new int[n - count];        
	        
			for (int i =0; i < res.length; i++) {
	            
	            if (arr[i] == min) {
	                res[i]=arr[i+1];
	            } else  {
	                res[i]= arr[i];	        
	            }	            
	        }	    			
        System.out.println();
               
        System.out.print("new array is: ");  		
		for (int element : res){            
		    System.out.print( element + " ");
		}
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
