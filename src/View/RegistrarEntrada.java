package View;

import Controller.EntradaController;
import Controller.FornecedorController;
import Controller.ProdutoController;
import java.util.Scanner;
import Model.Entrada;
import Model.Fornecedor;
import Model.Produto;

public class RegistrarEntrada {
	
	private static Scanner print = new Scanner(System.in);
    private static Entrada entrada;
    private static String nomeProduto;
    private static String cnpj;
    private static Fornecedor fornecedor;
    private static Produto produto;
    
    
      public static void renderizar(){
        produto = new Produto();
        entrada = new Entrada();
        
        System.out.println("\n");
        System.out.println("Digite o nome do produto");
        nomeProduto = print.next();
        produto = ProdutoController.buscarPorNome(nomeProduto);
        if (produto != null){
            entrada.setProduto(produto);
            
            System.out.println("Digite o CNPJ do fornecedor");
            cnpj = print.next();
            fornecedor = FornecedorController.buscarPorCnpj(cnpj);
                if (fornecedor != null){
                    entrada.setFornecedor(fornecedor);

                    System.out.println("Digite a quantidade a ser inserida no estoque");
                    entrada.setQuantidade(print.nextInt());

                    System.out.println("Digite o valor unitário do produto");
                    entrada.setCustoUnidade(print.nextInt());

                    if (EntradaController.registrar(entrada)){
                        System.out.println("Novos produtos foram adicionados ao estoque");
                }
            }else{
                System.out.println("Este fornecedor não está cadastrado");
            }
            
        } else{
            System.out.println("Este produto não existe");
        }
    }
    

}
