package Model;

import java.util.Date;
import java.util.Random;


public class Entrada {
	
	private int id;
    private Date dataCompra;
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;
    private double custoUnidade;

    public Entrada() {
        Random generator = new Random();
        setDataCompra(new Date());
        setId(generator.nextInt(1000));
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    
     public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCustoUnidade() {
        return custoUnidade;
    }

    public void setCustoUnidade(double custoUnidade) {
        this.custoUnidade = custoUnidade;
    }

	
	
}
