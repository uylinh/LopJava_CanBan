/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY HP
 */
import java.util.Scanner;

public class b3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Notification: ");
		String string = scanner.nextLine();

		do {
			System.out.print("n =");
			n = scanner.nextInt();
		} while (n < 0);
		for (int i=0; i<n; i++) {
			b2.Notification(string);
		}

		scanner.close();
	}

}