package operacoes_logicas_java;

public class OperacoesLogicas {

	public static void main(String[] args) {

		int nota1 = 55;
		int nota2 = 65;
		int nota3 = 65;
		int nota4 = 60;
		int media;
		String dia = "Terça";
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		/* Condições Lógicas com IF e ELSE*/
		
		if (media >= 70) {
			System.out.println("Aluno aprovado" + " " + media);
		}

		else if (media >= 60) {
			System.out.println("Aluno em reculperação" + " " + media);
		}

		else {
			System.out.println("Aluno reprovado" + " " + media);
		}
		
		/* Operadores Ternários */
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 60) ? "Aluno em reculperação" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
		
		/* Operações lógicas aninhadas*/
		
		if (media > 60) {
			if (media >= 70) {
				System.out.println("Aluno aprovado " + media);
			} else {
				System.out.println("Aluno em reculperação " + media);
			}
		} else {
			System.out.println("Aluno reprovado " + media);
		}
		
		/* Comando Switch e Case operações EXATAS*/
		
		switch (dia) {
		
		case "Segunda":
			System.out.println("Segunda-feira");
			break;
			
		case "Terça":
			System.out.println("Terça-feira");
			break;
			
		case "Quarta":
			System.out.println("Quarta-feira");
			break;
			
		case "Quinta":
			System.out.println("Quinta-feira");
			break;
			
		case "Sexta":
			System.out.println("Sexta-feira");
			break;
			
		case "Sabado":
			System.out.println("Sabado");
			break;
			
		default: System.out.println("Domingo");
			break;
		}
		
		/* Operadores relacionais*/
		
		if (nota1 == nota2) {
			System.out.println("São iguais");
		} else if (nota1 != nota2) {
			System.out.println("São diferentes");
		} else if (nota1 > nota2) {
			System.out.println("nota1 é maior que nota2");
		} else if (nota1 < nota2) {
			System.out.println("nota1 é menor que nota2");
		} else if (nota1 >= nota2) {
			System.out.println("nota1 é maior ou igual a nota2");
		} else if (nota1 <= nota2) {
			System.out.println("nota1 é menor ou igual a nota2");
		} else {
			System.out.println("Esses são os operadores relacionais");
		}
		

	}

}
