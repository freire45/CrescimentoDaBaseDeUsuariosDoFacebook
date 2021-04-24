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
		
		System.out.println("Programa que calcula quantos meses o Facebook Levará para chegar a 1,5 bilhão de usuáiros\n"
				         + "Levando em consideração que ele já possui 1 bilhão inscritos e cresce 4% ao mês");
		
		while(total < 1.5) {
			
			mes++;
			
			total = total + (total * 0.04);
			
		}
		
		System.out.printf("%nEm %d de meses o Facebook terá %.2f Bilhões de usuários", mes, total);
		
	}

}
