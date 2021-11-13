package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Одномерные массивы. Сортировки

6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
   Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, 
   то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются 
   на один элемент назад. Составить алгоритм этой сортировки.
*/
public class Solution51 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the array, n >> ");		
        int n = Integer.parseInt(reader.readLine());
						
		int [] array = new int[n];	

		int i = 0; 
		
		initArray(array);
						                 		
        System.out.print("array is:     ");  		
		for (int element : array){            
		    System.out.print( element + " ");
		}
        System.out.println(); 
              
        int count = 0;

        while (count != array.length) {
        	int temp = 0;
        	count = 1;
        
        	while (array[i] <= array[i + 1] && i < array.length - 1) {  
        		i++;        				                	
        		}    
        
        	while (array[i] > array[i + 1]) { 
        	
        		temp = array[i];
        		array[i] = array[i + 1];
        		array[i + 1] = temp;
        	
        		if (i != 0) {
        			i--;  // 3) 1  	
        		    }        	    		
        		}  
        
            for (int j = 0; j < array.length - 1; j++) {
            	if (array[j] <= array[j + 1]) {
            		count++;
            	}
            	
            	if (count == array.length){
            		
            		System.out.print("new array is: ");  		
            		for (int element : array){            
            		    System.out.print( element + " ");
            		}            		
            	}            	        	
          }          	
    } 	      
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
}


