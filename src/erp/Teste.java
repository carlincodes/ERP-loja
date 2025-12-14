package erp;
import java.util.ArrayList;
public class Teste {
	public static void main(String[] args) {
		Empregado.setSalarioMinimo(1000.0);
		
		/**
		 * Criar relacionamentos
		 */
		
		Loja loja1 = new Loja("111111","Magazine Bella",new Gerente(1, 500)); //quant=1
		loja1.adicionar(new Empregado(1));	//rel. bidirecional //quant=1
		loja1.adicionar(new Empregado(1));	//rel. bidirecional //quant=1
		
		Loja loja2 = new Loja("222222","Lojas Paibanas",new Gerente(1, 500)); //quant=1
		loja2.adicionar(new Empregado(2));	//rel. bidirecional //quant=2
		loja2.adicionar(new Empregado(2));	//rel. bidirecional //quant=2
		
		/**
		 * Remover relacionamento
		 */
		
		System.out.println("\n---remover o ultimo empregado (6) da loja2");
		loja2.remover(loja2.getEmpregados().getLast());
		
		/**
		 * Navegar pelos relacionamentos
		 */
		//loja1
		System.out.println("\n---loja 1---\n");
		System.out.println("cnpj:"+loja1.getCnpj());
		System.out.println("nome:"+loja1.getNome());
		System.out.println("gerente:"+loja1.getGerente().getMatricula()+ " grat= " + loja1.getGerente().getGratificacao() );
		System.out.println("empregados:");
		for(Empregado e: loja1.getEmpregados())
			System.out.println("   matricula="+e.getMatricula() +" (quant="+ e.getQuantidade() + ") =>  sal=" + e.getSalario() + "/"+e.getLoja().getNome());
		System.out.println("salario total="+loja1.getSalarioTotal());
		System.out.println("desconto total="+loja1.getDescontoTotal());
		Empregado maraja1 = loja1.getMaraja();
		System.out.println("maraja="+maraja1.getMatricula() + ", sal=" + maraja1.getSalario() );
		
		//loja2
		System.out.println("\n---loja 2---\n");
		System.out.println("cnpj:"+loja2.getCnpj());
		System.out.println("nome:"+loja2.getNome());
		System.out.println("gerente:"+loja2.getGerente().getMatricula()+ " grat= " + loja2.getGerente().getGratificacao() );
		System.out.println("empregados:");
		for(Empregado e: loja2.getEmpregados())
			System.out.println("   matricula="+e.getMatricula() +" (quant="+ e.getQuantidade() + ") =>  sal=" + e.getSalario() + "/"+e.getLoja().getNome());
		System.out.println("salario total="+loja2.getSalarioTotal());
		System.out.println("desconto total="+loja2.getDescontoTotal());
		Empregado maraja2 = loja2.getMaraja();
		System.out.println("maraja="+maraja2.getMatricula() + ", sal=" + maraja2.getSalario() );
		

	

		
		/**
		 * Listagem Final
		 */
		
		System.out.println("\n---listar todos os empregados:");
		ArrayList<Empregado> todos = new ArrayList<>();
		todos.addAll(loja1.getEmpregados());
		todos.addAll(loja2.getEmpregados());

		for(Empregado e: todos)
			System.out.println("   matricula="+e.getMatricula() +" (quant="+ e.getQuantidade() + ") =>  sal=" + e.getSalario() + "/"+e.getLoja().getNome());
	}
}
