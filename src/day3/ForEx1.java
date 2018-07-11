package day3;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		 * ===
		 * ===
		 * ===
		 * ===
		 * ===
		 */
		for(int i=1; i<=5 ; i++){
			for(int j =1; j<=3; j++){
				System.out.print("=");
			}
			System.out.println();
		}
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * ***** ==i
		 */
		for(int i =1; i<=5;i++){
			for(int j =1; j<=i  ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 *     *  i=1, 공백의갯수 4 , 별의갯수: 1
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		//방법 1
		for(int i =1; i<=5; i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//방법2
		for(int i =1; i<=5; i++){
			for(int j=1; j<=5;j++){
				if(j<=5-i)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}
		/*     *
		 *    ** *
		 *   *** **
		 *  **** ***
		 * ***** ****
		 * */
		for(int i =1;i<=5; i++){
			for(int j =1; j<=5-i ;j++){
				System.out.print(" ");
			}
			for(int j =1; j<=i ; j++){
				System.out.print("*");
			}
			for(int j=1; j<=i-1;j++){
				System.out.print("*");
			}
			System.out.println();	
		}
		
		for(int i =1; i<=5; i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*  *********
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 * */
 		for(int i =1; i<=5 ; i++){
 			for(int j=1 ;j<=i-1 ;j++){
 				System.out.print(" ");
 			}
 			for(int j=1 ; j<=6-i ; j++){
 				System.out.print("*");
 			}
 			for(int j =1; j<=5-i ;j++){
 				System.out.print("*");
 			}
 			System.out.println();
 		}  
 		//2
 		for(int i =1; i<=5; i++){
 			for(int j=1 ; j<=i-1;j++){
 				System.out.print(" ");
 			}
 			for(int j=1; j<=11-2*i;j++){
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		//3               공백+별 =9 8 7 6 5 -> 2*5-i
 		for(int i=1; i<=5; i++){
 			for(int j=1; j<=2*5-i ;j++){
 				if(j <= i-1)
 					System.out.print(" ");
 				else
 					System.out.print("*");
 			}
 			System.out.println();
 		}
 		/*구구단 전체를 출력하는 코드를 작성하세요.*/
 		int i =0;
 		for(i=2 ; i<=9 ; i++){
 			System.out.println(i+"단");
 			for(int j =1; j<=9 ; j++){
 				System.out.println(i+" x "+j+"="+(i*j));
 			}
 		}
		/*2부터 100이하의 모든 소수를 출력하세요*/
 		int cnt=0, a=0;
 		System.out.println("2부터 100 이하의 소수");
 		for(a=2 ; a<=100 ;a++){
 			cnt=0;  //cnt 초기화를 안하면 중첩이 되어 a=2 인 2만 출력된다.
	   		for(i=1 ;i<=a;i++){
	   			if(a%i ==0){
	   			cnt++  ;    
	   			}
	   		}
	   		if(cnt == 2){
	   			System.out.print(a + " ");
	   			//System.out.println(cnt);
	   		}
 		}
	    
		
		
		
		
		
		
		
		
		
		
	
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}
	

}
