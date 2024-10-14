package it.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
//localhost:8080/?nome=Mario

public class IndexController {
	@GetMapping
	public String getPage(Model model,
			@RequestParam(name = "nome", required = false, defaultValue = "senza nome") String nome
			
			) {//al metodo gli passo un istanza del modello
		model.addAttribute("title","la mia prima pagina in thymeleaf");//aggiungo un parametro al modell
		model.addAttribute("nome",nome);
		
		return "index";//richiamo il template "index"
	}

}