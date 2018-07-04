package day2;

public class ForEx3 {

	public static void main(String[] args) {
/* 234의 약수를 구하는 코드를 작성하세요
 * 정수를 1부터 자기자신까지 나누어서 
 * 나머지가 0이 되면 그 수는 정수의 약수이다.
 * */
		int i = 0, num =234;
		System.out.print(num+"의 약수 :");
		for(i=1;i<=num;i++){
			if(num%i == 0){
				System.out.print(i+" ");
			}
		}
		/* 두 수의 최대 공약수를 구하는 코드를 작성하세요
		 * 최대공약수 : 두 수의 공약수중 가장 큰 수
		 * */
		System.out.println(" ");
		int num1 =500;
		int num2 = 200;
		int gcd =1;   //gcd = 최대공약수
		System.out.print(num1+"과"+num2 +"의 최대공약수는");
		for(i=1;i<=num1;i++){
			if(num2%i == 0 && num1%i ==0){
				gcd = i;  //1씩 증가되서 제일 마지막으로 증가된 i가 나타난다
			}
		}
		System.out.println(gcd);
		
		System.out.print(num1+"과"+num2 +"의 공약수는");
		for(i=1;i<=num1;i++){
			if(num2%i == 0 && num1%i ==0){
				System.out.print(i +" ");
			}
		}
	}
}