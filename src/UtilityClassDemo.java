import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * Java에서 날짜/시간을 처리하는 5가지 방법
 * 1.java.util.Date class
 * 2.java.util.Calendar class
 * 3.java.text.DateFormat
 * 4.java.text.SimpleDateFormat class
 * 5.printf() 
 */
public class UtilityClassDemo {
	public static void main(String[] args) {
		//Date now = new Date();
		//System.out.println(now.getTime()); //1660199944312
//		File file = new File("C:/Temp/sungjuk_utf8.dat");
//		long last=file.lastModified();
//		System.out.println(last);
//		Date createTime =new Date(last);
//		System.out.println(createTime);
//	Date before = new Date(1660199911798L);
//	System.out.println(before);
	
		Calendar today =Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month =today.get(Calendar.MONTH)+1;
		//int day = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년"+month+"월"+day+"일입니다.");
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.FRENCH);
		System.out.println(df.format(new Date()));
		
		String pattern ="오늘은 yyyy년 MM월 dd일 입니다.";
		SimpleDateFormat sdf =new SimpleDateFormat();
		System.out.println(sdf.format(new Date()));
		
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.\n",new Date());
		
	}
	}

