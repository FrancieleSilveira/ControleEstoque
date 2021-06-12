package View;

import Controller.ProdutoController;
import java.util.Scanner;
import Model.Produto;

public class EditarProduto {
	
	private static Scanner print = new Scanner(System.in);
    private static String codigoProduto;
    private static Produto produto;
    private static String novoCodigo = null;
    private static String novoNome = null;
    private static String novaCategoria = null;
    
    
      public static void renderizar(){
        produto = new Produto();
             
        System.out.println("\nDigite o código do produto");
        codigoProduto = print.next();
        produto = ProdutoController.buscarPorCodigo(codigoProduto);
        if (produto != null){
        	
        	int op;
        	
            do {
                System.out.println("\nSelecione o item a ser editado:");
                System.out.println("1 - Código do produto");
                System.out.println("2 - Nome produto");
                System.out.println("3 - Categoria do produto");
                System.out.println("0 - Voltar");

                op = print.nextInt();
                        
                switch(op){
                    case 1:
                        System.out.println("\nDigite o novo Código do Produto:");
                        novoCodigo = print.next();
                        System.out.println("\nCódigo do produto alterado com sucesso!");
                        break;
                    case 2: 
                        System.out.println("Digite o novo Nome do Produto:");
                        novoNome = print.next();
                        System.out.println("Nome do produto alterado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite a nova Categoria do Produto:");
                        novaCategoria = print.next();
                        System.out.println("Categoria do produto alterada com sucesso!");
                        break;
                    case 0:
                        System.out.println("\nVoltando...");
                        break;
                    default:
                    System.out.println("\nDigite um número válido\n");
                }
                
            } while (op !=0);
            
           ProdutoController.editar(codigoProduto, novoCodigo, novoNome, novaCategoria);
           System.out.println("\nProduto atualizado com sucesso!");
               
        } else{
            System.out.println("\nEste produto não existe!");
        }
    }
}
