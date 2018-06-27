package day1;

public class ScoreifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 정수로 된 성적을 학점으로 출력하세요
 * 0~59 : F
 * 60~69  D
 * 70~79  C
 * 80~89  B
 * 90~100 A
 * 그외 : 성적을 잘못 입력했습니다.
 *  */
		int score = 110;
	    if ( 90 <= score && score <= 100){
			System.out.println("학점이 A 입니다");
		}
		else if ( 80 <= score && score <= 89){
			System.out.println("학점이 B 입니다");
		}
		else if ( 70 <= score && score <= 79){
			System.out.println("학점이 C 입니다");
		}
		else if ( 60 <= score && score <= 69){
			System.out.println("학점이 D 입니다");
		}
		else if ( 0 <= score && score <= 59){
			System.out.println("학점이 F 입니다");
		}
		else{
			System.out.println("성적을 잘못 입력하셧습니다.");
		}
		
		// else if 을 해야 효율적이다 첫번째는  if 
		
	}

}
