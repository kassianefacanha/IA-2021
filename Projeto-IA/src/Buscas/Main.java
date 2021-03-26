package Buscas;

import java.util.Scanner;

import Mapa.Estado;
import Mapa.GerarMapa;
import Mapa.Problema;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int escolha;
		String estadoDeInicio, estadoDeDestino;
		System.out.printf("Escreva o nome da cidade de incio \n ---->");
		System.out.printf(" Arad "
				+ "\n Timissoara "
				+ "\n Zerind "
				+ "\n Sibiu "
				+ "\n Lugoj "
				+ "\n Oradea" 
				+ "\n Fagaras" 
				+ "\n Rimnieu_Vilcea"
				+  "\n Bucareste "
				+ "\n Mehadia "
				+ "\n Dobreta "
				+ "\n Craiova "
				+ "\n Giurgiu "
				+ "\n Urziceni "
				+ "\n Hirsova "
				+ "\n Eforie"
				+ "\n Vaslui"
				+"\n Iasi"
				+"\n Neamt  \n");
		System.out.printf("Escreva o nome do estado de incio \n ---->");
		estadoDeInicio = ler.next();
		System.out.printf("Escreva o nome do estado de destino \n ---->");
		estadoDeDestino = ler.next();
		System.out.printf("Escolha:\n 1- Custo Uniforme \n 2- A* \n ---->");
		escolha = ler.nextInt();
		if (escolha == 1) { 

			Busca agente = new CustoUniforme();
			Problema problema = new GerarMapa(estadoDeInicio, estadoDeDestino);
			agente.buscarCustoUniforme(problema, problema.getEstadoInicial());
		} else if (escolha == 2) {
			Problema problema = new GerarMapa(estadoDeInicio, estadoDeDestino);
			Busca agente = new AEstrela();
			agente.buscarAEstrela(problema);
		}else{ 
			System.out.printf("Escolha Inválida Tente Novamente");
		} 
		


	}

}
