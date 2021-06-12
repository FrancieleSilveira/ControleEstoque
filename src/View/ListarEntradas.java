package View;

import Controller.EntradaController;
import Model.Entrada;

public class ListarEntradas {
	public static void renderizar(){
	    System.out.println("\n");
	    System.out.println("-- Lista de entradas --");
	        
	    for(Entrada entradaCadastrada: EntradaController.listar()){
	        System.out.println("\n");
	        System.out.println("Data: "+entradaCadastrada.getDataCompra());
	        System.out.println("ID: "+entradaCadastrada.getId());
	        System.out.println("Produto: "+entradaCadastrada.getProduto().getNomeProduto());
	        System.out.println("Fornecedor: "+entradaCadastrada.getFornecedor().getEmpresa());
	        System.out.println("Quantidade: "+entradaCadastrada.getQuantidade());
	        System.out.println("Custo unit�rio: "+entradaCadastrada.getCustoUnidade());
	    }
	    
	    }

}
