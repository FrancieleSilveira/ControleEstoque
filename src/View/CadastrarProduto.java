package View;

import Controller.ProdutoController;
import java.util.Scanner;
import Model.Produto;

public class CadastrarProduto {

	 private static Produto produto;
	    private static Scanner print = new Scanner(System.in);
	    
	    public static void renderizar() {
	    	 produto = new Produto();
	         
	         System.out.println("\n");
	         System.out.println("\n-- CADASTRAR PRODUTO --  \n");
	         System.out.println("Digite o codigo do produto:");
	         produto.setCodigoProduto(print.next());
	         System.out.println("Digite o nome do produto:");
	         produto.setNomeProduto(print.next());
	         System.out.println("Digite a categoria do produto:");
	         produto.setCategoriaProduto(print.next());
	         
	         if(ProdutoController.cadastrar(produto)) {
	             System.out.println("\nProduto cadastrado com sucesso!");
	         }else {
	             System.out.println("Esse produto já existe!");
	         }
	     }
}

	    

