
public class Estoque 
{
	private double codProduto;
	private String nomeProduto;
	private int qtdProdutos;
	private String categoria;
	private boolean precisaRepor;
	
	public Estoque(int cod, String n, int qtd, String cat, boolean repor) {
		this.codProduto = cod;
		this.nomeProduto = n;
		this.qtdProdutos = qtd;
		this.categoria = cat;
		this.precisaRepor = repor;
	}
	
	public Estoque() 
	{}

	public double getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(double codProduto) {
		this.codProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQtdProdutos() {
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isPrecisaRepor() {
		if(qtdProdutos <= 3) 
		{
			this.precisaRepor = true;
			System.out.println("Produto precisa de reposição!");
		} else {
			this.precisaRepor = false;
			System.out.println("Produto em estoque");
		}
		return precisaRepor;
	}

	public void setPrecisaRepor(boolean precisaRepor) {
		this.precisaRepor = precisaRepor;
	}
	
	public void dadosProduto() 
	{
		System.out.println("Nome: " + nomeProduto);
		System.out.println("Código do produto: " + codProduto);
		System.out.println("Categoria do produto: " + categoria);
		System.out.println("Quantidade em estoque: " + qtdProdutos);
	}
}
