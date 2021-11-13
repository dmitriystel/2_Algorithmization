package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
    являются числа, сумма цифр которых равна К и которые не большее N.
*/
public class Solution65 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int k = 10 +  rand.nextInt(5);
		int n = 5 +  rand.nextInt(5);
		
		System.out.println("k number is: " + k);
		System.out.println("n number is: " + n);
		
		String [] a = new String[10];

		initArray(a, k, n);
 		
        System.out.print("array is: ");  
        
		for (String element : a){            
		    System.out.print( element + " ");
		}
	}
	
	private static void initArray(String[] a, int k, int n) {

		int digit = 0;
		
		if (a == null) {
			return;
		}	
		
		Random rand = new Random();
		
			for (int i = 0; i < a.length; i++) {
				
				int lastDigit = k;
				String elem = "";
				
				while (lastDigit > n) { 
				
				digit = rand.nextInt(n);
				lastDigit -= digit;
				
				elem += digit;
				
				}
				
				elem += lastDigit;
				
				a[i] = elem;
			}					
	  }
}
