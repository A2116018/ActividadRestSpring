package uia.com.ContabilidadUIA.modelo.gestor;



import uia.com.api.ContabilidadUIA.modelo.gestor.DecoradorProveedores;
import uia.com.api.ContabilidadUIA.modelo.gestor.Gestor;
import uia.com.api.ContabilidadUIA.modelo.proveedores.Proveedor;




public class ClientesRepositorio {
		
	    public Gestor ClientesRepositorio =  null;
		public DecoradorProveedores gestorProveedores = null;		
		public Proveedor proveedor = null;
		public String clienteId="";

		public ClientesRepositorio()
		{
		 Gestor ClientesRepositorio = new Gestor("C:\\Users\\wenty\\Downloads\\ContabilidadUIA-MVC-JSP-Examen-master\\ContabilidadUIA-web-MVC-JSP\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(ClientesRepositorio, "proveedor");		 
		 gestorProveedores.Print();
		
		}
		
		
		}
