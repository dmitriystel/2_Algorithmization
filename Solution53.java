package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Одномерные массивы. Сортировки

8. Даны дроби p1/q1, p2/q2, ..., pn/qn, (pi, qi натуральные). Составить программу, которая 
   приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
*/
public class Solution53 {

	public static void main(String[] args) {
		
		int n = 10;
		
		int [] arrNumerator = new int [n]; 
		int [] arrDenominator = new int [n];
		
		initArray(arrNumerator);	
		initArray(arrDenominator);	
		
		System.out.print("fractions:              ");
		for (int i = 0; i < arrNumerator.length; i++ ) {
			System.out.print(arrNumerator[i] + "/" + arrDenominator[i] + " ");	
		}

		commonDenominator(arrNumerator, arrDenominator, n);
		
		System.out.println();
		System.out.print("with a com denominator: ");
		for (int i = 0; i < arrNumerator.length; i++ ) {
			System.out.print(arrNumerator[i] + "/" + arrDenominator[i] + " ");	
		}
				
		increase(arrNumerator, arrDenominator, n);
		
		System.out.println();
		System.out.print("in ascending order:     ");
		for (int i = 0; i < arrNumerator.length; i++ ) {
			System.out.print(arrNumerator[i] + "/" + arrDenominator[i] + " ");	
		}
		
	}
	
	private static void initArray(int[] array) {

		if (array == null) {
			return;
		}	
		
		Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				array[i] = 1 + rand.nextInt(9);
			}					
	  }	
	
	private static void commonDenominator(int[] numerator,int[] denominator, int n) {
		
		int comDen = denominator[0] - 1;	// 4
		int count = 0;
		int multiplier = 0;
				
		while (count < n) {
			
			comDen++;
			count = 0;
			
			for (int i = 0; i < denominator.length; i++) {
				if(comDen % denominator[i] == 0) {
					count++;
				}
			}
			
		}
		
		for (int j = 0; j < denominator.length; j++ ) {
			
			multiplier = comDen / denominator[j];
			
			numerator[j] = numerator[j] * multiplier;
			denominator[j] = denominator[j] * multiplier;			
		}		
	}
	
	private static void increase(int[] numerator,int[] denominator, int n) {
	
		double [] a = new double [n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (double)numerator[i] / (double)denominator[i];
		}
				
		for (int i = 0; i < a.length; i++) {
			
			int minIndex = 0;
			double min = Double.MAX_VALUE;
			double temp = 0;	
			int temp1 = 0;
			int temp2 = 0;
			
			for (int j = i; j < a.length; j++) {

				if (a[j] < min) {
					min = a[j];
					minIndex = j; 
				}
			}
										
					temp = a[i];
					a[i] = a[minIndex];
					a[minIndex] = temp;
					
					temp1 = numerator[i];
					numerator[i] = numerator[minIndex];
					numerator[minIndex] = temp1;					
					
					temp2 = denominator[i];
					denominator[i] = denominator[minIndex];
					denominator[minIndex] = temp2;												
		}
		
	}
}
