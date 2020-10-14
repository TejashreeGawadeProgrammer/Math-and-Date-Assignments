import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalenderInbuildAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date( );
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2020,7,15,13,24,56);
		

		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);        
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); 
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		
		
		TimeZone zone = TimeZone.getDefault();  
		String name = zone.getDisplayName();         
		System.out.println("Display name for default time zone: "+ name);  
		
		System.out.println("Crrent Date is:"+sdf.format(d));
		
		System.out.println(sdf.format(calendar.getTime()));
			
		System.out.println("year : " + year);
		System.out.println("month: " + month);
		System.out.println("dayOfMonth : " + dayOfMonth);
		System.out.println("dayOfWeek: " + dayOfWeek);
		System.out.println("weekOfYear: " + weekOfYear);
		System.out.println("weekOfMonth : " + weekOfMonth);
			
		System.out.println("hour : " + hour);
		System.out.println("hourOfDay : " + hourOfDay);
		System.out.println("minute: " + minute);
		System.out.println("second : " + second);
		

	}

}
