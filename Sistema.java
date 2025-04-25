import java.util.Scanner;

public class Sistema{

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		double x1;
		double x2;
		double y1;
		double y2;
		Ponto pontoMaior1, pontoMaior2;

		// primeiro ponto
		System.out.print("digite o x do primeiro ponto: ");
		x1 = teclado.nextDouble();
		System.out.print("digite o y do primeiro ponto: ");
		y1 = teclado.nextDouble();

		// segundo ponto
		System.out.print("digite o x do segundo ponto: ");
		x2 = teclado.nextDouble();
		System.out.print("digite o y do segundo ponto: ");
		y2 = teclado.nextDouble();

		Ponto p1 = new Ponto(x1, y1);
		Ponto p2 = new Ponto(x2, y2);

		if(p1.x != 9999 || p2.x != 9999){
			pontoMaior1 = p1;
			pontoMaior2 = p2;
			double distMaior = p1.distancia(p2);

			while(x2 != 9999){

				p2 = new Ponto(x2, y2);
				System.out.println("A distancia do ponto de " + p1.toString() + " para o ponto de " + p2.toString() + " é " + p1.distancia(p2) + "\n");

				System.out.print("digite o x do segundo ponto: ");
				x2 = teclado.nextDouble();
				System.out.print("digite o y do segundo ponto: ");
				y2 = teclado.nextDouble();
				p1 = p2;
				

				
				if(p1.distancia(p2) > distMaior){
					pontoMaior1 = p1;
					pontoMaior2 = p2;
				}

			}
			System.out.println("Pontos com maiores distancias são: ");
			System.out.println(pontoMaior1);
			System.out.println(pontoMaior2);
			
		}
		else{
			System.out.print("não existe a maior distância, pois o código terminou antes de fazer o primeiro cálculo");
		}
		teclado.close();
	}
} 