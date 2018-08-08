package day6;

import java.util.Scanner;

public class Baseballgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  컴퓨터 vs 사용자  
		 *   컴퓨터는 문제를 출제 : 랜덤으로 1~9사이의 중복되지 않는 숫자 3개를 선택
		 *   사용자 : 컴퓨터가 선택한 숫자 3개를 순서와 함께 맞춰야한다.
		 *   컴퓨터 : 1 3 5
		 *   사용자 : 1 2 3
		 *   컴퓨터 : 1s 1b
		 *   사용자 : 2 4 8
		 *   컴퓨터 : 3O
		 *   사용자 : 1 3 5
		 *   컴퓨터 : 3S
		 *   정답입니다.
		 *   프로그램을 종료합니다.
		 *   S : 해당 숫자가 있고 해당 순서가 일치할때
		 *   B : 해당 숫자가 있고 해당 순서가 일치하지 않을때*/

		int com[] = createRandomArray(1,9,3);
		int user[] = new int [3];
		int ball = 0;
		int strike = 0;  
		Scanner scan = new Scanner(System.in);
		//System.out.print("정답 : ");
		//printArray(com);
		while(strike != 3){
			System.out.print("숫자 3개를 입력 : ");
			user[0] = scan.nextInt();
			user[1] = scan.nextInt();
			user[2] = scan.nextInt();
			
			strike = getStrike(com, user);
			ball = getBall(com, user);
			printResult(strike, ball);
			
		
	    }
		scan.close();
		System.out.println("정답입니다");
		System.out.println("프로그램을 종료합니다");
	}
	
	public static int  isDuplicate(int arr[], int num, int cnt){      
		for(int i = 0; i<cnt; i++){   
			if(arr[i] == num){
				return i;
			}
		}
			return -1;                     
	}
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;    
		}
		return  (int)(Math.random()*(max-min+1)+min);
	}
	
	
	public static  int[] createRandomArray(int min, int max, int size){
		int cnt=0;
		if(min > max){
			
			return null;      
		}
		if(max-min+1 < size){  
		    return null;
		}
		if(size < 0){
			return null;
		}
		int arr[] = new int[size];
		for( ; cnt<arr.length; ){
			int tmp = randomInt(min,max);
			if(isDuplicate(arr, tmp, cnt)==-1){ 
				arr[cnt] = tmp;
				cnt++;
			} 
		}
		return arr;
	}		
	public static void printArray(int arr[]){  
		for(int tmp:arr){
        System.out.printf("%2d ", tmp);
		}
		System.out.println();
	}
	/* 스트라이크가 몇개인지 확인하는 매소드를 생성하세요
	 * 매소드명 : getStrike
	 * 리턴타입 : int
	 * 매개변수 : arr[],arr2[]           */
	public static int getStrike(int com[], int user[]){
		int cnt = 0;
		for(int i =0; i<com.length;i++){
			/*if(com[i] == user[i]){
				cnt++;
			}*/
		
		  if(isDuplicate(com, user[i], 3) == i){
			cnt++;
		   }
		}
		return cnt;
	}
	/*볼이 몇개인지 확인하는 메소드*/
	public static int getBall(int com[], int user[]){
		int cnt = 0;
		for(int i =0; i<com.length; i++){
			int tmp = isDuplicate(com, user[i], com.length);
			if(tmp !=-1 && tmp !=i){    //tmp = i 라면 스트라이크이기 때문에
				cnt++;
			}
	    }
		return cnt;
	}
	public static void printResult(int strike, int ball){
		if(strike != 0){
			System.out.print(strike+"S");
		}
		if(ball != 0){
			System.out.print(ball+"B");
		}
		if(strike ==0 && ball ==0){
			System.out.print("3O");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
