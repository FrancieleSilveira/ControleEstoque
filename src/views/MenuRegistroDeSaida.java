package views;

import java.util.Scanner;

public class MenuRegistroDeSaida {
	
	private static Scanner print = new Scanner(System.in);

	public static void renderizar() {

		int op;

		do {
			System.out.println("\n".repeat(2));
			System.out.println("-- MENU REGISTRO DE SA�DAS --");
			System.out.println("\n1. Cadastrar novo registro de sa�da");
			System.out.println("2. Listar registros de sa�da");
			System.out.println("3. Excluir registro de sa�da");
			System.out.println("0. Voltar ao menu anterior");
			System.out.println("\nDigite a op��o desejada: ");
			op = print.nextInt();

			switch (op) {
			case 1:
				RegistrarSaida.renderizar();
				break;
			case 2:
				ListarSaidas.renderizar();		
				break;
			case 3:
				DeletarSaida.renderizar();
				break;
			case 0:
				System.out.println("\nVoltando...");
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}

		} while (op != 0);
	}
}