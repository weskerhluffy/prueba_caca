package mierda.fuck.controlo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Ass {
	@RequestMapping(value="/",produces="text/html")
	public String indexxx(HttpServletResponse response) {
		    response.setContentType("text/html");
		    response.setCharacterEncoding("UTF-8");
		return "index";
	}
}
