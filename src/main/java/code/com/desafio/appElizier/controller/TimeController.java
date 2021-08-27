package code.com.desafio.appElizier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import code.com.desafio.appElizier.model.domain.Time;
import code.com.desafio.appElizier.model.service.TimeService;

@Controller
public class TimeController {
	
	@Autowired
	private TimeService timeservice;

	@GetMapping(value = "/")
	public String inicializa() {
		return "index";
	}

	@GetMapping(value = "/time")
	public String telaCadastro() {

		return "time/cadastro";
	}

	@GetMapping(value = "/time/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {

		Time timeExcluido = timeservice.obterPorId(id);
		timeservice.excluir(id);

		model.addAttribute("mensagem", "Time " + timeExcluido.getNome() + " excluido com sucesso!!!");

		return obterLista(model);
	}

	@PostMapping(value = "/time/incluir")
	public String incluir(Model model, Time time) {

		timeservice.incluir(time);

		model.addAttribute("mensagem", "O time " + time.getNome() + " foi cadastrado com sucesso!!!");

		return obterLista(model);

	}

	@GetMapping(value = "/time/consultar")
	public String consultar() {

		return "";
	}

	@GetMapping(value = "/time/lista")
	public String obterLista(Model model) {

		model.addAttribute("times", timeservice.obterLista());

		return "time/lista";
	}

}