package View;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int op;
        Scanner print = new Scanner(System.in);
        
        do{
        	System.out.println("\n".repeat(2));
            System.out.println("-- Projeto de Vendas -- ");
            System.out.println("\n Digite uma opção:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Alterar produto");
            System.out.println("4. Excluir produto");
            System.out.println("5. Cadastrar Fornecedor");
            System.out.println("6. Listar Fornecedores");
            System.out.println("7. Alterar Fornecedor");
            System.out.println("8. Excluir Fornecedor");
            System.out.println("9. Registrar entrada");
            System.out.println("10. Listar entradas");
            System.out.println("11. Excluir entrada");
            System.out.println("12. Registrar Saída");
            System.out.println("13. Listar saídas");
            System.out.println("14. excluir Saída");
            System.out.println("15. Visualizar Controle de estoque");
            System.out.println("0. Sair");
            

            op = print.nextInt();
            
             switch(op){
                case 1:
                    CadastrarProduto.renderizar();
                    break;
                case 2: 
                    ListarProdutos.renderizar();
                    break;
                case 3:
                    EditarProduto.renderizar();
                    break;
                case 4:
                    DeletarProduto.renderizar();
                    break;
                case 5:
                    CadastrarFornecedor.renderizar();
                    break;
                case 6:
                    ListarFornecedores.renderizar();
                    break;
                case 7:
                    EditarFornecedor.renderizar();
                    break;
                case 8:
                    DeletarFornecedor.renderizar();
                    break;
                case 9:
                    RegistrarEntrada.renderizar();
                    break;
                case 10:
                    ListarEntradas.renderizar();
                    break;
                case 11:
                    DeletarEntrada.renderizar();
                    break;
                case 12:
                    RegistrarSaida.renderizar();
                    break;
                case 13:
                    ListarSaidas.renderizar();
                    break;
                case 14:
                    DeletarSaida.renderizar();
                    break;
                case 15:
                    MostrarControleEstoque.renderizar();
                    break;
                case 0:
                    System.out.println("Aplicação finalizada.");
                    break;
                    
                 default:
                	System.out.println("1. Digite um numero válido");
                break;
             }
            
            
        } while (op != 0);
        
        print.close();
    }
	
	
	}


