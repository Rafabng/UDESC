package util;


import java.util.List; 

public class Utilidades {
	
	public Utilidades() {
	}
	
	public boolean validaCPF(String cpf) {   
      boolean retorno = false; 
      
             
      String base = "000000000";   
      String digitos = "00";   
      if (cpf.length() == 11) {   
         if (cpf.length() < 11) {   
            cpf = base.substring(0, 11 - cpf.length()) + cpf;   
            base = cpf.substring(0, 9);   
         }   
         base = cpf.substring(0, 9);   
         digitos = cpf.substring(9, 11);   
         int soma = 0, mult = 11;   
         int[] var = new int[11];   
         // Recebe os n�meros e realiza a multiplica��o e soma.   
         for (int i = 0; i < 9; i++) {   
            var[i] = Integer.parseInt("" + cpf.charAt(i));   
            if (i < 9)   
               soma += (var[i] * --mult);   
         }   
         // Cria o primeiro d�gito verificador.   
         int resto = soma % 11;   
         if (resto < 2) {   
            var[9] = 0;   
         } else {   
            var[9] = 11 - resto;   
         }   
         // Reinicia os valores.   
         soma = 0;   
         mult = 11;   
         // Realiza a multiplica��o e soma do segundo d�gito.   
         for (int i = 0; i < 10; i++)   
            soma += var[i] * mult--;   
         // Cria o segundo d�gito verificador.   
         resto = soma % 11;   
         if (resto < 2) {   
            var[10] = 0;   
         } else {   
            var[10] = 11 - resto;   
         }   
         if ((digitos.substring(0, 1).equalsIgnoreCase(new Integer(var[9]).toString()))   
               && (digitos.substring(1, 2).equalsIgnoreCase(new Integer(var[10]).toString()))) {   
            retorno = true;   
         }   
      }    
      return retorno;   
   } 	
	
	  public static String geraExtenso(double vlr) {
		    if (vlr == 0)
		       return("zero");

		    long inteiro = (long)Math.abs(vlr); // parte inteira do valor
		    double resto = vlr - inteiro;       // parte fracionária do valor

		    String vlrS = String.valueOf(inteiro);
		    if (vlrS.length() > 15)
		       return("Erro: valor superior a 999 trilhões.");

		    String s = "", saux, vlrP;
		    String centavos = String.valueOf((int)Math.round(resto * 100));

		    String[] unidade = {"", "um", "dois", "três", "quatro", "cinco",
		             "seis", "sete", "oito", "nove", "dez", "onze",
		             "doze", "treze", "quatorze", "quinze", "dezesseis",
		             "dezessete", "dezoito", "dezenove"};
		    String[] centena = {"", "cento", "duzentos", "trezentos",
		             "quatrocentos", "quinhentos", "seiscentos",
		             "setecentos", "oitocentos", "novecentos"};
		    String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
		             "sessenta", "setenta", "oitenta", "noventa"};
		    String[] qualificaS = {"", "mil", "milhão", "bilhão", "trilhão"};
		    String[] qualificaP = {"", "mil", "milhões", "bilhões", "trilhões"};

		// definindo o extenso da parte inteira do valor
		    int n, unid, dez, cent, tam, i = 0;
		    boolean umReal = false, tem = false;
		    while (!vlrS.equals("0")) {
		      tam = vlrS.length();
		// retira do valor a 1a. parte, 2a. parte, por exemplo, para 123456789:
		// 1a. parte = 789 (centena)
		// 2a. parte = 456 (mil)
		// 3a. parte = 123 (milhões)
		      if (tam > 3) {
		         vlrP = vlrS.substring(tam-3, tam);
		         vlrS = vlrS.substring(0, tam-3);
		      }
		      else { // última parte do valor
		        vlrP = vlrS;
		        vlrS = "0";
		      }
		      if (!vlrP.equals("000")) {
		         saux = "";
		         if (vlrP.equals("100"))
		            saux = "cem";
		         else {
		           n = Integer.parseInt(vlrP, 10);  // para n = 371, tem-se:
		           cent = n / 100;                  // cent = 3 (centena trezentos)
		           dez = (n % 100) / 10;            // dez  = 7 (dezena setenta)
		           unid = (n % 100) % 10;           // unid = 1 (unidade um)
		           if (cent != 0)
		              saux = centena[cent];
		           if ((n % 100) <= 19) {
		              if (saux.length() != 0)
		                 saux = saux + " e " + unidade[n % 100];
		              else saux = unidade[n % 100];
		           }
		           else {
		              if (saux.length() != 0)
		                 saux = saux + " e " + dezena[dez];
		              else saux = dezena[dez];
		              if (unid != 0) {
		                 if (saux.length() != 0)
		                    saux = saux + " e " + unidade[unid];
		                 else saux = unidade[unid];
		              }
		           }
		         }
		         if (vlrP.equals("1") || vlrP.equals("001")) {
		            if (i == 0) // 1a. parte do valor (um real)
		               umReal = true;
		            else saux = saux + " " + qualificaS[i];
		         }
		         else if (i != 0)
		                 saux = saux + " " + qualificaP[i];
		         if (s.length() != 0)
		            s = saux + ", " + s;
		         else s = saux;
		      }
		      if (((i == 0) || (i == 1)) && s.length() != 0)
		         tem = true; // tem centena ou mil no valor
		      i = i + 1; // próximo qualificador: 1- mil, 2- milhão, 3- bilhão, ...
		    }

		    if (s.length() != 0) {
		       if (umReal)
		          s = s + " real";
		       else if (tem)
		               s = s + " reais";
		            else s = s + " de reais";
		    }

		// definindo o extenso dos centavos do valor
		    if (!centavos.equals("0")) { // valor com centavos
		       if (s.length() != 0) // se não é valor somente com centavos
		          s = s + " e ";
		       if (centavos.equals("1"))
		          s = s + "um centavo";
		       else {
		         n = Integer.parseInt(centavos, 10);
		         if (n <= 19)
		            s = s + unidade[n];
		         else {             // para n = 37, tem-se:
		           unid = n % 10;   // unid = 37 % 10 = 7 (unidade sete)
		           dez = n / 10;    // dez  = 37 / 10 = 3 (dezena trinta)
		           s = s + dezena[dez];
		           if (unid != 0)
		              s = s + " e " + unidade[unid];
		         }
		         s = s + " centavos";
		       }
		    }
		    return(s);
		  }
}