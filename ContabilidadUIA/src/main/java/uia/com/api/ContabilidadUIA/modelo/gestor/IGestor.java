package uia.com.api.ContabilidadUIA.modelo.gestor;

import java.util.Map;


import uia.com.api.ContabilidadUIA.modelo.clientes.IInfoUIA;

public interface IGestor {
	
	public void Print();
	public void Lee();
	public void Busca();	
	public IInfoUIA busca(String id);
	public Map<String, IInfoUIA> getCatalogoMaestro();
	public void setCatalogo(Map<String, IInfoUIA> p);
	public IGestor getGestor();
	public void setGestor(IGestor p);
}
