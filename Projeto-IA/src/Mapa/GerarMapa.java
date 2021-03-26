package Mapa;

import java.util.Collections;
import java.util.LinkedList;


public class GerarMapa implements Problema {

	public LinkedList<Estado> GerarMapa = new LinkedList<>();
	public LinkedList<Custo> custos = new LinkedList<>();
	public LinkedList<DistanciaLR> distancialr = new LinkedList<>();

	public String nomeEstadoInicial;
	public String nomeObjetivo;
	public Estado estadoInicial;
	public Estado objetvo;

	public Estado Arad = new Estado();
	public Estado Timissoara = new Estado();
	public Estado Zerind = new Estado();
	public Estado Sibiu = new Estado();
	public Estado Lugoj = new Estado();
	public Estado Oradea = new Estado();
	public Estado Fagaras = new Estado();
	public Estado Rimnieu_Vilcea = new Estado();
	public Estado Pitesti = new Estado();
	public Estado Bucareste = new Estado();
	public Estado Mehadia = new Estado();
	public Estado Dobreta = new Estado();
	public Estado Craiova = new Estado();
	public Estado Giurgiu = new Estado();
	public Estado Urziceni = new Estado();
	public Estado Hirsova = new Estado();
	public Estado Eforie = new Estado();
	public Estado Vaslui = new Estado();
	public Estado Iasi = new Estado();
	public Estado Neamt = new Estado();

	public GerarMapa(String nomeEstadoInicial, String nomeObjetivo) {
		inicializarProblema();
		this.estadoInicial = verificaEstado(nomeEstadoInicial);
		this.objetvo = verificaEstado(nomeObjetivo);
		this.nomeEstadoInicial = nomeEstadoInicial;
		this.nomeObjetivo = nomeObjetivo;
	}

