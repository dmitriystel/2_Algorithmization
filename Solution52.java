package by.introduction.first.leaner1.main;
/*
2. Algorithmization

   Одномерные массивы. Сортировки

7. Пусть даны две неубывающие последовательности действительных чисел
   a1 <= a2 <= an и b1 <= b2 <= bm.
   Требуется указать те места, на которые нужно вставлять элементы последовательности m
   b1 <= b2 <= bm 
   в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
*/
public class Solution52 {

	public static void main(String[] args) {

		int [] array1 = {1, 3, 5, 6, 7, 9};
		int [] array2 = {2, 4, 8};
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				
				if (j == 0) {
					if (array2[i] <= array1[j]) {
						System.out.println(array2[i] + " insert before index " + j + " in array1");	
						
					} else if(array2[i] >= array1[j] && array2[i] <= array1[j + 1] ) {
						System.out.println(array2[i] + " insert after index " + j + " in array1");
					}
										
				} else if (j == array1.length - 1) {
					if (array2[i] > array1[j]) {
						System.out.println(array2[i] + " insert after index " + j + " in array1");
					}
				} else if (j != 0 && j != array1.length - 1) {
					if(array2[i] >= array1[j] && array2[i] <= array1[j + 1] ) {
						System.out.println(array2[i] + " insert after index " + j + " in array1");
					}					
				}
			}		
		}
	}
}
