package teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExercicioEstagio2 {

	public static void main(String[] args) {
		formatarData();
	}

		public static void formatarData() {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(cal.getTime());
			System.out.println(sdf.format(cal.getTime()));
		}
		
		

}