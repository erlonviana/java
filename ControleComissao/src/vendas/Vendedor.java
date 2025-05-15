package vendas;

import javax.swing.JOptionPane;


public class Vendedor {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public Vendedor(String nome, double salarioBase, double valorVendido, double novoSalario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public Vendedor() {
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

public void cadastrarSalarioBase (){
double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario base: "));
setSalarioBase(salario);
}

public void cadastrarNome(){
String n = JOptionPane.showInputDialog("Digite seu nome: ");
setNome(n);
}

public double calculoComissao(double valorVendido){
    this.setNovoSalario(((valorVendido*10)/100) + this.getSalarioBase());
    return this.novoSalario;
}

public void cadastrarValorVendido(){
double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor vendido: "));
setValorVendido(valor);
}
}