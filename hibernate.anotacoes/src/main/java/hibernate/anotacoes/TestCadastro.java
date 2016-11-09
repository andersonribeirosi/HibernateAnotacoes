package hibernate.anotacoes;

import org.hibernate.Session;

public class TestCadastro {

	private static final Session Session = null;

	public static void main(String[] args) {

		Endereco endereco = new Endereco();

		endereco.setBairro("Nova Brasilia");
		endereco.setCep("58.406-830");
		endereco.setCidade("Campina Grande");
		endereco.setEstado("Paraíba");
		endereco.setRua("Iraildo Gomes de Abreu");

		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("043.171.844-00");
		pessoa.setNome("Anderson Ribeiro");
		pessoa.setEndereco(endereco);

		Session session = criaInstancia();

		session.beginTransaction().begin();

		session.saveOrUpdate(pessoa);

		session.beginTransaction().commit();

		session.close();

	}

	private static Session criaInstancia() {
		return Session;
	}

}
