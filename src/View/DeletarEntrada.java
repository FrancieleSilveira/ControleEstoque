package View;

import Controller.EntradaController;
import java.util.Scanner;
import Model.Entrada;

public class DeletarEntrada {

	private static Scanner print = new Scanner(System.in);
	private static int id;
	private static Entrada entrada;

	public static void renderizar(){
		
		entrada = new Entrada();
		        
		System.out.println("\nDigite o ID da entrada que deseja deletar");
		id = print.nextInt();
		entrada = EntradaController.buscarPorId(id);
		if (entrada != null){
			if(EntradaController.deletar(entrada)){
				System.out.println("\nRegistro de entrada deletado com sucesso");
			}
		} else{
			System.out.println("\nUm registro de entrada com este ID n�o existe");
		}
	}
}
