public class SistemaB{
	public static void min(String[] args){
		double largura;
		double comprimento;
		double a;
		double b;
		double c;
		// equação será C(C + 8) = 1680 .: A(C) = C^2 + 8C - 1680 = 0; a = 1, b = 8, c = -1680;
		a = 1;
		b = 8;
		c = -1680;
		Eq2g derivacao = new Eq2g(a, b, c);
		double raiz1 = derivacao.raiz1();
		double raiz2 = derivacao.raiz2();
		if(raiz1 >= 0){ // será a raiz positiva, pois em C^2, C pode ser um número negativo ou positivo
			System.out.println("EMPRESA C");
			System.out.println("===========");
			System.out.println("Area: 1680" ); // a área sera 1680 pois é assim que a empresa quer, e a raiz no ugar de C dará esse resultado
			System.out.println("Largura: " + raiz1); // será a raiz
			System.out.println("Comprimento: " + raiz1 + 8); // será a raiz + 8
		}
		else{
			if(raiz2 >= 0){ // será a raiz positiva, pois em C^2, C pode ser um número negativo ou positivo
				System.out.println("EMPRESA C");
				System.out.println("===========");
				System.out.println("Area: 1680" ); // a área sera 1680 pois é assim que a empresa quer, e a raiz no ugar de C dará esse resultado
				System.out.println("Largura: " + raiz1); // será a raiz
				System.out.println("Comprimento: " + raiz1 + 8); // será a raiz + 8
		}



	}

}