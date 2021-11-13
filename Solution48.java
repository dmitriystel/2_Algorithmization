package by.introduction.first.leaner1.main;

public class Solution48 {
/*
2. Algorithmization

   Одномерные массивы. Сортировки

3. 	Сортировка выбором. Дана последовательность чисел a1 >= a2 >= an. Требуется переставить элементы
    так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается 
    наибольший элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная 
    со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
	*/
	public static void main(String[] args) {

		int temp = Integer.MIN_VALUE;
		
		int [] arr = {1, 2, 3, 3, 4, 5, 7, 8, 9};
		
		for (int k = 0; k < arr.length - 1; k++) {
			for (int l = k + 1; l < arr.length; l++) {
				if (arr[k] < arr[l]) { 
					temp = arr[l];
					arr[l] = arr[k];
					arr[k] = temp;
				}
			}			
		}
		
        System.out.print("result is: ");  		
		for (int element : arr){            
		    System.out.print( element + " ");
		}  
	}
}
