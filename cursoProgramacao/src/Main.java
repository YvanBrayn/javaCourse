import java.util.Locale; //importando a bliblioteca de locale para a linguagem do programa pegar as configurações
//apontadas no programa


public class Main { //Classe basica "Main"

	public static void main(String[] args) { //função principal, para a execução do programa
		
		//int, inteiros
		//float, double flutuantes
		//char uni caracter
		//String texto
		//boolean true / false
		
		int y = 31;
		double x = 10.327654;
		
		System.out.println("Olá Mundo!!!"); //Sistem.out.print (imprimir na tela) ln para quebrar a linha 
		//seguinte
		System.out.print("Bom ");//o print sem o ln mantem o texto do proximo print na mesma linha
		System.out.println("Dia"); //no exemplo o print "Dia" aparece logo depois do "Bom " e ambos na linha de
		//baixo por que o "Olá Mundo!!!" é um println
		
		
		System.out.println(y);
		System.out.println(x);
		
		
		System.out.printf("%.2f%n", x); // printf é para fazer um print formatado "%.2f é para ter duas casas
		//decimais, pode ser 2 4 6 casas decimais basta colocar no lugar do 2 antes do f. 
		//%n é para ir para a linha de baixo a proxima sentença.
		// depois da virgula vem a variavel que sera formatada.
		System.out.printf("%.3f%n", x);
		
		Locale.setDefault(Locale.US);//com esta classe o programa importa os separadores americanos 
		//local escolhido no caso US e tudo que esta abaixo dele vai ser lido assim.
		System.out.printf("%.2f%n", x);
		
		//concatenando no Java
		System.out.println("Resultado = " + x + " Metros"); // concatenando normal
		// Resultado = 10.327654 Metros
		
		System.out.printf("Resultado = %.2f metros%n", x); //concatenando com print formatado
		//no exemplo a cima onde ficou a formatação ele trocou pela variavel no caso %.2f por X
		// Resultado = 10.33 metros
		
		//exemplo para concatenar com formatação diversas variaveis
		// %f para flutuantes
		// %d para inteiros
		// %s para textos
		// %n para quebra de linha
		String nome = "Thais";
		int idade = 29;
		double renda = 4000.00;
		
		System.out.printf("A funcionaria %s tem %d anos de idade e recebe %.2f reais%n", nome, idade, renda);
		// na declaração de variaveis temos que colocar na ordem em que aparecem separando-as com virgula
		
		
	}

}
