package Controller;

import java.util.ArrayList;
import Model.Produto;


public class ProdutoController {
	
	private static ArrayList<Produto> produtos = new ArrayList<>();
    
    
    //Cadastrar
        public static void cadastrar(Produto produto){
        	produtos.add(produto);
        }
    
    //Listar todos os produtos
        public static ArrayList<Produto> listar(){
        return produtos;
    }
        
     
    //Procurar produto por nome 
       public static Produto buscarPorNome(String nome){
        for(Produto produtoCadastrado: produtos){
            if (produtoCadastrado.getNomeProduto().equals(nome)){
                return produtoCadastrado;
            }
        }

        return null;    
    }
       
    //Procurar produto por c�digo
       public static Produto buscarPorCodigo(String codigoProduto){
        for(Produto produtoCadastrado: produtos){
            if (produtoCadastrado.getCodigoProduto().equals(codigoProduto)){
                return produtoCadastrado;
            }
        }

        return null;    
    }
       
    //Editar produto
        public static Boolean editar (String codigoProduto, String novoCodigo, String novoNome, String novaCategoria) {
            for(Produto produtoCadastrado: produtos) {
                if(produtoCadastrado.getCodigoProduto().equals(codigoProduto)) {
                    if(novoCodigo != null){
                        produtoCadastrado.setCodigoProduto(novoCodigo);
                    }
                    if(novoNome != null){
                        produtoCadastrado.setNomeProduto(novoNome);
                    }
                    if(novaCategoria != null){
                        produtoCadastrado.setCategoriaProduto(novaCategoria);
                    }
                    return true;
                }
                
            }
            return false;
        }
        
    //deletar produto
        public static Boolean deletar(String codigoProduto){ 
          for(Produto produtoCadastrado: produtos) {
                if(produtoCadastrado.getCodigoProduto().equals(codigoProduto)) {
                produtos.remove(produtoCadastrado);
                return true;
                }
        }
        return false;
        }

}
