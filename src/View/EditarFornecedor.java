package View;

import Controller.FornecedorController;
import java.util.Scanner;
import Model.Fornecedor;

public class EditarFornecedor {
	
	private static Scanner print = new Scanner(System.in);
    private static String cnpj;
    private static Fornecedor fornecedor;
    private static int op;
    private static String novoCnpj = null;
    private static String novoNome = null;
    private static String novoTelefone = null;
    private static String novoEmail = null;
    private static String novoEndereco = null;
    
    
      public static void renderizar(){
        fornecedor = new Fornecedor();
        
        System.out.println("\n");
        System.out.println("Digite o cnpj do fornecedor");
        cnpj = print.next();
        fornecedor = FornecedorController.buscarPorCnpj(cnpj);
        if (fornecedor != null){
            do {
                System.out.println("Selecione o item a ser editado:");
                System.out.println("1 - CNPJ da empresa");
                System.out.println("2 - Nome da empresa");
                System.out.println("3 - Telefone");
                System.out.println("4 - E-mail");
                System.out.println("5 - Endereço");
                System.out.println("0 - Finalizar");

                op = print.nextInt();
                        
                switch(op){
                    case 1:
                        System.out.println("Digite o novo CNPJ:");
                        novoCnpj = print.next();

                        break;
                    case 2: 
                        System.out.println("Digite o novo Nome da empresa:");
                        novoNome = print.next();

                        break;
                    case 3:
                        System.out.println("Digite o novo telefone da empresa:");
                        novoTelefone = print.next();
                        break;
                    case 4:
                        System.out.println("Digite o novo e-mail da empresa:");
                        novoEmail = print.next();
                        break;
                    case 5:
                        System.out.println("Digite o novo endereço da empresa:");
                        novoEndereco = print.next();
                        break;

                     default:
                    System.out.println("1. Digite um numero válido");
                }
            } while (op !=0);
            
           if(FornecedorController.editar(cnpj, novoCnpj, novoNome, novoTelefone, novoEmail, novoEndereco)){
               System.out.println("Fornecedor atualizado com sucesso");
           }
        } else{
            System.out.println("Este produto não existe");
        }
    }

}
