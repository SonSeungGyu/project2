package study;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		int year = 2023;
		int month = 10;
		int day = 17;

		System.out.print(year);
		System.out.print("/");
		System.out.print(month);
		System.out.print("/");
		System.out.println(day);
		
		System.out.printf("%d년 %d월 %d일\n",year,month,day);
		
		//LocalDate 클래스의 now 메소드를 갖는 now 객체를 생성
		LocalDate now = LocalDate.now();
		System.out.println(now);  //2023-10-17
		
		//Date 클래스 타입의 객체 생성
		Date date = new Date();
		System.out.println(date);  //Tue Oct 17 10:18:56 KST 2023
		
		//SimpleDateFormat 타입 객체 생성 인자에 포맷형식을 준다.
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
		//formmater에서 format메소드를 이용하여 date를 출력
		System.out.println(formatter.format(date));  //2023/18/17
	}

}
