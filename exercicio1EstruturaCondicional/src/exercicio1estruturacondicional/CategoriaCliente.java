package exercicio1estruturacondicional;

import javax.swing.JOptionPane;

public class CategoriaCliente {
    private String nome;
    private double numeroConta;
    private double saldoMedia;

    public CategoriaCliente(String nome, double numeroConta, double saldoMedia) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedia = saldoMedia;
    }

    public CategoriaCliente() {
    }

    public String getNome() {
        return nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoMedia() {
        return saldoMedia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoMedia(double saldoMedia) {
        this.saldoMedia = saldoMedia;
    }
    
    public void verificaSaldo(){
        if(getSaldoMedia() < 1000){
            JOptionPane.showMessageDialog(null, "Cliente Comum");
        }
        else if(getSaldoMedia() >= 1000 && getSaldoMedia() < 2500) {
        JOptionPane.showMessageDialog(null, "Cliente Prata");
        } else {
    JOptionPane.showMessageDialog(null, "Cliente Ouro");
}
    JOptionPane.showMessageDialog(null, getSaldoMedia());
}
    }