package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization
 
   Одномерные массивы. Сортировки
 
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
   Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, 
   при этом не используя дополнительный массив.
 */
public class Solution46 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the first array, n >>");		
		int n = Integer.parseInt(reader.readLine());
		
		System.out.println("please enter the number of cells in the second array, m >>");
		int m = Integer.parseInt(reader.readLine());
		
		System.out.println("k >>");
		int k = Integer.parseInt(reader.readLine());
				
		int [] arr_1 = new int[n];	
		int [] arr_2 = new int[m];	
		
		int count = 0;
		
		initArray(arr_1);
		initArray(arr_2);

		int [] res = new int [arr_1.length + arr_2.length];
		
		for (int i = 0; i < res.length; i++) {
			if (i < (k - 1)) { 
				res[i] = arr_1[i]; 
				count++; 
			} else if (i >= k - 1 && i <= count + arr_2.length -1) { 
				res[i] = arr_2[i - count]; 
			} else if (i > count + arr_2.length - 1) {
				res[i] = arr_1[i - arr_2.length];
			}			
		}
						                 		
        System.out.print("first array is: ");  		
		for (int element : arr_1){            
		    System.out.print( element + " ");
		}
        System.out.println(); 
		
        System.out.print("second array is: ");  		
		for (int element : arr_2){            
		    System.out.print( element + " ");
		}
		
        System.out.println(); 
        
        System.out.print("result is: ");  		
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
				arr[i] = rand.nextInt(10);
		}					
	}	
}

