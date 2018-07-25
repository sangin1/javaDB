package day5;

import java.util.Scanner;

public class MathMethod {

	public static void main(String[] args) {
		/*main메소드에 있는 num1, num2와
		 * GCD메소드에 있는 num1, num2는 서로 다른 변수이다.
		 * 메소드를 사용하는 이유
		 * 1. 코드의 중복을 최소화
		 * 2. 메소드를 재사용*/
		// TODO Auto-generated method stub
		/*최대공약수를 구하는 코드를 작성하세요
		 * 약수 - 1부터 자기자신까지 나눠서 나머지가 0인 수*/
		int i , num1 =20, num2 =10, gcd =1;
		Scanner scan= new Scanner(System.in);
		System.out.println("num1을 입력해주세요.");
		num1 = scan.nextInt();
		System.out.println("num2을 입력해주세요.");
		num2 = scan.nextInt();
		/*for(i=1; i<=num1; i++){
			if(num1%i==0 && num2%i ==0){
				gcd=i;
				
			}
		}*/
		/*gcd = GCD(num1,num2);
		System.out.println(num1+"과"+num2+"의 최대 공약수는"+gcd);*/ 
		
		
		
		
		int num3 =50, num4 =20, lcm= 0 ;	
		gcd = GCD(num1,num2);
	    lcm = LCM(num1,num2);
        System.out.println(lcm);
	
	}
	/*최대공약수 메소드*/
	public static int GCD(int num1, int num2){
		int i;
		int gcd =1;
		for(i=1; i<num1; i++){
			if(num1%i == 0 && num2 %i ==0){
				gcd =i;
			}
		}return gcd;
	}
	
	/*두수의 최소공배수를 구하는 코드를 이용해 매소드로 만들어보세요
	 * 공배수변수2개 최소공배수변수 lcm = a*b/gcd
	 * 메소드명 = LCM
	 * 리턴타임 = int
	 * 매개변수 = int num3, int num4      */ 
	public static int LCM(int num1, int num2){
		int i =0;
		int lcm =1;
		for(i=num1; i<=num1*num2; i+=num1)
			if(i%num2==0){
				return i;
			}   return 1;
	}
	public static int LCM2(int num1, int num2){
		return num1*num2/GCD(num1,num2);
	}
	

}