	@Override
	public void inicializarProblema() {
		// TODO Auto-generated method stub
		Arad.nome = "Arad";
		Arad.acoes.add(Sibiu);
		Arad.acoes.add(Zerind);
		Arad.acoes.add(Timissoara);

		Timissoara.nome = "Timissoara";
		Timissoara.acoes.add(Arad);
		Timissoara.acoes.add(Lugoj);

		Oradea.nome = "Oradea";
		Oradea.acoes.add(Zerind);
		Oradea.acoes.add(Sibiu);

		Zerind.nome = "Zerind";
		Zerind.acoes.add(Oradea);
		Zerind.acoes.add(Arad);

		Sibiu.nome = "Sibiu";
		Sibiu.acoes.add(Fagaras);
		Sibiu.acoes.add(Rimnieu_Vilcea);
		Sibiu.acoes.add(Oradea);
		Sibiu.acoes.add(Arad);

		Fagaras.nome = "Fagaras";
		Fagaras.acoes.add(Bucareste);
		Fagaras.acoes.add(Sibiu);

		Bucareste.nome = "Bucareste";
		Bucareste.acoes.add(Urziceni);
		Bucareste.acoes.add(Fagaras);
		Bucareste.acoes.add(Pitesti);
		Bucareste.acoes.add(Giurgiu);

		Lugoj.nome = "Lugoj";
		Lugoj.acoes.add(Timissoara);
		Lugoj.acoes.add(Mehadia);

		Mehadia.nome = "Mehadia";
		Mehadia.acoes.add(Dobreta);
		Mehadia.acoes.add(Lugoj);

		Dobreta.nome = "Dobreta";
		Dobreta.acoes.add(Craiova);
		Dobreta.acoes.add(Mehadia);

		Craiova.nome = "Craiova";
		Craiova.acoes.add(Pitesti);
		Craiova.acoes.add(Rimnieu_Vilcea);
		Craiova.acoes.add(Dobreta);

		Pitesti.nome = "Pitesti";
		Pitesti.acoes.add(Bucareste);
		Pitesti.acoes.add(Rimnieu_Vilcea);
		Pitesti.acoes.add(Craiova);

		Rimnieu_Vilcea.nome = "Rimnieu_Vilcea";
		Rimnieu_Vilcea.acoes.add(Pitesti);
		Rimnieu_Vilcea.acoes.add(Craiova);
		Rimnieu_Vilcea.acoes.add(Sibiu);

		Giurgiu.nome = "Giurgiu";
		Giurgiu.acoes.add(Bucareste);

		Urziceni.nome = "Urziceni";
		Urziceni.acoes.add(Hirsova);
		Urziceni.acoes.add(Vaslui);
		Urziceni.acoes.add(Bucareste);

		Eforie.nome = "Eforie";
		Eforie.acoes.add(Hirsova);

		Vaslui.nome = "Vaslui";
		Vaslui.acoes.add(Urziceni);
		Vaslui.acoes.add(Iasi);

		Iasi.nome = "Iasi";
		Iasi.acoes.add(Neamt);
		Iasi.acoes.add(Vaslui);

		Neamt.nome = "Neamt";
		Neamt.acoes.add(Iasi);

		Hirsova.nome = "Hirsova";
		Hirsova.acoes.add(Eforie);
		Hirsova.acoes.add(Urziceni);

		this.GerarMapa.add(Arad);
		this.GerarMapa.add(Zerind);
		this.GerarMapa.add(Timissoara);
		this.GerarMapa.add(Sibiu);
		this.GerarMapa.add(Lugoj);
		this.GerarMapa.add(Oradea);
		this.GerarMapa.add(Fagaras);
		this.GerarMapa.add(Rimnieu_Vilcea);
		this.GerarMapa.add(Bucareste);
		this.GerarMapa.add(Pitesti);
		this.GerarMapa.add(Craiova);
		this.GerarMapa.add(Mehadia);
		this.GerarMapa.add(Dobreta);
		this.GerarMapa.add(Giurgiu);
		this.GerarMapa.add(Urziceni);
		this.GerarMapa.add(Hirsova);
		this.GerarMapa.add(Eforie);
		this.GerarMapa.add(Vaslui);
		this.GerarMapa.add(Iasi);
		this.GerarMapa.add(Neamt);


		
		custos.add(new Custo(Arad, Sibiu, 140));
		custos.add(new Custo(Arad, Zerind, 75));
		custos.add(new Custo(Arad, Timissoara, 118));
		custos.add(new Custo(Sibiu, Arad, 140));
		custos.add(new Custo(Sibiu, Oradea, 151));
		custos.add(new Custo(Sibiu, Fagaras, 99));
		custos.add(new Custo(Sibiu, Rimnieu_Vilcea, 80));
		custos.add(new Custo(Zerind, Arad, 75));
		custos.add(new Custo(Zerind, Oradea, 71));
		custos.add(new Custo(Oradea, Zerind, 71));
		custos.add(new Custo(Oradea, Sibiu, 151));
		custos.add(new Custo(Timissoara, Arad, 118));
		custos.add(new Custo(Timissoara, Lugoj, 111));
		custos.add(new Custo(Lugoj, Timissoara, 111));
		custos.add(new Custo(Lugoj, Mehadia, 70));
		custos.add(new Custo(Mehadia, Lugoj, 70));
		custos.add(new Custo(Mehadia, Dobreta, 75));
		custos.add(new Custo(Dobreta, Mehadia, 75));
		custos.add(new Custo(Dobreta, Craiova, 120));
		custos.add(new Custo(Craiova, Dobreta, 120));
		custos.add(new Custo(Craiova, Rimnieu_Vilcea, 146));
		custos.add(new Custo(Craiova, Pitesti, 138));
		custos.add(new Custo(Rimnieu_Vilcea, Sibiu, 80));
		custos.add(new Custo(Rimnieu_Vilcea, Craiova, 146));
		custos.add(new Custo(Rimnieu_Vilcea, Pitesti, 97));
		custos.add(new Custo(Pitesti, Rimnieu_Vilcea, 97));
		custos.add(new Custo(Pitesti, Craiova, 138));
		custos.add(new Custo(Pitesti, Bucareste, 101));
		custos.add(new Custo(Bucareste, Fagaras, 211));
		custos.add(new Custo(Bucareste, Giurgiu, 90));
		custos.add(new Custo(Bucareste, Urziceni, 85));
		custos.add(new Custo(Bucareste, Pitesti, 101));
		custos.add(new Custo(Fagaras, Sibiu, 99));
		custos.add(new Custo(Fagaras, Bucareste, 211));
		custos.add(new Custo(Giurgiu, Bucareste, 90));
		custos.add(new Custo(Urziceni, Bucareste, 85));
		custos.add(new Custo(Urziceni, Hirsova, 98));
		custos.add(new Custo(Urziceni, Vaslui, 142));
		custos.add(new Custo(Hirsova, Urziceni, 98));
		custos.add(new Custo(Hirsova, Eforie, 86));
		custos.add(new Custo(Eforie, Hirsova, 86));
		custos.add(new Custo(Vaslui, Urziceni, 142));
		custos.add(new Custo(Vaslui, Iasi, 92));
		custos.add(new Custo(Iasi, Vaslui, 92));
		custos.add(new Custo(Iasi, Neamt, 87));
		custos.add(new Custo(Neamt, Iasi, 87));
		
		
		distancialr.add(new DistanciaLR(Bucareste, Bucareste, 0));
		distancialr.add(new DistanciaLR(Bucareste, Arad, 366));
		distancialr.add(new DistanciaLR(Bucareste, Craiova, 160));
		distancialr.add(new DistanciaLR(Bucareste, Dobreta, 242));
		distancialr.add(new DistanciaLR(Bucareste, Eforie, 161));
		distancialr.add(new DistanciaLR(Bucareste, Fagaras, 176));
		distancialr.add(new DistanciaLR(Bucareste, Giurgiu, 77));
		distancialr.add(new DistanciaLR(Bucareste, Hirsova, 151));
		distancialr.add(new DistanciaLR(Bucareste, Iasi, 226));
		distancialr.add(new DistanciaLR(Bucareste, Lugoj, 244));
		distancialr.add(new DistanciaLR(Bucareste, Mehadia, 241));
		distancialr.add(new DistanciaLR(Bucareste, Neamt, 234));
		distancialr.add(new DistanciaLR(Bucareste, Oradea, 380));
		distancialr.add(new DistanciaLR(Bucareste, Pitesti, 100));
		distancialr.add(new DistanciaLR(Bucareste, Rimnieu_Vilcea, 193));
		distancialr.add(new DistanciaLR(Bucareste, Sibiu, 253));
		distancialr.add(new DistanciaLR(Bucareste, Timissoara, 329));
		distancialr.add(new DistanciaLR(Bucareste, Urziceni, 80));
		distancialr.add(new DistanciaLR(Bucareste, Vaslui, 199));
		distancialr.add(new DistanciaLR(Bucareste, Zerind, 374));
	}

