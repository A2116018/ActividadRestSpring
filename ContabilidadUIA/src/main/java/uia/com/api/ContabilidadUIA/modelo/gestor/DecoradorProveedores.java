package uia.com.api.ContabilidadUIA.modelo.gestor;

import java.util.ArrayList;

import main.java.uia.com.presentacion.ClienteJSP;
import uia.com.ContabilidadUIA.modelo.gestor.clientes.InfoUIA;

public class DecoradorProveedores extends Decorador {
	
	public DecoradorProveedores(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorProveedores()
	{		
	}
	
	public void validaProveedores()
	{
		super.Print();
	}

	public ArrayList<ClienteJSP> getLista()
	{
		return super.getLista();
	}
}
