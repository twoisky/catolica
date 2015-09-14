package br.org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import br.org.catolicasc.acervo.model.Autor;
import br.org.catolicasc.acervo.model.EBook;
import br.org.catolicasc.acervo.model.FormatoArquivo;
import br.org.catolicasc.acervo.model.Livro;

public class LivroDAO {

	private static List<Livro> Livros = new ArrayList<Livro>();

	static {
		Livros.add(new EBook(
				2012,
				new ArrayList<Autor>(Arrays.asList(new Autor("Leonardo Vitazik Neto", new Date()),
						new Autor(" Fabio D.", new Date()))),
				"Cat�lica",
				"Java para programadores Rails e Node",
				" De forma pr�tica e objetiva, o livro ensina que o java � muito inst�vel. Al�m disso, definivamente programa com java � muito mais chato! ", FormatoArquivo.PDF));
		
		
		Livros.add(new Livro(
				2012,
				new ArrayList<Autor>(Arrays.asList(new Autor("Alu�sio Azevedo", new Date()))),
				"�rica",
				"O Corti�o",
				"Alu�sio Azevedo foge �s armadilhas do naturalismo e, fazendo do espa�o coletivo o grande personagem de seu romance, comp�e uma narrativa cheia de interesse."));
		Livros.add(new Livro(
				2012,
				new ArrayList<Autor>(Arrays.asList(new Autor("Ariano Suassuna", new Date()))),
				"Nova",
				"Romance D'A Pedra do Reino",
				"Obra picaresca para Ariano Suassuna, livro se inspira em ra�zes populares e re�ne as bases do movimento armorial"));
	}

	public List<Livro> listarLivros() {
		return Livros;
	}

	public void criarLivro(Livro livro) {
		Livros.add(livro);
	}

}
