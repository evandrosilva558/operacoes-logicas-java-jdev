package operacoes_logicas_java;

public class OperacoesLogicas {

	public static void main(String[] args) {

		int nota1 = 75;
		int nota2 = 65;
		int nota3 = 65;
		int nota4 = 60;
		int media;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;

		if (media >= 70) {
			System.out.println("Aluno aprovado" + " " + media);
		}

		else if (media >= 60) {
			System.out.println("Aluno em reculperação" + " " + media);
		}

		else {
			System.out.println("Aluno reprovado" + " " + media);
		}

	}

}
