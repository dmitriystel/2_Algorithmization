package by.introduction.first.leaner1.main;

import java.io.IOException;
/*
2. Algorithmization

   Одномерные массивы. Сортировки

2.  Даны две последовательности
	a1 <= a2 <= ... <= an � b1 <= b2 <= ... <= bm
 	Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 	Примечание. Дополнительный массив не использовать.
*/
public class Solution47 {

	public static void main(String[] args) throws NumberFormatException, IOException {
						
		int [] arr_1 = {1, 3, 3, 5, 7, 9};	
		int [] arr_2 = {2, 4, 6, 8};	
		
		int temp = Integer.MAX_VALUE;
		
		int [] res = new int [arr_1.length + arr_2.length];
		
		int index = 0;
		
		for (int i = 0; i < arr_1.length; i++) {
			res[index] = arr_1[i];
			index++;
			}
		
		for (int j = 0; j < arr_2.length; j++) {
			res[index] = arr_2[j];
			index++;
			}
		
		for (int k = 0; k < res.length - 1; k++) {
			for (int l = k + 1; l < res.length; l++) {
				if (res[k] > res[l]) { 
					temp = res[l];
					res[l] = res[k];
					res[k] = temp;
				}
			}			
		}
		
        System.out.print("result is: ");  		
		for (int element : res){            
		    System.out.print( element + " ");
		}       
	}			
}


