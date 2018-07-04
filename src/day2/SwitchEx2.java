package day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 문자 ch 가 a 또는 A이면 A입니다라고 콘솔에 출력하고
 * 문자 ch 가 b 또는 B이면 B입니다 라고 콘설에 출력하고
 * 문자 ch가 a,b,A,B가 아니면 A와B가 아닙니다 라고
 * 콘솔에 출력하는 예제를 switch case 문으로 작성하세요*/
char ch = 'a';    //간혹 정수에 해당되는 아스키 코드표로 나타내기도 한다.
switch(ch){
case 'a':   //ch의 값이 a이면
case 'A':
	System.out.println("A입니다");
	break;
case 'b': 
case 'B':
	System.out.println("B입니다");
	break;
default:
	System.out.println("A와B가 아닙니다");
}


int num =31;
switch(num%2){   //스위치 옆 소괄호에는 연산자 적용이 가능하다.
case 0 :
	System.out.println(num+"은(는) 짝수입니다");
	break;
default:
	System.out.println(num+"은(는) 홀수입니다");

}
	}

}
