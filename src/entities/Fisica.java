package entities;

public class Fisica  extends Contribuinte {
	
	private Double despesasDeSaude;
	
	public Fisica (String nome, Double rendaAnual, Double despesasDeSaude) {
		super (nome,rendaAnual);
		this.despesasDeSaude = despesasDeSaude;
	}
	
	public Double getDespesasDeSaude () {
		return despesasDeSaude;
	}
	public void setDespesasDeSaude (Double despesasDeSaude) {
		this.despesasDeSaude = despesasDeSaude;
	}
	
	@Override
	public Double imposto() {
		if (getRendaAnual () < 20000.00) {
			return getRendaAnual() * 0.15 - despesasDeSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - despesasDeSaude * 0.5;
		}
	}

}