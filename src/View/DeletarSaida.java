package View;

import java.util.Scanner;

import Controller.SaidaController;
import Model.Saida;

public class DeletarSaida {
	
	private static Scanner print = new Scanner(System.in);
    private static double id;
    private static Saida saida;
    
     public static void renderizar(){
        saida = new Saida();
        
        System.out.println("\n");
        System.out.println("Digite o id da sa�da que deseja deletar");
        id = print.nextDouble();
        saida = SaidaController.buscarPorId(id);
        if (saida != null){
               if(SaidaController.deletar(saida)){
               System.out.println("Produto exclu�do com sucesso");
           }
        } else{
            System.out.println("Este produto n�o existe");
        }
      }

}
