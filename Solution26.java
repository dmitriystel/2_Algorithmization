package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
2. Algorithmization

   Одномерные массивы

7. Даны действительные числа a1, a2, ... , an. 
   Найти max(a1 + a2n, a2 + a2n-1, ... , an +an+1).
*/

public class Solution26 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the array");
		
		int n = Integer.parseInt(reader.readLine());
				
		int [] arr = new int[n];	
		
		initArray(arr);

        System.out.print("array is: ");  		
		for (int element : arr){            
		    System.out.print( element + " ");
		}
		
        System.out.println();  
        System.out.println("answer is: " + getMaxSum(arr));
        
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
	
	public static int getMaxSum(int[] arr) {
        int maxSum = arr[0] + arr[arr.length - 1];
        for (int i = 1; i < arr.length / 2; i++) {
            if ((arr[i] + arr[arr.length - i - 1]) > maxSum) {
                maxSum = arr[i] + arr[arr.length - i - 1];
            }
        }
        return maxSum;        
    }
}
