package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(final Model theModel) {

		final var theStudent = new Student();

		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

}
