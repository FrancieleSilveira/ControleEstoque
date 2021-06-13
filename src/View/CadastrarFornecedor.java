package View;

import Controller.FornecedorController;
import java.util.Scanner;
import Model.Fornecedor;

public class CadastrarFornecedor {
	
   	 private static Fornecedor fornecedor;
	 private static Scanner print = new Scanner(System.in);

	 public static void renderizar() {

		 fornecedor = new Fornecedor();

		 System.out.println("\n");
		 System.out.println("\n-- CADASTRAR FORNECEDOR --\n");
		 System.out.println("Digite o CNPJ:");
		 String cnpj = print.next();
		 if (FornecedorController.buscarPorCnpj(cnpj) == null) {
			 fornecedor.setCnpj(cnpj);
			 System.out.println("Digite o nome da Empresa:");
			 fornecedor.setEmpresa(print.next());
			 System.out.println("Digite um n�mero para contato:");
			 fornecedor.setTelefone(print.next());
			 System.out.println("Digite um email:");
			 fornecedor.setEmail(print.next());
			 System.out.println("Digite um endere�o:");
			 fornecedor.setEndere�o(print.next());

			 FornecedorController.cadastrar(fornecedor);
			 System.out.println("\nFornecedor cadastrado com sucesso!");
		 
		 }else {
			 System.out.println("\nUm fornecedor com este CNPJ j� existe!");
		 }
	 }
}
