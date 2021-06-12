package View;

import Controller.EntradaController;
import Controller.ProdutoController;
import Controller.SaidaController;
import Model.Entrada;
import Model.Produto;
import Model.Saida;

public class MostrarControleEstoque {
	
		
	    private static double custoTotal;
	    private static double receitaTotal;
	    private static double lucroPrejuizo;
	    private static int totalComprados;
	    private static int totalSaida;
	    
	    public static void renderizar(){
	    
	    for(Produto produtoCadastrado: ProdutoController.listar()){
	        for(Entrada entradaCadastrada: EntradaController.listar()){
	            if ((entradaCadastrada.getProduto()) == (produtoCadastrado)){
	                custoTotal = EntradaController.valorGasto(entradaCadastrada);
	                totalComprados = EntradaController.quantidadeEntradas(entradaCadastrada);
	                
	            }                    
	                
	        } 
	        for(Saida saidaCadastrada: SaidaController.listar()){
	            if ((saidaCadastrada.getProduto()) == (produtoCadastrado)){
	                receitaTotal = SaidaController.valorTotal(saidaCadastrada);
	                totalSaida = SaidaController.quantidadeSaidas(saidaCadastrada);
	            }
	                
	        }
	        lucroPrejuizo = receitaTotal - custoTotal;
	        System.out.println("\n");
	        System.out.println("Produto: "+produtoCadastrado.getNomeProduto());
	        System.out.println("Custo Total: "+custoTotal);
	        System.out.println("Entradas: "+totalComprados);
	        System.out.println("Sa�das: "+totalSaida);
	        System.out.println("Quantidade em estoque: "+produtoCadastrado.getQntdEstoque());
	        System.out.println("Receita Total: "+receitaTotal);
	        System.out.println("Lucro/Prejuizo: "+lucroPrejuizo);
	        
	        
	        }
	            
	        
	    }
	}


