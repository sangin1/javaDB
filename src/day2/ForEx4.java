package day2;

public class ForEx4 {

	public static void main(String[] args) {
		/* 두 수의 최소 공배수를 구하는 코드를 작성하세요
		 * 최소공배수 : 두 수의 공부새중 최소인 공배수
		 * i를 num1로 나누엇을때 나머지가0이고
		 * i를 num2로 나누엇을때 나머지가 0이면 i를 출력(공배수)하고 
		 * 반복문을 종료한다 반복문을 종료하기 위해서는 switch case문
		 * 에서 사용한 break를 이용한다.
		 * */
		int num1 =12, num2 =1111, i =0;
		int cnt =0; //반복횟수 알기위한 변수
		System.out.print(num1+"과"+num2+"의 공배수는 : ");
		for(i=num1; i <=num1*num2 ;i++){ //i+num1 을 하면 
			if(i%num1==0 && i%num2==0){
			System.out.print(i+" ");
			}
		}
		System.out.println("");
		for(i=num1; i <=num1*num2 ;i+=num1){  //i+num1 을 하면 큰수인 num2만 계산한다 
			cnt++ ;
			if(i % num2==0){
			   System.out.println("조금 : "+i);
			break;
			}
		}
		System.out.println("조금 반복횟수 : " +cnt);
		for(i=num1; i <=num1*num2 ;i++){
			cnt++ ;
		    if(i%num1==0 && i%num2==0){
				System.out.println("단순 : "+i);
			break;  //if문이 아니라 if문을 통해 반복문에서 빠져나온다
				        //첫번째에 겹치는 공배수가 나오면 빠져나오기 때문에
				        //최소공배수가 출력된다!
			}
		}
		System.out.println("단순 반복횟수 : " +cnt);
	     
		int tmpNum = num1;
		int div = num2;
		if(num2 > num1){
			tmpNum = num2;
			div = num1;
		}
		for(i=tmpNum; i <=num1*num2 ;i+=tmpNum){  
			cnt ++;
			if(i%div==0){
			System.out.println("많이 : "+i);
			break;
			}
		}
		System.out.println("많이 반복횟수 : " +cnt);
	}

}
