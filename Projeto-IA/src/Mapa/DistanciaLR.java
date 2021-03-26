package Mapa;

public class DistanciaLR {
	public Estado objetivo;
	public Estado estadoInicial;
	public Integer distancia;
	
	 public DistanciaLR(Estado objetivo, Estado estadoInicial, Integer distancia) {
		super();
		this.objetivo = objetivo;
		this.estadoInicial = estadoInicial;
		this.distancia = distancia;
	}
}
