package mierda.fuck.controlo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ass {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
