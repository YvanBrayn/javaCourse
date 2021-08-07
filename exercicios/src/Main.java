import java.util.Locale; // importe para conversão de padrão de pontuação


public class Main {

	public static void main(String[] args) {
		//var dos produtos
		String produto1 = "Computador"; // %s
		String produto2 = "Mesa de Trabalho"; // %s
		double preco1 = 2100.0; // %f
		double preco2 = 650.0; // %f
		double media = 53.234567; // %f
		
		//var de cadastro
		int idade = 30; // %d
		int code = 5290; // %d
		char genero = 'F'; //%s
		// %n para ir para a linha de baixo
		
		System.out.println("Produtos:");
		System.out.printf("%s, com o preço de R$%.2f%n", produto1, preco1);
		System.out.printf("%s, com o preço de R$%.2f%n%n", produto2, preco2);
		System.out.printf("Registro: %d anos de idade, codigo %d e genero: %s%n%n", idade, code, genero);
		System.out.printf("medir com oito casas decimais: %.8f%n", media);
		System.out.printf("Arredondar (três casas decimais): %.3f%n", media);
		
		
		Locale.setDefault(Locale.US);
		System.out.printf("mostrar com ponto decimal americano: %.3f", media);
		
		
		
		

	}

}
