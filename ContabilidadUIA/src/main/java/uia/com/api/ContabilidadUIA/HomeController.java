package uia.com.api.ContabilidadUIA;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/home")
	public String hello() {
		return "Hola Mundo, usando RESTful con Spring Boot";
	}

}
