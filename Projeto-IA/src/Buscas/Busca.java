package Buscas;

import java.util.LinkedList;

import Mapa.*;

public interface Busca {

	public LinkedList<No> buscarCustoUniforme(Problema problema, Estado estadoInicial);
    public LinkedList<No> buscarAEstrela(Problema problema);
	public LinkedList<No> expandir(No no);
	public LinkedList<No> getBorda();
	public LinkedList<No> getHistorico();
	public void mostrarCaminho();
}