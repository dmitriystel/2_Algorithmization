package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его 
   площади, если угол между сторонами длиной X и Y — прямой.
*/
public class Solution62 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int x = 5 + rand.nextInt(20);
		int y = 5 + rand.nextInt(20);
		int z = 5 + rand.nextInt(20);
		int t = 5 + rand.nextInt(20);
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		System.out.println("t: " + t);
				
		System.out.println("s: " + s(x, y, z, t));				
	}

	private static double s(double x, double y, double z, double t) {
		
		double s1 = 0; 
		double s2 = 0; 
		double res = 0; 
		double c = 0; 
				
		s1 = (double) 1/2 *  x * y;
		
		c = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) ); 		
		s2 = (double) 1/4 * Math.sqrt(  (4 * Math.pow(z, 2) * Math.pow(t, 2)) - Math.sqrt( Math.pow(z,2)) + Math.pow(t, 2) + Math.pow(c, 2)); 
		
		res = s1 + s2;
				
		return res;
	}	
}
