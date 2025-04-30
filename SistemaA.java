import java.util.Scanner;
public class SistemaA{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		double a;
		double b;
		double c;
		//equação h(t) = −5t^2 + 20t + 1.
		a = -5;
		b = 20;
		c = 1;

		for(int i = 1; i <=10; i++){
			System.out.print("Digite um tempo: ")
			double tempo = teclado.nextDouble()
			Eq2g altura = new Eq2g(a, b, c);
			System.out.println(tempo + "s, " altura.fdex(tempo) + "m")

		}
		System.out.print("“ALTURA MÁXIMA: "  + altura.min_max() + " metros")
		teclado.close()
	}//main










}// class