/**
 * <h1>ValorJantar2</h1>
 * Programa que soma o valor de um jantar informado com a gorjeta do garçon (10%).
 *
 *
 * @author balde
 * @version 1.0
 * @since 06-10-2022
 *
 */

import java.util.Scanner;

public class ValorJantar {
  public static void main(String[] args) {
    // Declaração da taxa constante
    final taxa = 0.1;
    // Declaração de variáveis
    double preco;
    double total;
    // Nomeação do Scanner
    Scanner teclado = new.Scanner(System.in);
    // Início
    System.out.println("Informe o preço do jantar: ");
    preco = teclado.nextDouble();
    total = preco + preco*taxa;
    System.out.println("Valor da taxa do garçom: "+taxa*preco);
    System.out.println("Valor total do jantar: "+total);
  }
}
