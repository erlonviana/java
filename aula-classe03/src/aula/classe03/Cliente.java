package aula.classe03;



public class Cliente {

    private String nome;
    private String end;
    private String rg;

    public Cliente() {
    }

    public Cliente(String nome, String end, String rg) {
        this.nome = nome;
        this.end = end;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
    public void cadastrarCliente(String nome, String end, String rg){
        
        setNome(nome);
        setEnd(end);
        setRg(rg);       
    }
    
    public void listarCliente(){
        System.out.println("O cliente " + getNome() + " mora em: " + getEnd() + " e seu RG eh: " + getRg());
    }
}

