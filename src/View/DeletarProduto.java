package View;

import Controller.ProdutoController;
import java.util.Scanner;
import Model.Produto;

public class DeletarProduto {
	
	private static Scanner print = new Scanner(System.in);
    private static String codigoProduto;
    private static Produto produto;
   
    
    
      public static void renderizar(){
        produto = new Produto();
        
        System.out.println("\n");        
        System.out.println("Digite o codigo do produto que deseja deletar");
        codigoProduto = print.next();
        produto = ProdutoController.buscarPorCodigo(codigoProduto);
        if (produto != null){
               if(ProdutoController.deletar(codigoProduto)){
               System.out.println("Produto excluído com sucesso");
           }
        } else{
            System.out.println("Este produto não existe");
        }
      }
}
