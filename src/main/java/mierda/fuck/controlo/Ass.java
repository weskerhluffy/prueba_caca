package mierda.fuck.controlo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mierda.fuck.modelin.Autenticado;
import mierda.fuck.modelin.Quote;
import mierda.fuck.modelin.Usuario;

import java.util.Random;

import javax.servlet.http.HttpServletResponse;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
class Codigo {
	private Integer codigo;

	public Codigo(Integer codigo) {
		this.codigo = codigo;
	}
}

@Slf4j
@Controller
@SessionAttributes({ "usuario", "nume" })
public class Ass {

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	@ModelAttribute
	public Usuario usuario() {
		return new Usuario();
	}

	@ModelAttribute
	public Codigo nume() {
		return new Codigo();
	}

	@RequestMapping(value = "/", produces = "text/html")
	public String indexxx(HttpServletResponse response) {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		return "ingresa_tel";
	}

	@PostMapping("manda_codigo")
	public ModelAndView mandaCodigo(@ModelAttribute Usuario usuario, @ModelAttribute Codigo nume, Long tel,
			String tarj) {
		ModelAndView model = new ModelAndView("ingresa_codigo");
		Random caca = new Random();

		usuario.setTarjeta(tarj);
		usuario.setTelefono(tel);
		log.debug("fucking " + usuario);
		nume.setCodigo(caca.nextInt(10000));
		log.debug("si necesita " + nume);
		model.addObject("codigos", nume);
		// XXX:
		// https://www.roseindia.net/tutorial/spring/spring3/web/SessionAttributes-multiple-values.html
		model.addObject("nume", nume);

		// XXX: https://spring.io/guides/gs/consuming-rest/
		/*
		 * RestTemplate restTemplate = new RestTemplate(); Quote quote =
		 * restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",
		 * Quote.class); log.info(quote.toString());
		 */
		// XXX: https://javadeveloperzone.com/spring-boot/spring-boot-resttemplate-basic-authentication/
		RestTemplate restTemplate = restTemplateBuilder.basicAuthorization("postman", "password").build(); // build
																											// using
																											// basic
																											// authentication
																											// details
		Autenticado a = restTemplate.getForObject("https://postman-echo.com/basic-auth", Autenticado.class);
		log.debug("autenti " + a);

		// model.addObject("usuario", usuario);
		return model;
	}

	@PostMapping("tinta_codigos")
	public ModelAndView recibeCodigo(@ModelAttribute Usuario usuario, @ModelAttribute("nume") Codigo nume,
			Integer codigos) {
		ModelAndView model = new ModelAndView("exito");
		log.debug("bueno i el user " + usuario);
		log.debug("lo esperado " + nume + " lo q c recbie " + codigos);
		log.error("lo esperadoe " + nume + " lo q c recbie " + codigos);

		return model;
	}

}
