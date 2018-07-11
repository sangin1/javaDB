package day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*배열을 이용하여 학생 5명의 성적을 키보드를 통해 입력받고 
		 * 받은 점수를 출력하는 코드를 작성하세요*/
		int score[] = new int[5];
		Scanner scan = new Scanner(System.in);        //키보드로 입력받을때의 스캐너
		for(int i =0 ; i<score.length ; i++){         //length = score 배열의 길이  [여기선 5]
			System.out.println("학생" + (i+1)+"의 점수를 입력하세요 : ");
			score[i] = scan.nextInt();
		}
		for(int i =0; i < score.length; i++){
			System.out.println("학생"+(i+1)+"의 점수 : " +score[i]);
		}
		/*학생들의 평균을 구하는 코드를 작성하세요 */
		//double avg1 = (score[0]+score[1]+score[2]+score[3]+score[4])/5.0;
		//System.out.println(avg1);
		int sum=0;
		int avg = 0;
		for(int i =0; i< score.length ; i++){
			sum = sum + score[i];	
			avg += (double)score[i]/score.length;
		}
		System.out.println("학생들의 평균 점수 : " + (double)sum/score.length); 
		System.out.println("학생들의 평균 점수 : " +avg);

	}

}
