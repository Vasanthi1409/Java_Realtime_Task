package realtime_Task.com;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RealTimeTask {

	public static void main(String[] args) {

		long mblno = 9876543210l;								
		String strvalueOfmblno = String.valueOf(mblno);
		System.out.println(strvalueOfmblno);					//1
		
		long parseLong = Long.parseLong(strvalueOfmblno);
		System.out.println(parseLong);							//2
		
		String Date = "14-12-2023";
		char space = ' ';
		String replace = Date.replace('-', space);
		System.out.println(replace);							//3
		
		String[] splitdate = replace.split(" ", 3);
		System.out.println(splitdate[0]);						//4
		System.out.println(splitdate[1]);						//5
		System.out.println(splitdate[2]);						//6
		
		char slash = '/';
		String replaceslash = Date.replace('-', slash);
		System.out.println(replaceslash);						//7
		
		LocalDate date = LocalDate.now();		
		LocalDate newdate1 = date.plusDays(100);				
		System.out.println("Current Date plus 100 days: "+newdate1);				//8
		LocalDate newdate2 = date.minusDays(100);
		System.out.println("Current Date minus 100 days: "+newdate2);				//8.1
		
		LocalDate d1 = LocalDate.of(2023, 12, 14);
		LocalDate d2 = LocalDate.of(2023, 12, 27);
		Period p = Period.between(d1, d2);
		System.out.println("Total days between the given two dates: "+p.getDays());	//9
		
		String landline = "044 565623";		
		String[] splitlandline = landline.split(" ", 2);
		System.out.println(splitlandline[1]);					//10
		
		String landline2 = "022 565623";	
		String[] splitlandline2 = landline2.split(" ", 2);
		String Fval = splitlandline2[0];
		String Sval = splitlandline2[1];
		String Fvalreplace = Fval.replace('2', '4');
		System.out.println(Fvalreplace+" "+Sval);				//11
		
		String Fnum1 = "10";
		String Fnum2 = "10";		
		int parseInt1 = Integer.parseInt(Fnum1);
		int parseInt2 = Integer.parseInt(Fnum2);
		System.out.println(parseInt1+parseInt2);				//12
		System.out.println(parseInt1-parseInt2);				//13
		System.out.println(parseInt1*parseInt2);				//14
		System.out.println(parseInt1/parseInt2);				//15		
		
		String fname = "firstname";
		String Firstname = fname.substring(0, 1).toUpperCase()+fname.substring(1, 5);
		String Lastname = fname.substring(5, 6).toUpperCase()+fname.substring(6, 9);
		String insertspace = Firstname+" "+Lastname;
		System.out.println(insertspace);						//16
		
		Firstname = fname.substring(0, 5);
		System.out.println(Firstname+" Eman");					//17
		
		String specialchar = "@first&name%";		
		String replacespecialchar = specialchar.replaceAll("[@&%]*", "");
		System.out.println(replacespecialchar);					//18
		
		String substring1 = specialchar.substring(0, 1);
		String substring2 = specialchar.substring(1, 6);
		String substring3 = specialchar.substring(6, 7);
		String substring4 = specialchar.substring(7, 11);
		String substring5 = specialchar.substring(11, 12);
		String Finalvariable = substring1+substring4+substring3+substring2+substring5;		
		System.out.println(Finalvariable);						//19
		
		String upperCasefname = fname.toUpperCase();
		System.out.println(upperCasefname);						//20
		String lowerCasefname = upperCasefname.toLowerCase();
		System.out.println(lowerCasefname);						//21
		
		String name = "dinagaran";
		String replaceN = name.replace('n', 'N');
		System.out.println(replaceN);							//22
		String unwantedspacedname = " first name ";
		System.out.println(unwantedspacedname.trim());			//23
		System.out.println(fname.length());						//24
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				count++;
				map.replace(ch, count);
			} else {
				map.put(ch, 1);
			}
		}

		for (Character key : map.keySet()) {
			if (map.get(key) != 1) {
				System.out.print(key + ", ");					//25
			}
		}
		System.out.println();

		for (Character key : map.keySet()) {
			if (map.get(key) != 1) {
				System.out.print(key + "=" + map.get(key) + " ");	//26
			}
		}
		System.out.println();
		
		String spacedname = "first name";
		String[] splited = spacedname.split(" ", 2);
		int count = splited[1].length();
		System.out.println(count);								//27		
		
		String time = "14:30";										
		String hour = time.substring(0, time.indexOf(":"));
		String min = time.substring(time.indexOf(":")+1);
		int hourInteger = Integer.parseInt(hour);
		int hour_1 = Integer.parseInt(hour);
		
		if(hourInteger>12 && hourInteger<24) {
			hourInteger = hourInteger-12;			
		}else if(hourInteger==24) {
			hourInteger = 0;
		}else if(hourInteger<0 && hourInteger>24){
			System.out.println("Invalid Format");
		}
		
		if(hour_1<12) {
			System.out.println(hourInteger+":"+min+" AM");
		}else {
			System.out.println(hourInteger+":"+min+" PM");		//28
		}
		
		String minutes = "100 mins";												
		String minutes_1 = minutes.substring(0, minutes.indexOf(" "));		
		String minutes_2 = minutes.substring(minutes.indexOf(" ")+1);
		int minval = Integer.parseInt(minutes_1);
		int hours = minval/60;
		minval = minval%60;
		String Finalmin = hours+"."+minval;
		System.out.println(Finalmin);							//29

		String Ftime = "14:30";									
		String Stime = "17:45";
		String Ftime1 = Ftime.substring(0, Ftime.indexOf(":"));
		String Ftime2 = Ftime.substring(Ftime.indexOf(":")+1);
		String Stime1 = Stime.substring(0, Stime.indexOf(":"));
		String Stime2 = Stime.substring(Stime.indexOf(":")+1);		
		int Ftime3 = Integer.parseInt(Ftime1);
		int Ftime4 = Integer.parseInt(Ftime2);
		int Stime3 = Integer.parseInt(Stime1);
		int Stime4 = Integer.parseInt(Stime2);		
		int diffhour = Ftime3-Stime3;
		int diffmins = Ftime4-Stime4;
		System.out.println(Math.abs(diffhour)+"."+Math.abs(diffmins));	//30		
		
		int num = 34;
		System.out.println(num==num);					//31
		
		int num1 = 30, num2 = 40, num3 = 45, num4 = 60;
		
		if(num1<num2) {
			System.out.println(num1+num2);					//32																		
		}
		
		if(num3>num4) {
			System.out.println(num3-num4);			
		}else {
			System.out.println(num3+num4);					//33
		}
	}

}
