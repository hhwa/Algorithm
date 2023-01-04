package basic;

import java.time.*;

public class getDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 5;
		int date = 25;
		LocalDate ldate = LocalDate.of(2016,month,date);
        DayOfWeek dayOfWeek = ldate.getDayOfWeek();
        
        int day = dayOfWeek.getValue();
        
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        System.out.println(days[day-1]);
	}

}
