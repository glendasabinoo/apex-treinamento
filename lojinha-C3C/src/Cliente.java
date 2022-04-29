
public class Cliente extends Pessoa{
	public boolean primeiraCompra;
	
	@Override
	public void dadosPessoais() {
		System.out.println("Primeira compra? " + primeiraCompra);
		super.dadosPessoais();
	}

}
