package br.cambury.wssever.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.cambury.bean.Avaliador;
import br.cambury.controle.AvaliadorBCI;

@RestController
public class AvaliadorRestController {

	@Autowired
	private AvaliadorBCI controle;

	@GetMapping("/selectavaliadores")
	public List<Avaliador> getCustomers() {
		return controle.select();
	}
	// http://viralpatel.net/blogs/spring-4-mvc-rest-example-json/

	
	@GetMapping("/selectavaliador/{id}")
	public ResponseEntity getCustomer(@PathVariable("id") Integer id) {

		Avaliador a = new Avaliador(id);
		Avaliador retorno = controle.select(id);

		if (retorno == null) {
			return new ResponseEntity("Avaliador nao cadastrado " + id, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity(retorno, HttpStatus.OK);
		}
	}

	@PostMapping(value = "/cadastraavaliador")
	public ResponseEntity createCustomer(@RequestBody Avaliador l) {
		System.out.println("cadastrar livro");

		controle.insert(l);
		return new ResponseEntity(l, HttpStatus.OK);
	}

	@GetMapping("/deletaavaliador/{id}")
	public ResponseEntity deleteCustomer(@PathVariable Integer id) {
		Avaliador a = new Avaliador (id);
		controle.delete(a);
		return new ResponseEntity(id, HttpStatus.OK);

	}
}
