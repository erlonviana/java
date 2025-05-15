
package aula.classe04;

public class Fornecedores {
    
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedores() {
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarFornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto){
        setNomeFornecedor(nomeFornecedor);
        setNomeProduto(nomeProduto);
        setDescricaoProduto(descricaoProduto);
                
        
}
    
}