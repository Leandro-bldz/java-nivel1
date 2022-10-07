/**
 * <h1>Paridade</h1>
 * Programa que faz a checagem da paridade de um número informado.
 *
 *
 * @author balde
 * @version 1.0
 * @since 07-10-2022
 *
 */

import Java.util.Scanner;

public class Paridade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = new int;
		// Inicio
		System.out.println("Paridade de um número");
		System.out.println("Informe um número: ");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}
	}
}
