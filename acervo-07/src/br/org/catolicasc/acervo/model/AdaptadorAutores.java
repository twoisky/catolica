package br.org.catolicasc.acervo.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdaptadorAutores extends XmlAdapter<String, Autor> {

	@Override
	public Autor unmarshal(String v) throws Exception {
		return new Autor(v, null);
	}

	@Override
	public String marshal(Autor v) throws Exception {
		return v.getNome();
	}

}
