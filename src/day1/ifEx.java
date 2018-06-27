package day1;

public class ifEx {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
         if(조건식1){
		실행문; // 조건식이 참일때 실행됨
		} 
		else if(조건식2){
		        실행문2; //조건식1이 거짓이고, 조건식 2가 참일경우 실행됨
		        }
		else{
		    실행문3; //조건식1과 조건식2가 거짓일때 실행됨
		    }
		     if와 else if 의 순서가 중요!!
		*/
		int num = 0;
		//만약 num이 0이면 0입니다를 출력하세요
		if(num == 0){
			System.out.println("0입니다.");
		}
		// 만약 num를 2 로 나누었을때 0과 같다면, 콘솔에 짝수입니다를 출력하세요
		          //연산자 우선순위 햇갈리면 앞부터 소괄호!
		else if(num % 2 == 0){
			System.out.println(num+"는 짝수입니다.");
		}
		// 만약 num이 0이 아니고, 0을 2로 나누었을때 0과 같지 않다면 홀수를 출력하세요
		else{
			System.out.println(num+"는 홀수입니다.");
		}
		
		
		
		
		
		
		
	}

}
