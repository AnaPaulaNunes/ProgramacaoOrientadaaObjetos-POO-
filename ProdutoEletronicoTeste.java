package JavaPOO;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
	
		//instanciando a minha classe ProdutoEletronico
		
		ProdutoEletronico produto1 = new ProdutoEletronico("Smartphone","Apple","Vermelho");
		ProdutoEletronico produto2 = new ProdutoEletronico("Smart TV","Panasonic","Preta");
		ProdutoEletronico produto3 = new ProdutoEletronico("Notebook","Samsung","Prata");
		
		
		produto1.imprimirInfo();
		System.out.println("\n");
		produto2.imprimirInfo();
		System.out.println("\n");
		produto3.imprimirInfo();
		System.out.println("\n");
		System.out.println("\t\t Mudança realizadas: ");
		System.out.println("\n");
		produto2.setCor("Branco");
		produto2.imprimirInfo();
		System.out.println("\n");
		produto1.setMarca("Motorola");
		produto1.imprimirInfo();
		System.out.println("\n");
		produto3.setNomeProduto("Laptop");
		produto3.imprimirInfo();
		
			

	}

}
