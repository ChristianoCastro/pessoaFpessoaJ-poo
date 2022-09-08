package entities;

public class Empresa extends Contribuinte {
	
	private Integer numeroDeEmpregados;
	
	public Empresa(String nome,Double RendaAnual ,Integer numeroDeEmpregados) {
		super(nome ,RendaAnual);
		this.numeroDeEmpregados = numeroDeEmpregados;
		
	
	}
	
	public Integer getNumeroDeEmpregados() {
		return numeroDeEmpregados;
		
	}
	
	public void setNumeroDeEmpregados (Integer numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
		
	}
	
	@Override
	public Double imposto() {
		if (numeroDeEmpregados > 10){
			return getRendaAnual() * 0.14;
			
		}
		else {
			return getRendaAnual() * 0.16;
		}
	}

}