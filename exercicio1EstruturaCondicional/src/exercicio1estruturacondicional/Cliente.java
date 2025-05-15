
package exercicio1estruturacondicional;


public class Cliente {
private String nome;
private double numeroConta;
private double saldoMedia;

    public Cliente() {
    }

    public Cliente(String nome, double numeroConta, double saldoMedia) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedia = saldoMedia;
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

public void verificarSaldo(){
        System.out.println("Cliente: " + getNome());
        System.out.println("Saldo da conta: " + getSaldoMedia());

}
}

