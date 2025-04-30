import java.lang.Math;

public class Eq2g{
	double a;
	double b;
	double c;
	
	public Eq2g(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;


	} // constructor

	public int quantRaizes(){ // retorna a quantidade de raízes da equação;
		double delta;
		int quant;

		delta = (b*b)-4*a*c; // achando delta
		if(delta > 0){ // se o delta for maior que 0 a quantidade de raizes será duas
			quant = 2;
		}
		else{
			if(delta == 0){ // se o delta for 0 a quantidade de raizes será uma
				quant = 1;
			}
			else{ // se o delta for menor que 0 a equação não terá raizes reais
				quant = 0;
			}
		}
		return quant;


	}// quantRaizes

	public double raiz1(){ // retorna a raiz 1 da equação, se existir;
		double raiz1;
		raiz1 = (-b + Math.sqrt((b*b)-4*a*c))/2*a;
		return raiz1;

	}// raiz1

	public double raiz2(){ // retorna a raiz 2 da equação, se exsitir;
		double raiz2;
		raiz2 = (-b - Math.sqrt((b*b)-4*a*c))/2*a;
		return raiz2;


	}// raiz2

	public double fdex(double vx){ // retorna o valor de f(x) para x igual a vx
		return a * vx * vx + b * vx + c;

	}// fdex

	public double min_max(){ // retorna o valor de máximo ou mínimo da equação 
		double yv; // define o y do vértice
		yv = -(((b*b)-4*a*c)/(4*a)); // fórmula para saber qual o valor máximo ou mínimo de f(x)
		return yv;


	}// min_max
  




}// class