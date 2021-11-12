package teste;
/*
 *  METODO QUE RECEBA UMA STRING E RETORNE OUTRA STRING COM A 
 *  MODIFICAÇÃO DE TODAS AS PALAVRAS CHAVE ALTERADAS NA STRING POR OUTRA A ESCOLHA :  
 *  AINDA = até este momento  / mal = bem

 * */
public class ExercicioEstagio {
	public static void main(String[] args) {
		System.out.println(alteraPalavra("Ainda que mal pergunte,\r\n"
				+ "ainda que mal respondas;\r\n"
				+ "ainda que mal te entenda,\r\n"
				+ "ainda que mal repitas;\r\n"
				+ "ainda que mal insista,\r\n"
				+ "ainda que mal desculpes;\r\n"
				+ "ainda que mal me exprima,\r\n"
				+ "ainda que mal me julgues;\r\n"
				+ "ainda que mal me mostre,\r\n"
				+ "ainda que mal me vejas;\r\n"
				+ "ainda que mal te encare,\r\n"
				+ "ainda que mal te furtes;\r\n"
				+ "ainda que mal te siga,\r\n"
				+ "ainda que mal te voltes;\r\n"
				+ "ainda que mal te ame,\r\n"
				+ "ainda que mal o saibas;\r\n"
				+ "ainda que mal te agarre,\r\n"
				+ "ainda que mal te mates;\r\n"
				+ "ainda assim te pergunto\r\n"
				+ "e me queimando em teu seio,\r\n"
				+ "me salvo\r\n"
				+ ""));
	}
	
	
	public static String alteraPalavra(String palavra) {
	
		return palavra.replaceAll("(?i)ainda", "até este momento").replaceAll("mal", "bem");
	}
}
