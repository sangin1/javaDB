package day3;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;   //초기화
		while(i<=5){ //조건식                                                                 //for 문과 while 문은 호황된다.[변환가능]  초기화와 증감연산이 안인지 밖인지 차이
			System.out.println("Hello world!"); //실행문
			i++;  //증감연산
		}
		//표준입력받는 방법
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2 = scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch = scan.next().charAt(0);  //charAt 의 0번째 문자열[next] 를 가져온다
		System.out.println("ch = "+ch);
		scan.close();*/
		Scanner scan = new Scanner(System.in);     //증감연산자가 필요없을때  주로while문을 많이 쓴다
		char mode = 'a';
		while(! (mode == 'q' || mode == 'Q')){
			System.out.println("프로그램을 종료하려면 q 또는 Q를 눌러주세요. : ");
			mode = scan.next().charAt(0);
		}
		System.out.println("프로그램을 종료합니다");
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
