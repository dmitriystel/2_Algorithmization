package by.introduction.first.leaner1.main;
/*2. Algorithmization

     Одномерные массивы

10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый 
    второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив 
    не использовать.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Solution29 {

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
		
		 for (int i = 0; i < arr.length; i++) {
			 if(i % 2 != 0) {
				 arr[i] = 0;
			 }
		 } 
	        System.out.println();  		 
	        System.out.print("array is:     ");  		
			for (int element : arr){            
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