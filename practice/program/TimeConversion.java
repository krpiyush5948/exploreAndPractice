package practice.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Date date = new Date();
//		TimeConversion min = new TimeConversion();
//		System.out.println(min.convertMinuteIntoHours("110").split(":"));
		 Date date1 = new Date();  
		 Date date2 = new Date();
		 System.out.println(date1);
		 SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
		 System.out.println(formatter.format(date1));
		
	}
	String convertMinuteIntoHours(String time) {
		SimpleDateFormat sdf = new SimpleDateFormat("mm");
		Date dt = null;
		try {
			 dt = sdf.parse("110");
			sdf = new SimpleDateFormat("HH:mm");
			System.out.println(sdf.format(dt));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sdf.format(dt);
	}
	

}
