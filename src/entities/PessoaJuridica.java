package entities;

public class PessoaJuridica extends Pessoa {

	private Double numeroFunc;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Double numeroFunc) {
		super(name, rendaAnual);
		this.numeroFunc = numeroFunc;
	}

	public Double getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(Double numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public Double imposto() {
		if(numeroFunc > 10) {
			return getRendaAnual() * 0.14;
		}else {
			return getRendaAnual() * 0.16;
		}
	}

}
