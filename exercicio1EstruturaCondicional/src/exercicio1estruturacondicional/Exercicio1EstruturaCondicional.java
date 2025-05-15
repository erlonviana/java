
package exercicio1estruturacondicional;

import javax.swing.JOptionPane;

public class Exercicio1EstruturaCondicional {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Insira o seu nome: ");
        double numeroConta = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o numero da conta: "));
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o Saldo Medio: "));
        CategoriaCliente cli = new CategoriaCliente(nome, numeroConta, saldoMedio);
        cli.verificaSaldo();

    }
    
}
