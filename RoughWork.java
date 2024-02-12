package realtime_Task.com;

import java.time.LocalDate;
import java.time.Period;

public class RoughWork {

	public static void main(String[] args) {
		
		int num = 546;
		String stringnum = String.valueOf(num);
		System.out.println(stringnum);
		
		int parseIntnum = Integer.parseInt(stringnum);
		System.out.println(parseIntnum);
		
		String Date = "04-01-2024";
		String replace = Date.replace('-', ' ');
		System.out.println(replace);
		
		String[] split = replace.split(" ", 3);
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		
		String replace2 = replace.replace(' ', '/');
		System.out.println(replace2);
		
		LocalDate d = LocalDate.now();
		LocalDate plusDays = d.plusDays(100);
		LocalDate minusDays = d.minusDays(100);
		LocalDate plusMonths = d.plusMonths(1);
		LocalDate plusWeeks = d.plusWeeks(1);
		LocalDate plusYears = d.plusYears(1);
		System.out.println(plusDays);
		System.out.println(minusDays);
		System.out.println(plusMonths);
		System.out.println(plusWeeks);
		System.out.println(plusYears);
		
		LocalDate d1 = LocalDate.of(2024, 01, 04);
		LocalDate d2 = LocalDate.of(2024, 01, 11);
		Period P = Period.between(d1, d2);
		System.out.println(P.getDays());
		
		String ld = "044 565623";
		String[] split2 = ld.split(" ", 2);
		System.out.println(split2[1]);
		
		String replace3 = split2[0].replace("4", "2");
		System.out.println(replace3+" "+split2[1]);
		

	}

}
