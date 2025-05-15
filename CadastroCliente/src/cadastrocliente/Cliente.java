package cadastrocliente;

public class Cliente {
    private String nome;
    private String endereco;
    private String rg;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
    }

    public void cadastrarCliente(String nome, String endereco, String rg) {
        setNome(nome);
        setEndereco(endereco);
        setRg(rg);
    }

    public void listarCliente() { 
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("RG: " + getRg());
    }
}
