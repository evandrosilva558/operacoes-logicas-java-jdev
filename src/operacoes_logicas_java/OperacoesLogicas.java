package operacoes_logicas_java;

import javax.swing.JOptionPane;

public class OperacoesLogicas {

	public static void main(String[] args) {

		int nota1 = 55;
		int nota2 = 65;
		int nota3 = 65;
		int nota4 = 60;
		int notas[] = {nota1, nota2, nota3, nota4};
		int media;
		String dia = "Ter?a";

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condi??es L?gicas com IF e ELSE */

		if (media >= 70) {
			System.out.println("Aluno aprovado" + " " + media);
		}

		else if (media >= 60) {
			System.out.println("Aluno em reculpera??o" + " " + media);
		}

		else {
			System.out.println("Aluno reprovado" + " " + media);
		}

		/* Operadores Tern?rios */

		String saidaResultado;

		saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 60) ? "Aluno em reculpera??o" : "Aluno reprovado";

		System.out.println(saidaResultado);

		/* Opera??es l?gicas aninhadas */

		if (media > 60) {
			if (media >= 70) {
				System.out.println("Aluno aprovado " + media);
			} else {
				System.out.println("Aluno em reculpera??o " + media);
			}
		} else {
			System.out.println("Aluno reprovado " + media);
		}

		/* Comando Switch e Case opera??es EXATAS */

		switch (dia) {

		case "Segunda":
			System.out.println("Segunda-feira");
			break;

		case "Ter?a":
			System.out.println("Ter?a-feira");
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

		default:
			System.out.println("Domingo");
			break;
		}

		/* Operadores relacionais */

		if (nota1 == nota2) {
			System.out.println("S?o iguais");
		} else if (nota1 != nota2) {
			System.out.println("S?o diferentes");
		} else if (nota1 > nota2) {
			System.out.println("nota1 ? maior que nota2");
		} else if (nota1 < nota2) {
			System.out.println("nota1 ? menor que nota2");
		} else if (nota1 >= nota2) {
			System.out.println("nota1 ? maior ou igual a nota2");
		} else if (nota1 <= nota2) {
			System.out.println("nota1 ? menor ou igual a nota2");
		} else {
			System.out.println("Esses s?o os operadores relacionais");
		}

		/* Estrutura de repeti??o WHILE e DO WHILE */

		int i = 0;
		while (i <= 10) { /* Verifica depois executa */
			System.out.println(i);
			i++;
		}

		int j = 0; /* Executa primeiro depois verifica*/
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		
		/* Estrutura de repeti??o FOR */
		
		for (i = 0; i < notas.length; i++) {
			
			System.out.println("Nota: " + notas[i]);
			
		}
		
		/* M?dulo Resto da divis?o % 'MOD' */
		
		double carro = 9;
		double pessoa = 2;
		
		double resto = carro % pessoa;
		
		System.out.println("obraram " + resto + " Carro(s)");
		
		/* Criando entrada de dados e caixa de dialogo com Swing JOptionPane */
		
		String carros = JOptionPane.showInputDialog("Digite o n?mero de carros?");
		String pessoas = JOptionPane.showInputDialog("Digite o n?mero de pessoas?");
		
		double CarrosNumero = Double.parseDouble(carros);
		double PessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (CarrosNumero / PessoasNumero);
		
		double resto2 = CarrosNumero % PessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da Divis?o?");
		
		if (resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "Divis?o por pessoas foi " + divisao + " carros.");
			
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da Divis?o?");
		
		if (resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "O resto da divis?o foi " + resto2 + " carros.");
			
		}
		
	}

}
