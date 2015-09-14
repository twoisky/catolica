package br.org.catolicasc.acervo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import br.org.catolicasc.acervo.model.Autor;

@WebService
public class AutoresService {

   public List<Autor> listarAutores() {
      Autor maratona = new Autor("Don Diego Maratona", new Date());
      Autor delma = new Autor("Delma Rassun", new Date());
      Autor tiririca = new Autor("Tiririca", new Date());
      return new ArrayList<>(Arrays.asList(maratona, delma,
            tiririca));
   }

}
