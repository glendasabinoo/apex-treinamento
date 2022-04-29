import java.util.Scanner;
public class Main {
	    public static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	       Funcionario joao = new Funcionario();
	        joao.celular.setCodPais(55);
	        joao.celular.setDdd(85);
	        joao.celular.setNumero(689098);
	        joao.dadosPessoais();
	        
	        Estoque blusa = new Estoque();
	        blusa.setNomeProduto("regata lisa rosa");
	        blusa.setCategoria("roupas");
	        blusa.setCodProduto(12579);
	        blusa.setQtdProdutos(3);
	        blusa.isPrecisaRepor();
	        blusa.dadosProduto();
	    }
	}

