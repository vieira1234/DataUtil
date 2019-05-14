package es.cliente.datautil;

import javax.swing.JOptionPane;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do m�s
		   Converte numero do m�s para um objecto do enumerado Meses e guarda na vari�vel mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     ent�o
		        LER ano
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		     sen�o
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		        
		   Fim_SE
		   
		
	    */ 
		int mes;
		int ano;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o m�s"));
			
		} while (mes < 0 && mes > 12);
		
		if (Meses.mesFromInt(mes) == Meses.FEVEREIRO) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
			System.out.println(Data.diasMes(Meses.mesFromInt(mes), ano));
		}else {
			System.out.println(Data.diasMes(Meses.mesFromInt(mes)));
		}
		
		
		
		
	}

}
