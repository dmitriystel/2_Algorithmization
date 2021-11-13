package by.introduction.first.leaner1.main;

public class Solution49 {
/*
2. Algorithmization

   Одномерные массивы. Сортировки

4.  Сортировка обменами. Дана последовательность чисел a1 <= a2 <= an.Требуется переставить числа в
    порядке возрастания. Для этого сравниваются два соседних числа
	ai  и ai+ai+1. Если  ai > ai+1. то делается перестановка. Так продолжается до тех пор, пока все 
	элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/
	
	public static void main(String[] args) {

		int temp;
		int count = 0;
		
		int [] arr = {1, 2, 3, 3, 4, 5, 7, 8, 9};
		
		for (int k = 0; k < arr.length; k++) {
			
			for (int l = 0; l < arr.length - 1; l++) {
				
				if (arr[l] < arr[l + 1]) { 
					
					temp = arr[l + 1];
					arr[l + 1] = arr[l];
					arr[l] = temp;
					count++;
				}
			}			
		}
		
        System.out.print("result is: ");  
        
		for (int element : arr){            
		    System.out.print( element + " ");
		}
	    System.out.println();
	    System.out.println("number of permutations is: " + count);
	}
}
