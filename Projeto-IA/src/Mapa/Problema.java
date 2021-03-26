package Mapa;

import java.util.LinkedList;

public interface Problema {

	public void inicializarProblema();
	public LinkedList<Estado> funcaoSucessora(Estado estado);
	public boolean testeDeObjetivo(Estado estado);
	public Estado verificaEstado(String nomeEstado);
	public Estado getEstadoInicial();
	public Estado getObejetivo();
	public Integer getCustoCaminho(Estado estadoAtual, Estado estadoFinal);
	public String getNomeEstadoInicial();
	public String getNomeObjetivo();
	public LinkedList<Estado> getEstados();
	public Integer getDistanciaLR(Estado objetivo, Estado estadoAtual);

}
