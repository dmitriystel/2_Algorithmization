package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 
    (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где 
    n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
*/
public class Solution66 {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		int n = 2 + rand.nextInt(23); 
		
		int [] a = new int [50]; 
		initArray(a);

		System.out.print("array: ");
		
		for (int elem : a) {
			System.out.print(elem + " ");
		}
		
		System.out.println();
		
		System.out.println("print numbers from the array from " + n + " to " + 2 * n);

		System.out.print("new array: ");
		
		int [] twins = twinPrime(a, n);
								
		for (int elem : twins) {
			System.out.print(elem + " ");
		}		
	}

	private static void initArray(int[] a) {

		if (a == null) {
			return;
		}		

			for (int i = 0; i < a.length; i++) {
				a[i] = i;
			}					
	  }	
	
	private static int [] twinPrime(int[] a, int n) {
				
		int numOfElem = 0;	
		int numOfElem2 = 0;

		for (int i = 2; i < a.length; i++) {
			int count = 0; 
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}				
			}
			if (count == 0) {
				numOfElem++; 
			}
		}

		int [] primeNumber = new int [numOfElem]; 
 
		int l = 0;
		for (int i = 2; i < a.length; i++) {
			int count = 0;
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}				
			}
			if (count == 0) { 
				primeNumber[l] = a[i];
				l++;	 
			}						
		}
	
		for (int p = 0; p < primeNumber.length - 1; p++) {

			for (int r = p + 1; r < primeNumber.length; r++) {
				if (primeNumber[p] + 2 == primeNumber[r]) {
					numOfElem2 += 2;
				}
			}
		}
		
		int [] twinPrimeNumber = new int [numOfElem2]; 	
		
		int index = 0;
		for (int p1 = 0; p1 < primeNumber.length - 1; p1++) {

			for (int r1 = p1 + 1; r1 < primeNumber.length; r1++) {
				if (primeNumber[p1] + 2 == primeNumber[r1]) {
					twinPrimeNumber[index] = primeNumber[p1];
					twinPrimeNumber[index + 1] = primeNumber[r1];
					index += 2; 
				}
			}
		}
			
		int numOfElem3 = 0; 
		
		int count = 0;
		
		for (int x = 0; x < twinPrimeNumber.length; x++ ) {
			for (int y = n; y < 2 * n; y++) {
				if (twinPrimeNumber[x] == a[y]) {
					count++;						
				}
			}
						
		}
		
		if (count % 2 != 0) {
			numOfElem3 = count - 1;
		} else numOfElem3 = count;
				
		int [] res = new int [numOfElem3]; 
		
		int elem = 0;
				
		for (int x = 0; x < twinPrimeNumber.length; x++ ) {
			for (int y = n; y < 2 * n; y++) {
				if (twinPrimeNumber[x] == a[y] && elem != res.length) {
										
					res[elem] = twinPrimeNumber[x];
					elem++;
				}
			}
						
		}	
		
		return res;
	} 	
}
