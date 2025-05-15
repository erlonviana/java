package aula.classe03;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu endereco: ");
        String end = entrada.nextLine();

        System.out.println("Digite seu rg: ");
        String rg = entrada.nextLine();

        cliente.cadastrarCliente(nome, end, rg);

        cliente.listarCliente();
        
        
        
        
        entrada.close();
    }
    
  

}
