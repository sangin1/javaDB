package day2;

public class ForEx2 {

	public static void main(String[] args) {
		// 1부터 10 사이에 홀수만 출력하는 코드를 for문을 이용하여 작성
		int i=0;
		for(i=1; i<=10 ;i=i+2)  //i=i+2  =   i+=2
			System.out.println
			(i);
		/*
		for(i=1; i<=10 ; i++){        // 중괄호 후 if문 등을 활용할수도 있다
		 if(i%2 == 1){            // 하지만 횟수가 많아져 연산속도 저하!
		  System.out.println(i);
		}}
		1부터 10 까지의 합을 구하는 예제를 작성하세요
		 *  */
		int sum =0;
		for(i=1 ; i<=10 ; i++){
			sum = sum+i;   //i가 1일때 sum이 1이 되고 2일땐 sum이 1+2가 되는것을 반복
		}
		System.out.println("1~10 의 합 :"+sum);
		/*구구단 7단을 출력하는 코드를 작성하세요
		 * 출력예시
		 * 7 x 1 = 7
		 * ......
		 * 7 x 9 = 63                         
		 * */
		for(i=1 ; i<=9 ; i++){ //반복분 안에서 선언시 반복문에서만 사용가능
			System.out.println("7 x "+i +"=" + 7*i);
		}
		 
	}
}

