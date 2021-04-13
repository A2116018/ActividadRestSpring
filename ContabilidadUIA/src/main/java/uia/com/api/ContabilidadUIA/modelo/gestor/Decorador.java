package uia.com.api.ContabilidadUIA.modelo.gestor;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import uia.com.api.ContabilidadUIA.modelo.clientes.IInfoUIA;

public class Decorador implements IGestor {

	protected IGestor gestor;
	protected Map<String, IInfoUIA> catalogo = new HashMap<String, IInfoUIA>();
	protected String nombre="";
	private Map<String, IInfoUIA> lista;

	public Decorador()
	{	
		super();
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<IInfoUIA>getLista() 
	{
		
		lista = null;
		if(lista.isEmpty())
		{
			System.out.println(this.gestor.getClass().getSimpleName());
			if(this.gestor.getCatalogoMaestro() != null)
			{
				for (Entry<String, IInfoUIA> p: this.gestor.getCatalogoMaestro().entrySet())
				{
					nombre = p.getValue().getName();
					
					p.getValue().setName(nombre);
					((AbstractList<IInfoUIA>) lista).add(p.getValue());
				}
			}
			
		}
		
		return (ArrayList<IInfoUIA>) lista;
		
	}


	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Lee() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Busca() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public IInfoUIA busca(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Map<String, IInfoUIA> getCatalogoMaestro() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setCatalogo(Map<String, IInfoUIA> p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public IGestor getGestor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setGestor(IGestor p) {
		// TODO Auto-generated method stub
		
	}
}