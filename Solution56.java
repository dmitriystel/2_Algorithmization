package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади 
   треугольника.
*/
public class Solution56 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int a = rand.nextInt(10);
				
		System.out.println("the side of a regular hexagon is " + a);
		System.out.println("the area of a regular hexagon is " + s(a));
	}
	
	private static double s(int a) {	
		
		return (((3 * Math.sqrt(3)) / 2) * Math.pow(a, 2));		
	}
}
