package springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(final HttpServletRequest request, final Model model) {

		final var nome = request.getParameter("NomeEstudante");
		final var resultado = "Eae " + nome.toUpperCase();
		model.addAttribute("message", resultado);
		return "helloworld";
	}

}