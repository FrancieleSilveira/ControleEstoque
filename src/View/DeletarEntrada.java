package View;

import Controller.EntradaController;
import java.util.Scanner;
import Model.Entrada;

public class DeletarEntrada {
	
	  	private static Scanner print = new Scanner(System.in);
	    private static double id;
	    private static Entrada entrada;
	   
	    
	    
	      public static void renderizar(){
	        entrada = new Entrada();
	        System.out.println("\n");        
	        System.out.println("Digite o id da entrada que deseja deletar");
	        id = print.nextDouble();
	        entrada = EntradaController.buscarPorId(id);
	        if (entrada != null){
	               if(EntradaController.deletar(entrada)){
	               System.out.println("Produto excluído com sucesso");
	           }
	        } else{
	            System.out.println("Este produto não existe");
	        }
	      }

}
