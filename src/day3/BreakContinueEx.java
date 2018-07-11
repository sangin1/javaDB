package day3;

public class BreakContinueEx {

	public static void main(String[] args) {
		System.out.println("break문 예제");
		for(int j =1; j<=5; j++){
			for(int i =1; i<=5; i++){
				System.out.println("j="+j+",i="+i);
				if( i==4){
					break;  //바로 위의 for문을 빠져나감
				}
			}
		}
		System.out.println("continue[건너뛰기]문 예저");
		for(int j =1; j<=5; j++){
			for(int i =1; i<=5; i++){
				
				if( i==4){
				continue;  //바로 위의 for문을 빠져나감
				}System.out.println("j="+j+",i="+i);
			}
		}
		System.out.println("이름이 있는 for문 break문 예제");
		Test:
		for(int j =1; j<=5; j++){
			for(int i =1; i<=5; i++){
				System.out.println("j="+j+",i="+i);
				if( i==4){
					break Test;  //원하는 이름으로 빠져나감
				}
			}
		}
		/*1부터 100까지 짝수의 합을 continue 문을 이용하여 작성하시오*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
