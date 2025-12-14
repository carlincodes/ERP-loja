package erp;

import java.util.ArrayList;

public class Loja {
	private String cnpj;
	private String nome;
	private ArrayList<Empregado> empregados = new ArrayList<>();
	
	public Loja(String cnpj, String nome, Gerente gerente) {
		this.cnpj = cnpj;
		this.nome = nome;
		gerente.setLoja(this);
		empregados.add(gerente);
	
	}
	
	public double getSalarioTotal() { 
	    double salarioTotal = 0.0;
	    
	    for (Empregado e : empregados) {
	        salarioTotal += e.getSalario();
	    }
	    return salarioTotal; 
	}
	
	public double getDescontoTotal() {
		double desconto = Empregado.getSalarioMinimo() * 0.10;
		return empregados.size() * desconto;
	}
	
	public Empregado getMaraja() {
	    Empregado maraja = empregados.get(0);

	    for (Empregado e : empregados) {
	        if (e.getSalario() > maraja.getSalario()) {
	            maraja = e;
	        }
	    }
	    return maraja;
	}
	
	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}
	
	public Gerente getGerente() {
		return (Gerente) empregados.get(0);
	}
	
	public void adicionar(Empregado e) {
		e.setLoja(this);
		empregados.add(e);
	}
	
	public void remover(Empregado e) {
		empregados.remove(e);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
