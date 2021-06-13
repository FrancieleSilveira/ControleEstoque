package View;

import java.util.Scanner;

import Controller.SaidaController;
import Model.Saida;

public class DeletarSaida {

	private static Scanner print = new Scanner(System.in);
	private static Saida saida;

	public static void renderizar(){
		
		saida = new Saida();

		System.out.println("\nDigite o ID da sa�da que deseja deletar");
		int id = print.nextInt();
		saida = SaidaController.buscarPorId(id);
		if (saida != null){
			if(SaidaController.deletar(saida)){
				System.out.println("\nRegistro de sa�da exclu�do com sucesso");
			}
		} else{
			System.out.println("\nUm registro de sa�da com este ID n�o existe");
		}
	}
}
