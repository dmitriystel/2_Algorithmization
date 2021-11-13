package by.introduction.first.leaner1.main;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

15. Найти все натуральные n-значные числа, цифры в которых образуют строго
*/
public class Solution68 {

	public static void main(String[] args) {

		int [] a = {1234, 5642, 6789, 3221, 2589, 4567, 3232, 1568, 1479, 3258, 4891, 2459, 6541};

		 System.out.println(increase(a)); 
	}
	
	private static String increase(int [] a) {
		
		String s = "";
				
		int lastDigit  = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			int num = a[i];
			int count = 0; 
			int arr [] = new int [4];
						
			for (int j = 0; j < arr.length; j++) {
				
				lastDigit = num % 10;	
				num = num /10;	
				
				arr[arr.length - 1 - j] = lastDigit; 
			}
			
			for (int k = 0; k < arr.length - 1; k++) {
				for (int l = k + 1; l < arr.length; l++) {
					if (arr[k] < arr[l]) {
						count++;
					}					
				}
			}
			
			if (count >= 3) {
				s += a[i] + " ";
			}
						
			arr = null;						
		}
				
		return s;
	}
}
