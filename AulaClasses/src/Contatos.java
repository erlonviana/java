
import java.util.Scanner;

public class Contatos {
    
    Scanner entrada = new Scanner (System.in);
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public Contatos() {
        
    }
    
    

    public Contatos(String nome, String telefone, String endereco, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void cadastrarDados(){
        
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        this.nome = nome;
        
        this.telefone = telefone;
         System.out.println("Digite seu telefone: ");
        telefone = entrada.next();
        
        this.endereco = endereco;
         System.out.println("Digite seu endereco: ");
        endereco = entrada.next();
        
        this.cidade = cidade;
         System.out.println("Digite sua cidade: ");
        cidade = entrada.next();
       
        
    }
    
    public void mostrarDados(){
        
        System.out.println("Dados do Contato \n" + "Nome: " + this.nome + "\nTelefone:" + this.telefone + "\nEndereço: " + this.endereco + "\nCidade: " + this.cidade);
        
    }
       
}

