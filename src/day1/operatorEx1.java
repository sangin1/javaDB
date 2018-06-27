package day1;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class operatorEx1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1 = 10, num2 = 3;
        double res = 0;  //초기값은 0으로 설정한다. 
        //산술연산자 
        System.out.println("산술연산자 예제");
        res = (double) num1 + num2;  //(double)를 생략가능 
        System.out.println("num1 + num2 : " +res);
        res = num1 - num2;
        System.out.println("num1 - num2 : " +res);
        res = num1 * num2;
        System.out.println("num1 * num2 : " +res);
        res = (double)//임의로 더블[실수]로 바꿔줌 = 자료형변환
        		//자료형변환 : 명시적[글자로써줌], 자동 자료형변환
        		num1 / num2;
        System.out.println("num1 / num2 : " +res);
        res = num1 % num2;  // % = 나머지를 구함 , 홀짝이나 배수 판별할때 사용
        System.out.println("num1 % num2 : " +res);
        //정수 = 실수로 불가, 명시적 형변환을 이용하여 가능하게함 
        num1 = (int)res; 
        
        
       //비교연산자 : 결과가 참 또는 거짓을 반환
        boolean isPositive = false; //초기화 [값없이 사용시 에러 방지]   
        num1 = 20;
        //크거나같다 : >= (o), =>(x)
        //작거나 같다 : <=(o), =<(X)
        isPositive = num1 >= 0;
        System.out.println("num : " +num1 + ",양수 : " + isPositive);
        boolean isSame = false;
        // 같다 : == (o), =(X)
        isSame = num1 == 10;
        System.out.println("num : " +num1 + ",10과 같음 : " + isSame);
        boolean isDiffent = false;
        isDiffent = num1 !=10;
        System.out.println("num : " +num1 + ",10과 다름 : " + isDiffent);
	//논리연산자 : 결과가 true 아니면 fales
    //논리 연산자를 기준으로 좌, 우에 조건식이 들어가야함 
        // 조건식 : 참과 거짓으로 나뉘는 식 
        // (비교연산자를 이용한 식) 논리연산자 (비교연산자를 이용한 식)
        // 논리연산자기호 : &&[그리고], ![아니다], ||[또는] 
        num1 = 101;  
        // 0 <= num1 <= 100  
        //num1이 0보다 크거나 같고, num1이 100보다 작거나 같다.
        //false 
        //num1이 0보다 크거나 같거나, num1이 100보다 작거나 같다.
        //ture
        //&& 둘다 참일때만 참, 하나라도 거짓이면 거짓
        // || 둘다 거짓일때만 거짓, 하나라도 참이면 참
        // ! 참이면 거짓으로, 거짓이면 참으로
        // 0 <= num1   num1 <= 100
       boolean isScore = 0 <= num1 && num1 <= 100;
       System.out.println(num1+"은 유요한 성적인가:" +isScore);
	boolean isNot = !false;
	System.out.println("!false : " + isNot);
	// 비트논리연산자 : 두 변수를 비트로 나열한후 각 비트별로 논리 연산을 한다.
	//결과는 ture 또는 false 가 아닌 변수값이 나온다.
	//임베디드 프로그렘에서 주로 사용
	//&[그리고] |[또는] ~[아니다] ^[배타]
	num1 =7;
	num2 =10;
	int num3 = 7 & 10;
			// 7  : 00000000 00000000 00000000 00000111
			// 10 : 00000000 00000000 00000000 00001010
			//  2 : 00000000 00000000 00000000  00000010
			System.out.println("7&10 : " + num3); //+ num3 : num3 의 값을 추가한다. 
			num3 = 7 | 10;                        // "" 사이에 들어간 문자열은 화면에 출력만 한다.
			// 7  : 00000000 00000000 00000000 00000111
			// 10 : 00000000 00000000 00000000 00001010
			// 15 : 00000000 00000000 00000000 00001111
			System.out.println("7|10 : " + num3);
			num3 = 7 ^ 10;
			// ^ : 배타논리연산, exclusive, 서로 다르면1, 같으면0
			// 7  : 00000000 00000000 00000000 00000111
			// 10 : 00000000 00000000 00000000 00001010
			// 13 : 00000000 00000000 00000000 00001101
			System.out.println("7^10 : " + num3);
			num3 = ~7;
			// 7     : 00000000 00000000 00000000 00000111
			// ~7[-8]: 11111111 11111111 11111111 11111000
			//         -                                 1
			//       : 11111111 11111111 11111111 11110111
			//       : 00000000 00000000 00000000 00001000
			System.out.println("~7 : " + num3+ "이다" );  //num3 후 + 를 쳐야 뒷 문자열 출력 가능
			System.out.println(7+4);
			//7+4 를 한 후 계산 결과를 출력
			System.out.println(""+7+4);
			//""+7 을 해서 " 7" 이 만들어지고
			//"7"+4 를 해서  "74"가 만들어짐
			
			/*비트 쉬프트 연산자 : 비트를 이동시킴
			>> , <<
			*/
			// 15    : 00000000 00000000 00000000 00001111
			// 30    : 00000000 00000000 00000000 00011110
			// 60    : 00000000 00000000 00000000 00111100
			num1 = 15;
			num3 = num1 << 1; 
			System.out.println("15 << 2 :" + num3);
			// 15    : 00000000 00000000 00000000 00001111
			// 30    : 00000000 00000000 00000000 00011110
			// 60    : 00000000 00000000 00000000 00111100  //텝과 컨트롤텝으로 줄마추기!
			num1 = 15;
			num3 = num1 >> 1;
			System.out.println("15>>1 : " + num3);
			//증감연산자 : ++, --
			//++ : 원래 값에서 1이 증가 -- : 원래값에서 1이 감소
			//++변수명[전위형], --변수명[후위형]
			num1 = 10;
			num1++;
			System.out.println("계산후 후위형 num1 : "+num1);
			num1 = 10;
			num1++;
			System.out.println("계산후 전위형 num1 : "+num1);
			num1 = 10;
			System.out.println("계산중 후위형 num1 : "+num1++);
			num1 = 10;
			System.out.println("계산중 전위형 num1 : "+num1++);
			//전위형 : 증가 후 동작[대입연산, 화면에출력]
			//후위형 : 동작 후 증가
			
			// 조건 선택연산자[삼항연산자]
			// [조건식]?[값1]:[값2];
			// 조건식이 참이면 값1을, 거짓이면 값2 
			System.out.println((10%2==0)?"짝수":"홀수");
			
			
			
			
			
			
			
	}

}
