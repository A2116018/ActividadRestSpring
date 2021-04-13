package uia.com.api.ContabilidadUIA.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientesController {
	/**
	 * Get All Clientes
	 */
     @RequestMapping("clientes")
     public String getAllClientes() {
    	 System.out.println("Saludos desde getAllClientes()");
    	 return "saludos desde getAllClientes()";
     }

}
