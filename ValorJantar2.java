/**
 * <h1>ValorJantar2</h1>
 * Programa refatorado com o uso do JOptionPane.
 *
 *
 * @author balde
 * @version 1.0
 * @since 06-10-2022
 *
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ValorJantar2 {
  public static void main(String[] args) {
    // Declaração da taxa constante (gorjeta)
    final taxa = 0.1;
    // Declaração de variáveis
    double preco;
    double total;
    // Início
    preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do jantar: "));
    total = preco + preco*taxa;
    System.out.println("Valor da taxa do garçom: "+taxa*preco);
    System.out.println("Valor total do jantar: "+total);
  }
}
