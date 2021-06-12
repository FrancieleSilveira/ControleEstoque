package Model;

import java.util.Date;

public class Produto {
	
	private String codigoProduto;
    private String nomeProduto;
    private String categoriaProduto;
    private int qntdEstoque;
    private Date criadoEm;

    public Produto() {
        setCriadoEm(new Date());
        this.qntdEstoque = 0; 
        
    }
    

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(int qntdEstoue) {
        this.qntdEstoque = qntdEstoue;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }
	

}
