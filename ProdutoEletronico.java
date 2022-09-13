package JavaPOO;

public class ProdutoEletronico {
	
	/*Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console.*/
	
	//declaração dos atributos
	
	private String nomeProduto;
	private String marca;
	private String cor;

	public ProdutoEletronico (String nomeProduto, String marca, String cor) {
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.cor = cor;		
	}
	
	//declaração dos demais métodos da classe

	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprimirInfo() {
		System.out.println("Produto: "+nomeProduto+" / marca: "+marca+" / cor: "+cor);
	}
	
	
	
	
	

}
