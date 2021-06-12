package Model;

import java.util.Date;
import java.util.Random;

public class Saida {
	
	private double id;
    private Date criadoEm;
    private Produto produto;
    private int QntdProduto;
    private int ValorProduto;
    
    
     public Saida() {
        Random generator = new Random();
        setCriadoEm(new Date());
        setId(generator.nextInt(1000));
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQntdProduto() {
        return QntdProduto;
    }

    public void setQntdProduto(int QntdProduto) {
        this.QntdProduto = QntdProduto;
    }

    public int getValorProduto() {
        return ValorProduto;
    }

    public void setValorProduto(int ValorProduto) {
        this.ValorProduto = ValorProduto;
    }
 
	

}
