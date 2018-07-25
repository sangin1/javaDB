package day5;

import java.util.Scanner; //자바 until 아래의 스캐너(메소드)를 가저온다

public class MethodEx1 {
	/* 메소드 : 특정 기능을 하도록 모아놓은 코드
	 * 메소드는 입력 (매개변수)와 출력(리턴타입)이 필요하다
	 * 상황에 따라서 입력과 출력이 필요 없을수도 있다.
	 * 접근제한자(public) 출력(void) 메소드이름(main)
	 * (매개변수들(Steing[] args)){
	 *       구현;
	 * }      
	 * ex) 자판기를 예로 들자  입력(매개변수)는 돈, 선택한 음료
	 *                                  출력(리턴타입)은 선택된 음료
	 * 메소드는 클레스안에 들어가야한다
	 * */

	public static void main(String[] args) {    
		// TODO Auto-generated method stub
		/*두수와 연산자가 주어졌을 때 산술연산을 하는 코드를 작성하세요*/
	    int num1 = 10;
	    int num2 = 6;
	    char op = '/';  //연산기호  스캐너로 입력 받아서 사용
	    double res =0.0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("num1을 입력해주세요");
	    num1 = scan.nextInt();
	    System.out.println("연산자를 입력해주세요");
	    op = scan.next().charAt(0/*0번지[문자열의맨앞]을 캐릭터로 가져옴*/);
	    System.out.println("num2을 입력해주세요");
	    num2 = scan.nextInt();
	    res = calculate(num1, num2, op);
	    /*num1, num2, op가 매개변수  res를 리턴타입	
	    if(op == '+'){
	    	 res = num1 + num2 ;
	    }else if(op == '-'){
	    	res = num1 - num2;
	    }else if (op == '*'){
	    	res = num1 * num2;
	    }else if (op == '%'){
	    	res = num1 % num2;
	    }else if (op == '/'){
	    	res = (double)num1 / num2; //나누기는 실수도 되도록 더블은 붙여주자
	    }else{
	    	System.out.println("연산자를 잘못입력했습니다.");
	    }*/
	    System.out.println(""/*문자열 + 정수가 되어 3이 되지만
	    안붙이면 op가 아스키 코드[숫자]로 인식되어 정수 + 정수 가 되버림*/
	    		+ num1 + op +  num2 +"="+res);
	    /*이 코드를 메소드로 만들어보자[클레스 안이면 됨]*/
	   }
	 public static double calculate(int num1, int num2, char op){
	    	double res = 0.0;
	    	if(op == '+'){
		    	 res = num1 + num2 ;
		    }else if(op == '-'){
		    	res = num1 - num2;
		    }else if (op == '*'){
		    	res = num1 * num2;
		    }else if (op == '%'){
		    	res = num1 % num2;
		    }else if (op == '/'){
		    	res = (double)num1 / num2; 
		    }else{
		    	System.out.println("연산자를 잘못입력했습니다.");
		    }
	    	return res;
	    }

}
