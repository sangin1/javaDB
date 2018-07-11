package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*배열은 자료형이 같은 변수를 하나로 묶은 것으로,
		 * 돌일한 목적의 변수이여야 한다*/
		//int num1, num2, num3, num4, num5;     //메모리상에서 랜덤으로 할당
		int num[] = new int [5];              //연속된 메모리 공간 할당  //num은 새로 만든 int 5개의 주소?//반복문가능 
		/* 1. 배열을 쓰면 반복문을 이용하기 편하다
		 * 2. 배열의 값을 가져오기 위해서는 배열의 인덱스로 접근해야하는데 인덱스의 시작 번지는 0번지이다.
		 * 3. 배열의 마지막 인덱스(번지)는 배열의 크기-1이다. 배열의크기가 5 라면 0,1,2,3,4 이다.
		 * */	
		//num[0] = 1; //0번지에 1을 저장
		System.out.println("배열 기본 예제");
		for(int i=0; i<num.length; i++){
			num[i] = i+1;
		}
		for(int i=0; i<num.length; i++){
			System.out.println("num["+i+"] : " +num[i]);
		}
		
		//int[] 공통으로 되어 num1,num3이 배열이 됨
		int []num1,num3;
		//int가 공통으로 되어 num2는 배열, num4는 일반 변수가됨
		int num2[],num4;
		num1= new int[3]; // 선언하고 바로 할당하지 않아도 됨
        /* num1 : 배열
         * num2 : 배열
         * num3 : 배열
         * num4 : 변수
         * */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		if(size >= 0)
			num1 = new int[size];
		scan.close();
		
		int num5[] ={1,2,3,4,5}; //번지에 들어가는 숫자를 정할수 있다
        System.out.println("초기화 예제");
        for(int i=1; i<num5.length ; i++){
        	System.out.println("num[" +i+ "] : " +num5[i]);
        }
		int num6[];
		//num6 = {1,2,3,4,5};//초기화는 배열을 선언할때만 가능
		
		
		
		
	}

}
