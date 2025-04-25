import java.lang.Math;

public class Ponto{
	double x;
	double y;

	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double distancia(Ponto p2){
		double distancia = Math.sqrt(Math.pow((x - p2.x), 2) + Math.pow((y - p2.y), 2));
		return Math.round(distancia);
	}

	public String toString(){
		String s = "coordenada x: " + x + " e coordenada y: " + y;
		return s;
	}

}