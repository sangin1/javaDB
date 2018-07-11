package day3;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//무한 루프가 생성되는 경우
        /* 1.가장 기본적인 무한루프 만드는법
         * for( ; ; ){
         *    system.out.println("hellow world");
         *    }
         */
		//2. 잘못된 초기화로 인한  반무한루프
		/*int i -1;
		for(i=-100000000000 ;i<=10 ; i++){
			System.out.println("hello world");
		}*/
		//3. 잘못된 조건으로 인한 반무한루프
		/*int i =1;
		for(i =1; i>=1; i++){
			System.out.println("hello world");
		}*/
		// 4. 잘못된 증감연산으로 인한 무한루프
		/*int i =1;
		for(i=1 ;i<=10 ;  ){
			System.out.println("hello world");
		}*/
		//5. 잘못된 증감연산으로 인한 반무한 루프
		/*int i =1;
		for(i=1 ;i<=10 ; i-- ){
			System.out.println("hello world");
		}*/
		/*반복문 실행이 한번도 안되는 경우
		 * 1. 변수 초기화를 잘못한 경우*/
		
		/*for(int i=1; i<=10; i++){
			System.out.println("Hello world");
		}*/
		/*2. 변수초기화를 하지 않은 경우 */
		/*int i =0;
		for(i =1; i<= 10; i++){
			System.out.println("Hello world");
		}
		
		for( ; i<=10; i++){
			System.out.println("Hello world2");
		} */
	    //3. 조건식을 잘못한 경우
		for(int i =1; i>=10; i++){
			System.out.println("Hello world1");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
