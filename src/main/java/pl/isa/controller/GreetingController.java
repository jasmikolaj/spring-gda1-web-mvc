package pl.isa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		model.addAttribute("name", "Miki!");

		return "hello.jsp";
	}

}
