package pl.isa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		model.addAttribute("name", "Miki!");

		return "hello.jsp";
	}

	@RequestMapping(value = "/greetings")
	public ModelAndView sayGreeting() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello2.jsp");
		modelAndView.getModel().put("name", "Miki");
		modelAndView.setStatus(HttpStatus.OK);

		return modelAndView;
	}

}
