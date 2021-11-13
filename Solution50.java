package by.introduction.first.leaner1.main;
/*
2. Algorithmization

   Одномерные массивы. Сортировки

5.  Сортировка вставками. Дана последовательность чисел a1 ,a2 , ...,an. Требуется переставить 
    числа в порядке возрастания. Делается это следующим образом. Пусть a1 ,a2 ,... ,ai - 
    упорядоченная последовательность, т. е. a1 <= a2 <=... an. Берется следующее число ai+1 и 
    вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. 
    Процесс производится до тех пор, пока все элементы от i +1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть 
    производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/
public class Solution50 {

	public static void main(String[] args) {

		int [] array = {4, 2, 7, 5, 3, 7, 3, 6, 8, 4, 9};
		int temp = 0;	
		
		for (int i = 0; i < array.length - 1; i++ ) { 		
			if (i < 2) { 
				if (array[i] > array[i + 1]) {												
					temp = array[i + 1];		
					array[i + 1] = array[i];
					array[i] = temp;
				}						
			} else if (i > 1 && array[i] < array[i - 1]) {
																													 															
				int insert = array[i];	
											
				int a = binarySearch(array, i); 
								
				for (int j = a, moving = i ; j < i; j++, moving--) { 
					array[moving] = array[moving - 1];					
				}
				array[a] = insert;			
			}			
		}
		
		for (int element : array){            
		    System.out.print( element + " ");
		}		
	}
        
	public static int binarySearch(int[] array, int index) {
        int firstIndex = 0;    
        int lastIndex = index; 
        int insert1 = array[index]; 
        int middle = 0; 
       
        while (array[index - 1] > insert1 ) { 
        												
            middle = (firstIndex + lastIndex) / 2; 
            	if (middle == 0) {
            		middle++;
            	}          
            if (array[middle - 1] <= insert1 && insert1 <= array[middle] ) { 
                index = middle; 
            } else if (array[middle - 1 ] < insert1 && array[middle] < insert1) {
                firstIndex = middle;
            } else if (array[middle - 1] > insert1 && array[middle] > insert1 ) {
                lastIndex = middle - 1;
            }
        }
        return index; 
    }
}

