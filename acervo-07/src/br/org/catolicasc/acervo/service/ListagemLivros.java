package br.org.catolicasc.acervo.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

import br.org.catolicasc.acervo.dao.LivroDAO;
import br.org.catolicasc.acervo.model.Livro;
import br.org.catolicasc.acervo.model.Usuario;

@WebService
public class ListagemLivros {

	@WebResult(name = "livro")
	public List<Livro> listarLivros() {
		LivroDAO livroDao = new LivroDAO();
		return livroDao.listarLivros();
	}

	public void criarLivro(@WebParam(name="livro") Livro livro, 
			@WebParam(name="usuario", header=true) Usuario usuario)
	 throws UsuarioNaoAutorizadoException, SOAPException {
		if (usuario.getLogin().equals("cat") && 
				usuario.getSenha().equals("cat")) {
			obterDAO().criarLivro(livro);
		} else if (usuario.getLogin().equals("fault")){
			SOAPFault soapFault = SOAPFactory.newInstance().createFault(
						"Usuário não autorizado", 
						new QName(SOAPConstants.URI_NS_SOAP_1_1_ENVELOPE,
									"Client.autorizacao"));
			soapFault.setFaultActor("http://service.acervo.catolicasc.org.br/LivrosService");
			
			throw new SOAPFaultException(soapFault);
			
		}
		else {
			throw new UsuarioNaoAutorizadoException("Não Autorizado");
		}	
	}

	private LivroDAO obterDAO() {
		return new LivroDAO();
	}

}
