package springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public final class HelloWorldController {

	@RequestMapping("/showForm")
	public final String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public final String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public final String letsShoutDude(final HttpServletRequest request, final Model model) {

		final var nome = request.getParameter("NomeEstudante");
		final var resultado = "Eae " + nome.toUpperCase();
		model.addAttribute("message", resultado);
		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public final String processFormVersionThree(@RequestParam("NomeEstudante") final String nome, final Model model) {
		final var resultado = "Ola de v3 " + nome.toUpperCase();
		model.addAttribute("message", resultado);
		return "helloworld";
	}

}
