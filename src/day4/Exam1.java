package day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 복습
		//int num = 10;
		/*서식문자
		 * %d : 정수형
		 * %f, %lf : 실수형
		 * %c : 문자형
		 * %s : 문자열
		 * printf 쓸때 필요함*/
		//System.out.printf("num : %d\n",num);  
		//System.out.println("num : " +num);
		
		//조건문  [if, swich case] 
		/*if(조건식1){
			실행문1;
		}else if(조건식2){
			실행문2;
		}else{  //조건식 쓰면 안됨
			
		}*/
		/*정수형 변수 num이 홀수이면 홀수입니다 짝수이면짝수입니다를 출력*/
				int num =1;
				if(num%2==0){
					System.out.println("짝수입니다");
				}else{
					System.out.println("홀수입니다");
				}
				
				/*값은 정수상수와 문자상수만 올수있다.*/
				int month =1;
				switch(month){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				//=	//if(month ==1 || month ==3 || month ==5 || ... ||month==12)
				     System.out.println("마지막날 : 31일");
				     break;
				case 2:
					System.out.println("마지막날 : 28일");
				default:
		     
				}
		
		/*for(초기화 ;조건식 ;증감연산 ){
			실행문;
			}*/
		/*초기화는 반복문이 실행될때 처음 한번만 실행
		 * 조건식이 참이면 실행문, 증감연산, 조건식비교순으로 반복
		 * 조건식이 거짓으면 반복문 종료
		 * 
		 * 1부터 10까지 합*/
		int i =0;
		int sum =0;
		for(i=1; i<=10 ; i++){
			sum += i;
		}System.out.println(sum); 
		// 정수num이 소수인지 아닌지 판별하는 코드   1부터 num까지 나누었을때 나머지가0 이면 약수 약수의 수가2개면 소수*/
		num = 37;
		int cnt =0;
		for(i=1 ; i<=num ; i++){
			if(num%i==0){
				cnt ++;
				//System.out.println("약수 ="+i);
			} 
		}
			if(cnt == 2){
				System.out.println("소수입니다.");
			}else{
				System.out.println("합성수입니다");
			}
			/* 소수를 구하는 다른 방법    소수의 약수는 나를 제외한다면 1이다.
			 * 나를 제외한 약수 중 가장 큰 수가 1*/
		int div =0;
		num =10;
		for(i=num-1;  i>0 ; i--){
			if(num%i==0){
				div =i;
				break;
			}
		}if(div == 1 ){
			System.out.println(num+" = 소수");
		}else{
			System.out.println(num+" = 합성수");
		}                                         // 알고리즘 
		/*최대공약수 작성*/
		int num1=200, num2 =100, gcd =1;
		for(i=1 ; i<=num1 ; i++){
			if(num1%i==0 && num2%i ==0){
				gcd =i;
				break;
			}
		}
		System.out.println(num1+"과"+num2+"의 최대 공약수는 "+gcd);
		/* 다음 코드를 실행 했을 때 반복횟수와 반복문 종료후 i의 값은?
		 * 실행하지 않고 결과를 예상하세요
		 * 반복횟수 =5 , 종료후 i의값 =8
		 for(i=0; i<10; i+=2){
			 cnt++;
		 }*/
		//최소공배수를 구하는 코드 작성 최소공배수 변수와 2가지의 숫자 변수 와 반복문 변수 i가 필요
		int lcm =0;  //lcm = 최소공배수
		num1 =30; num2=20;
		for(i =num1 ; i<= num1*num2 ; i+=num1){
			if(i%num1==0 && i%num2==0){
				lcm =i;
				break;
			}
		}System.out.println(num1+" 과 "+num2+" 의 최소공배수는 "+lcm);
		   
		/* ****
		 * ****
		 * ****
		 * **** */
		Scanner scan = new Scanner(System.in);   //컨트롤 쉬프트 알파벳 o
		num = scan.nextInt();
		for(i=1 ;i <=num ; i++){
			for(int k =1 ; k<=4 ; k++){
				System.out.print("*");
			}System.out.println(" ");
		}
		/* *
		 * **
		 * ***
		 * **** */
		for(i=1 ; i <=num ; i++){
			for(int j =1 ;j<=i; j++){
				System.out.print("*");
			}System.out.println(" ");
		}
		/* *****
		 *  ****
		 *   ***
		 *    **
		 *     *  */
		for(i =1 ; i<=num ; i++){
			for(int j =1 ; j<=i-1 ; j++){
				System.out.print(" ");
			}
			for(int j =1 ; j <=num+1- i ; j++ ){
				System.out.print("*");
			}System.out.println(" ");
		}
		for(i =num ; i>=0 ; i--){
			for(int j =1 ; j<=num-i ; j++){
				System.out.print(" ");
			}
			for(int j =1 ; j <=i ; j++ ){
				System.out.print("*");
			}System.out.println(" ");
		}
		for(i=1 ; i<=num ; i++){
			for(int j =1 ; j<=num ; j++){   //공백+별 = 5 이기 때문에 j<=5
				if(j<=i-1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}System.out.println(" ");
		}
		/*    *     i=1 공백갯수 =2 +1 3 별의갯수=1   0 2
		 *   **     i=2 공백갯수 =1  -1 3 별의갯수=2   0 4
		 *  ***     i=3 공백갯수 =0  -3 3 별의갯수=3   0 6
		 *   **     i=4 공백갯수 =1  -3 5 별의갯수=2  -2 6
		 *    *     i=5 공백갯수 =2  -3 7 별의갯수=1  -4 6  
		 *                 Math.abs(3-i)      3-Math.abs(3-i)         
		 *  num=5 (num+1)/2  
		 *       */
		System.out.println(Math.abs(-1));  //절댓값  -1을 절댓값으로 출력
		for(i=1 ; i<=num ; i++){
			for( int j =1; j<=Math.abs((num+1)/2) ;j++ ){
				if( j<=Math.abs((num+1)/2-i)){
					
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
				
			}System.out.println( );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
