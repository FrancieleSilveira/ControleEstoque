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
	        System.out.println("\n Cadastre o Fornecedor \n");

	        System.out.println("Digite o CNPJ:");
	        fornecedor.setCnpj(print.next());

	        System.out.println("Digite o nome da Empresa:");
	        fornecedor.setEmpresa(print.next());

	        System.out.println("Digite um numero para contato:");
	        fornecedor.setTelefone(print.next());

	        System.out.println("Digite um email:");
	        fornecedor.setEmail(print.next());

	        System.out.println("Digite um endereço:");
	        fornecedor.setEndereço(print.next());

	        if(FornecedorController.cadastrar(fornecedor)) 
	        {
	            System.out.println("\n Fornecedor cadastrado com sucesso!");
	        }
	        else 
	        {
	            System.out.println("Esse fornecedor já existe!");
	        }
	    }

}
