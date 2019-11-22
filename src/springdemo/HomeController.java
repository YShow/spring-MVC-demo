package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public final class HomeController {

	@RequestMapping("/")
	public final String showPage() {
		return "main-menu";
	}
}
