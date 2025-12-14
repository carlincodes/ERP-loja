package erp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empregado {
	private int matricula;
	private String dataAdmissao;
	private double quantidade;
	private static double salarioMinimo;
	private static int contador = 0;
	private Loja loja;
	
	public Empregado(double quantidade) {
		if (quantidade < 1) {
	           throw new IllegalArgumentException("A quantidade não pode ser menor que 1.");
	       }
		this.quantidade = quantidade;
		this.dataAdmissao = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		contador++;
		this.matricula = contador;
	}
	
	public double getSalario() {
		return quantidade * salarioMinimo - salarioMinimo * 0.10;
	}
	
	public static void setSalarioMinimo(double salarioMinimo) {
		Empregado.salarioMinimo = salarioMinimo;
	}
	
	public static double getSalarioMinimo() {
		return salarioMinimo;
	}
	
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	public Loja getLoja() {
		return loja;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
}
