/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY HP
 */import java.util.Scanner;
public class b4 {
    

	public static double PTB1(int a, int b) {
		return (double) (-b) / a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.println(a + "x + " + b + " = 0");
		System.out.println("<=> x = " + PTB1(a, b));
		scanner.close();
	}

}

