package View;

import Controller.ProdutoController;
import java.util.Scanner;
import Model.Produto;

public class EditarProduto {
	
	private static Scanner print = new Scanner(System.in);
    private static String codigoProduto;
    private static Produto produto;
    private static int op;
    private static String novoCodigo = null;
    private static String novoNome = null;
    private static String novaCategoria = null;
    
    
      public static void renderizar(){
        produto = new Produto();
        
        System.out.println("\n");        
        System.out.println("Digite o codigo do produto");
        codigoProduto = print.next();
        produto = ProdutoController.buscarPorCodigo(codigoProduto);
        if (produto != null){
            do {
                System.out.println("Selecione o item a ser editado:");
                System.out.println("1 - Codigo do produto");
                System.out.println("2 - Nome produto");
                System.out.println("3 - Categoria do produto");
                System.out.println("0 - Finalizar");

                op = print.nextInt();
                        
                switch(op){
                    case 1:
                        System.out.println("Digite o novo Codigo do Produto:");
                        novoCodigo = print.next();

                        break;
                    case 2: 
                        System.out.println("Digite o novo Nome do Produto:");
                        novoNome = print.next();

                        break;
                    case 3:
                        System.out.println("Digite a nova Categoria do Produto:");
                        novaCategoria = print.next();
                        break;

                     default:
                    System.out.println("1. Digite um numero válido");
                }
            } while (op !=0);
            
           if(ProdutoController.editar(codigoProduto, novoCodigo, novoNome, novaCategoria)){
               System.out.println("Produto atualizado com sucesso");
           }
        } else{
            System.out.println("Este produto não existe");
        }
    }


}
