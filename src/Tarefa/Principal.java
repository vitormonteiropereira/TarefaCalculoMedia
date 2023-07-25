package Tarefa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
			
		System.out.println("Digite o segundo valor: ");
		n2 = ler.nextDouble();

		System.out.println("Digite o terceiro valor: ");
		n3 = ler.nextDouble();
				
		System.out.println("Digite o quarto valor: ");
		n4 = ler.nextDouble();
				
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("A media dos valores:" + media);
		
	}

}
