package View;

import Controller.ProdutoController;
import java.util.Scanner;
import Model.Produto;

public class DeletarProduto {

	private static Scanner print = new Scanner(System.in);
	private static Produto produto;

	public static void renderizar(){
		
		produto = new Produto();
   
		System.out.println("\nDigite o codigo do produto que deseja deletar");
		String codigoProduto = print.next();
		produto = ProdutoController.buscarPorCodigo(codigoProduto);
		if (produto != null){
			if(ProdutoController.deletar(codigoProduto)){
				System.out.println("\nProduto exclu�do com sucesso");
			}
		} else{
			System.out.println("\nEste produto n�o existe");
		}
	}
}
