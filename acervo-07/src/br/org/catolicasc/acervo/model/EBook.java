package br.org.catolicasc.acervo.model;

import java.util.List;

public class EBook extends Livro {


	  
	
	private FormatoArquivo formato = FormatoArquivo.PDF;

	
	
	public EBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EBook(Integer anoDePublicacao, List<Autor> autores, String editora,
			String nome, String resumo) {
		super(anoDePublicacao, autores, editora, nome, resumo);
		// TODO Auto-generated constructor stub
	}
	
	public EBook(Integer anoDePublicacao, List<Autor> autores, String editora,
			String nome, String resumo, FormatoArquivo formato) {
		super(anoDePublicacao, autores, editora, nome, resumo);
		this.formato = formato;
		// TODO Auto-generated constructor stub
	}

	public FormatoArquivo getFormato() {
		return formato;
	}

	public void setFormato(FormatoArquivo formato) {
		this.formato = formato;
	}

}
