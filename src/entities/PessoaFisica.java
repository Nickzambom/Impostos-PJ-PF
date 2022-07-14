package entities;

public class PessoaFisica extends Pessoa {

	private Double saude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double saude) {
		super(name, rendaAnual);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}
	public void setSaude(Double saude) {
		this.saude = saude;
	}
	
	@Override
	public Double imposto() {
		if(getRendaAnual() < 20000.00) {
			return(getRendaAnual() * 0.15) - (saude * 0.5);
		}else{
			return (getRendaAnual() * 0.25) - (saude * 0.5);
		}
	}

}
