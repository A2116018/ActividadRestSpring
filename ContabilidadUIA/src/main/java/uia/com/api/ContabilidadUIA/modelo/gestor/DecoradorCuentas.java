package uia.com.api.ContabilidadUIA.modelo.gestor;

import java.util.Map;

import uia.com.ContabilidadUIA.modelo.gestor.clientes.InfoUIA;

public class DecoradorCuentas extends Decorador {
	
	public DecoradorCuentas(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorCuentas()
	{		
	}
	
	public void validaCuentas()
	{
		super.Print();
	}


	public Map<String, InfoUIA> getCatalogo() {	
		return this.catalogo;
	}


}
