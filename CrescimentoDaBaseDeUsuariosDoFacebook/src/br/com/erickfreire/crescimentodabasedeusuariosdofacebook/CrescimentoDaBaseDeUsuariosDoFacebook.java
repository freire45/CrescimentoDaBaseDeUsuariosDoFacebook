package br.com.erickfreire.crescimentodabasedeusuariosdofacebook;


/**
 * Programa em Java que calcula a base de crescimento de pessoas que usam o Facebook
 * @author Erick Freire
 * @version 1 - Criado em 24-04-2021 as 17:47
 */

public class CrescimentoDaBaseDeUsuariosDoFacebook {

	public static void main(String[] args) {
		double total = 1;
		int mes = 0;
		
		System.out.println("Programa que calcula quantos meses o Facebook Levar� para chegar a 1,5 bilh�o de usu�iros\n"
				         + "Levando em considera��o que ele j� possui 1 bilh�o inscritos e cresce 4% ao m�s");
		
		while(total < 1.5) {
			
			mes++;
			
			total = total + (total * 0.04);
			
		}
		
		System.out.printf("%nEm %d de meses o Facebook ter� %.2f Bilh�es de usu�rios", mes, total);
		
	}

}
