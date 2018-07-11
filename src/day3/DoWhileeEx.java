package day3;

import java.util.Scanner;

public class DoWhileeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mode='q';
		Scanner scan = new Scanner(System.in);           //컨트롤 알트 알파벳o =  스캐너불러오기 단축키
		do{
			System.out.println("매뉴");
			System.out.println("1. 학생정보추가");
			System.out.println("2. 학생정보출력");
			System.out.println("q. 프로그램 종료");
			System.out.println("매뉴를 선택하세요");
			mode = scan.next().charAt(0);
		}while(mode !='q');

	}

}
