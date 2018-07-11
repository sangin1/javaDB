package day3;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*정수의 약수를 배열에 저장하는 코드를 작성하세요
		 * 배열은 10개짜리로 하고, 약수가 10개 이상인 수들은 10개까지만 구한다
		 * 1. 필요한 변수 선언 - 10개짜리배열, 반복문변수, 정수 선언
		 * 2. 약수를 출력하는 코드 작성
		 * */
		int div[] = new int [10];
		int i =0, num = 30;
		int sum =0;
		//약수의 갯수를 저장하는 변수
		i =1;
		while(i<=num){
			if(num%i==0){
				//System.out.println(i);
				div[sum] = i; 
				sum++;
				// 약수 i를 배열 div에 저장하는데 위치는 현제까지 찾은 약수의 갯수번지에 저장
				//그리고 저장한 후에는 약수의 갯수를 하나 증가한다.
				if(sum == 10)
					break;  //전제조건이 약수의 갯수를 최대 10개를 구하기로 했기 때문에 10개를 구하면 멈춤
				
			}
		 i++;
		}
		i =0;
		while(i<sum ){               //length를 쓰면 들어가지 않은 공간이 0으로 표시됨
		   System.out.print(div[i]+ " ");
		   i++;
		}
		

	}

}
