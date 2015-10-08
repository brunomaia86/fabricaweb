package br.com.fabricadeprogramador;

import java.util.List;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {

		// testCadastrar();
		// testAlterar();
		// testExcluir();
		// testSalvar();
		// testBuscarPorId();
		// testBuscarTodos();
		 testAutenticar();

	}

	private static void testCadastrar() {
		// instancia que ser� um registro no banco
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Carlos Roberto");
		usuario1.setSenha("123");
		usuario1.setLogin("carlos");

		// instancia do objeto que faz o CRUD
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		usuarioDAO.cadastrar(usuario1);
	}

	private static void testAlterar() {

		Usuario usuario1 = new Usuario();
		usuario1.setId(6);
		usuario1.setNome("Marta");
		usuario1.setLogin("marta");
		usuario1.setSenha("123");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usuario1);
	}

	private static void testExcluir() {

		Usuario usuario1 = new Usuario();
		usuario1.setId(5);
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usuario1);

	}

	private static void testSalvar() {

		Usuario usuario1 = new Usuario();
		// usuario1.setId(6);
		usuario1.setNome("Daniel Lucena");
		usuario1.setLogin("daniel");
		usuario1.setSenha("123");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.salvar(usuario1);
	}

	private static void testBuscarPorId() {
		UsuarioDAO usuDAO = new UsuarioDAO();

		Usuario usuario = usuDAO.buscarPorId(4);

		if (usuario != null)
			System.out.println(
					usuario.getId() + " " + usuario.getNome() + " " + usuario.getLogin() + " " + usuario.getSenha());

	}

	private static void testBuscarTodos() {
		UsuarioDAO usuDAO = new UsuarioDAO();

		List<Usuario> lista = usuDAO.buscarTodos();

		for (Usuario usuario : lista)
			System.out.println(
					usuario.getId() + " " + usuario.getNome() + " " + usuario.getLogin() + " " + usuario.getSenha());

	}

	private static void testAutenticar() {
		UsuarioDAO usuDAO = new UsuarioDAO();

		Usuario usuAut = new Usuario();
		usuAut.setLogin("larissa");
		usuAut.setSenha("123");

		Usuario usuRetorno = usuDAO.autenticar(usuAut);

		if (usuRetorno != null)
			System.out.println(usuRetorno.getId() + " " + usuRetorno.getNome() + " " + usuRetorno.getLogin() + " "
					+ usuRetorno.getSenha());
		else
			System.out.println("Usuario nao encontrado!");

	}

}
