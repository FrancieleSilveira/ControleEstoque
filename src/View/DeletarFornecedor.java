package View;

import Controller.FornecedorController;
import java.util.Scanner;
import Model.Fornecedor;

public class DeletarFornecedor {
	
	 private static Scanner print = new Scanner(System.in);
	    private static String cnpj;
	    private static Fornecedor fornecedor;
	   
	    
	    
	      public static void renderizar(){
	        fornecedor = new Fornecedor();
	        System.out.println("\n");        
	        System.out.println("Digite o CNPJ do fornecedor que deseja deletar");
	        cnpj = print.next();
	        fornecedor = FornecedorController.buscarPorCnpj(cnpj);
	        if (fornecedor != null){
	               if(FornecedorController.deletar(cnpj)){
	               System.out.println("Fornecedor excluído com sucesso");
	           }
	        } else{
	            System.out.println("Este fornecedor não existe");
	        }
	      }
	

}
