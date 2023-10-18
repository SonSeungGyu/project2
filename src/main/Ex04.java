package main;

public class Ex04 {
	public static void main(String[] args) {
		
		//정수형에는 4가지 종류가 있고, 양수/음수/0 값을 저장 할 수 있다.
		byte b = 10;     //1byte  -128 ~ 127 까지 저장 가능. 
		short s = 10;    //2byte
		int i = 10;      //4byte
		long l = 10;     //8byte 식별자 생략가능
		l = 12345678900l;//int형 범위를 넘어갈 때는 반드시 식별자를 명시해야한다.
		
		System.out.println(s + b);//서로 다른 자료형으로 더하기 연산을 할 수 있다.
		
		//b에 저장 가능한 값 중 가장 작은 값을 저장
		b = -128;
		
		//b에 저장 가능한 값 중 가장 큰 값을 저장
		b = 127;
		System.out.println(b);
	}
}
