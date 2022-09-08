package com.br.marcus.console;


import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) {
		/*System.out.println("===================Bem vindo ao mundo a java!=============");
		//SpringApplication.run(LogicaApplication.class, args);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome?");
		String nome = sc.nextLine();
		System.out.println("Seja Bem Vindo, "+nome+"!");
		*/
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos  = new ArrayList<Produto>();
		ArrayList<Pedido> pedidos  = new ArrayList<Pedido>();
		int x;
		do{
			System.out.println("===================Bem vindo aa Loja do Sr. Miagui!=============");
			System.out.println("Menu: \n1- Cadastrar produtos: \n2- Realizar compras: \n3- Relatório de vendas: \n4- Relatorio de pedidos: \n5- Sair.");
			x = sc.nextInt();
			switch (x) {
				case 1:
				System.out.println("Quantos Produtos deseja inserir?");
				int quantidade = sc.nextInt();
				Produto produto = new Produto();
				for(int i = 0; i < quantidade; i++){
					System.out.println("Digite o nome do produto:");
					String nome = sc.next();
					produto.setNomeProduto(nome);
					System.out.println("Digite o codigo do produto:");
					int cod = sc.nextInt();
					produto.setCodigoProduto(cod);
					System.out.println("Digite a quantidade do produto:");
					int quant = sc.nextInt();
					produto.setQuantidadeProduto(quant);
					System.out.println("Digite o valor do produto:");
					Double valor = sc.nextDouble();
					produto.setValorProduto(valor);
					produtos.add(produto);
				}
					break;
				case 2:
				System.out.println("Digite seu nome:");
				String nome = sc.next();
				System.out.println("Digite seu cpf:");
				int cpf = sc.nextInt();
				Cliente cliente = new Cliente();
				cliente.setCodigoCliente(cpf);
				cliente.setNomeCliente(nome);
				Pedido pedido = new Pedido();
				System.out.println("Digite o codigo do Pedido:");
				int codPedido = sc.nextInt();
				pedido.setCodigoPedido(codPedido);
				System.out.println("Deseja acrescentart quantos produtos?");
				quantidade = sc.nextInt();
				for(int i = 0; i < quantidade; i++){
					System.out.println("Digite o codigo do produto:");
					int cod = sc.nextInt();
					System.out.println("Digite a quantidade do produto:");
					quantidade= sc.nextInt();
					boolean resultado = false;
					for(int j = 0; j < produtos.size(); j++){
						if(produtos.get(j).getCodigoProduto() == cod){
							pedido.ProdutoPedido.add(produtos.get(i));
							double valorPedido = pedido.getValorPedido() + (produtos.get(i).getValorProduto()*quantidade);
							pedido.setValorPedido(valorPedido);
							pedidos.add(pedido);
							produtos.get(j).setQuantidadeProduto(produtos.get(j).getQuantidadeProduto()-quantidade);
							resultado = true;
						}
					}
					if(resultado){
						System.out.println("Codigo do produto invalido!");
					}
					
				}

					break;
				case 3: 
				System.out.println("Lista de Pedidos:");
					for(int i = 0; i < pedidos.size(); i++){
						System.out.println("Pedido: "+pedidos.get(i).getCodigoPedido()+"\nCliente: "+pedidos.get(i).getClientePedido()+"\nValor do Pedido: "+pedidos.get(i).getValorPedido());
						
					}
					break;
				case 4:
				System.out.println("Lista de Produtos:");
					for(int i = 0; i < produtos.size(); i++){
						System.out.println("Produto: "+produtos.get(i).getNomeProduto()+"\nQuantidade: "+produtos.get(i).getQuantidadeProduto()+"\nValor do produto: "+produtos.get(i).getValorProduto());
					}
					break;
				case 5: 
				System.out.println("Saindo do programa!");
				break;
				default:
					break;
			}
			x = sc.nextInt();
		}while(x!=5);
	}
}
