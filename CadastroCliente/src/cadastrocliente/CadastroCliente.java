/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrocliente;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CadastroCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.cadastrarCliente("Erlon", "Rua Ponta Grossa 92", "446960160");
        cliente.listarCliente();
        
        Cliente cli = new Cliente();
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o seu RG: ");
        String rg = teclado.nextLine();
        System.out.println("Digite o endereco: ");
        String endereco = teclado.nextLine();
        
        cli.cadastrarCliente(nome, endereco, rg);
        
        System.out.println("***********\n*************\n*************");
        
        cli.listarCliente();
        
        
        
        
    }
    
}
