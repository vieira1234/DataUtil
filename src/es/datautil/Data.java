package es.datautil;

public class Data {

	
	/**
	 * Diz se um determinado ano � bissexto ou n�o
	 * 
	 * @param ano Inteiro com o valor do ano a avaliar
	 * @return true ou false consoante o ano for bissexto ou n�o
	 */
	public static boolean anoBissexto(int ano)
	{
		// IMPLEMENTAR
		// Implemente a l�gica a partir do Fluxograma dado em anexo!
		
		if (ano % 4 == 0 ) {
			if (ano % 100 == 0) {
				if (ano % 400 == 0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
		
	}
	
	
	/**
	 * Diz quantos dias um determinado m�s tem 
	 * 
	 * @param mes Valor do enumerado Meses com o m�s a avaliar
	 * @return Devolve o n�mero de dias do m�s
	 * @throws IllegalArgumentException se o m�s passado for Fevereiro, � necess�rio usar a outra assinatura do m�todo
	 */
	public static int diasMes( Meses mes)
	{
		// IMPLEMENTAR
		// Implemente a l�gica a partir do Fluxograma dado em anexo!
		int dias;
		if(mes.getNumeroMes()<= 7 && mes.getNumeroMes()%2 != 0 || mes.getNumeroMes()>=8 && mes.getNumeroMes()%2==0) {
			dias = 31;
		}else {
			dias = 30;
		}
		
		return dias;
	}
	

	
	/**
	 * Diz quantos dias um determinado m�s tem. 
	 * esta assinatura com 2 argumentos � adequada quando � o m�s 2 (Fevereiro)
	 * 
	 * @param mes  Valor do enumerado Meses com o m�s a avaliar
	 * @param ano  Valor inteiro representando o ano 
	 * @return Devolve o n�mero de dias do m�s
	 */
	public static int diasMes( Meses mes, int ano)
	{
		// Testa se o ano � bisseexto caso o mes seja Meses.FEVEREIRO
		int dias;
		if(mes.getNumeroMes()== 2) {
			if(anoBissexto(ano) == true) {
				dias=29; 
			}else {
				dias=28;
			}
		}else {
			dias=diasMes(mes);
		}
			return dias;
		
		// Se n�o for Meses.FEVEREIRO, ignora o ano e chama o m�todo diasMes(mes)
		
	}

	
	
	
	
	
	
}
