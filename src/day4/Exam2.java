package day4;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 향상된 for문*/
		int arr[] = new int[5];
		for(int i =0 ; i<5;i++){
			arr[i] = i;
		}
		/* 배열의 모든 데이터를 가져올 때 사용
		 * 배열의 값을 수정하지 않을 때 사용
		 * 모든 배열의 한번씩 접근이 필요할때
		 * */
		for(int tmp:arr){        //arr배열의 내용을 끄집어내 tmp라는 변수에 저장
			System.out.println(tmp);
		}
        
		/* 자료형이름[];
         * 자료형이름[] = new 자료형[배열의크기];
         * 
         * 정수num의 각 자리를 잘라서 배열에 거꾸로 저장하는 코드를 작성하세요.
         * 단, 반복문을 사용해야한다.
         *  num = 1234;
         *   0번지 = 4  1번지 =3 2번지 =2 3번지 =1
         *   1234 %10 4를 뽑아내어 0번지에 저장, 1234/10 =>123  //정수로 나누면 나머지가 없기 때문에 123만 남는다.
         *   123 %10 3을뽑아내어 1번지에저장, 123/10 =>12
         *   12 %10 2를 뽑아내어 2번지에 저장, 12/10 =>1
         *   1 => 1, 3번지에 저장, 1 =>0
         *   */
		int num=123456;
		arr = new int[11];
		int cnt = 0; //배열에 저장된 개수
		while(num != 0){
			arr[cnt] = num %10 ;         //마지막 자리를 추출하여 배열에 저장
			num = num/10;//숫자의 마지막 자리를 버리는 코드
			cnt++ ;//저장된 갯수 증가
		}
		int i =0;
		while(i<cnt){
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