	@Override
	public LinkedList<Estado> funcaoSucessora(Estado estado) {
		// TODO Auto-generated method stub
		return estado.acoes;
	}

	@Override
	public boolean testeDeObjetivo(Estado estado) {
		// TODO Auto-generated method stub
		return estado.equals(objetvo);
	}

	@Override
	public Estado verificaEstado(String nomeEstado) {
		// TODO Auto-generated method stub
		for (int i = 0; i < GerarMapa.size(); i++) {
			if (nomeEstado.equals(GerarMapa.get(i).nome)) {
				return GerarMapa.get(i);
			}
		}
		System.err.println("Nao existe <" + nomeEstado + "> neste problema!");
		return null;
	}

	@Override
	public Integer getCustoCaminho(Estado estadoAtual, Estado estadoFinal) {
		// TODO Auto-generated method stub
		Collections.shuffle(custos);
		if (estadoAtual.equals(estadoFinal))
			return 0;
		else if (estadoAtual.acoes.contains(estadoFinal)) {
			for (int i = 0; i < custos.size(); i++) {
				if (custos.get(i).estadoInicial.equals(estadoAtual) && custos.get(i).estadoFinal.equals(estadoFinal))
					return custos.get(i).custoDeIda;
			}
		}
		System.err.println("Ocorreu um erro");
		return null;
	}

	@Override
	public Estado getEstadoInicial() {
		// TODO Auto-generated method stub
		return estadoInicial;
	}

	@Override
	public Estado getObejetivo() {
		// TODO Auto-generated method stub
		return objetvo;
	}
	
	@Override
	public String getNomeEstadoInicial() {
		// TODO Auto-generated method stub
		return nomeEstadoInicial;
	}

	@Override
	public String getNomeObjetivo() {
		// TODO Auto-generated method stub
		return nomeObjetivo;
	}

	@Override
	public LinkedList<Estado> getEstados() {
		// TODO Auto-generated method stub
		return GerarMapa;
	}
	
	public Integer getDistanciaLR(Estado objetivo, Estado estadoAtual) {
		// TODO Auto-generated method stub
		Integer distancia = null;

		if (!GerarMapa.contains(objetivo) || !GerarMapa.contains(estadoAtual)) {
			System.out.println("Ocorreu um erro");
			return distancia;
		}

		for (int i = 0; i < distancialr.size(); i++) {
			if (distancialr.get(i).estadoInicial.equals(estadoAtual) && distancialr.get(i).objetivo.equals(objetivo))
				distancia = distancialr.get(i).distancia;
		}

		return distancia;
	}



}