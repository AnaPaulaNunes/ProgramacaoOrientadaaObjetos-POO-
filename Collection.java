package JavaPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		
	int op;
	Scanner leia = new Scanner(System.in);
	
	List <String> estoque = new ArrayList<String>();
	
	do {
		System.out.println("\n**************************************************************");
		System.out.println("\n\t\tBem vindo ao menu de opções do Estoque.");
		System.out.println("\n(1)Deseja adicionar um produto no estoque?");
		System.out.println("\n(2)Deseja remover algum produto do estoque?");
		System.out.println("\n(3)Deseja atualizar algum produto do estoque?");
		System.out.println("\n(4)Deseja mostrar a lista com os produtos do estoque?");
		System.out.println("\n(0)Deseja sair do menu de opções?");
		System.out.println("\nDigite qual a sua opção: ");
		op = leia.nextInt();
		System.out.println("\n**************************************************************");
		
		switch(op) {
		case 1:
			leia.nextLine();
			System.out.println("\nDigite o nome do produto que deseja adicionar ao estoque: ");
			String produto = leia.nextLine();
			
			estoque.add(produto);
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\nDigite o nome do produto que deseja remover do estoque: ");
			String produto1 = leia.nextLine();
			if(estoque.contains(produto1)) {
				estoque.remove(produto1);
			}
			else {
				System.out.println("\nProduto não encontrado no estoque.");
				
			}
			System.out.println("\n");
			System.out.println(estoque);
			break;
			
		case 3:
			leia.nextLine();
			System.out.println("\nDigite o nome do produto que deseja atualizar no estoque: ");
			String verifica = leia.nextLine();
			System.out.println("\nDigite o nome do produto que entrará no lugar do "+verifica+ ":");
			String novo = leia.nextLine();
			if (estoque.contains(verifica)){
				estoque.remove(verifica);
				estoque.add(novo);
			}
			else {
				System.out.println("\nProduto não encontrado no estoque!");
			}
			System.out.println("\n");
			System.out.println(estoque);
			break;
			
		case 4:
			leia.nextLine();
			System.out.println("\nOs produtos do estoque são: \n");
			System.out.println(estoque);
			break;
			
		case 0:
			System.out.println("\nAgradecemos por utilizar nosso sistema!");
			break;
			default:
				System.out.println("\nEsta opção é inválida!");
				
			}
		
	}	
		while(op != 0);
	
	}
}