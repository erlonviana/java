
package classes02;

import java.util.Scanner;

public class Passagem {

    Scanner entrada = new Scanner(System.in);
    
    private String nomePassageiro;
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numpoltrona;    

    public Passagem() {
    }

    public Passagem(String nomePassageiro, String telefone, String rg, String localViagem, String data, String horario, String numpoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.rg = rg;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numpoltrona = numpoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumpoltrona() {
        return numpoltrona;
    }

    public void setNumpoltrona(String numpoltrona) {
        this.numpoltrona = numpoltrona;
    }
    
    public void cadastrarDadosPassageiro(){
        
        System.out.println("Digite seu nome: ");
        nomePassageiro = entrada.next();
        this.nomePassageiro = nomePassageiro;
        
        System.out.println("Digite seu numero de telefone: ");
        telefone = entrada.next();
    
        System.out.println("Informe seu RG: ");
        rg = entrada.next();
    }
    
    public void cadastrarDadosPassagem(){
        
        System.out.println("Informe o local da viagem: ");
        localViagem = entrada.next();
        
        System.out.println("Informe a data da viagem: ");
        data = entrada.next();
        
        System.out.println("Informe o horario da viagem: ");
        horario = entrada.next();
        
        System.out.println("Digite o numero da poltrona: ");
        numpoltrona = entrada.next();
    }
    
    public void mostrarDadosPassagem(){
        
        System.out.println("Senhor " + this.nomePassageiro + ", seu destino sera para: " + this.localViagem + ", a data da viagem sera: " + this.data + "; sua viagem sera as: " + this.horario + "; O seu numero na poltrona sera: " + this.numpoltrona);
        
    }
    
}

