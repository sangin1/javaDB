package day2;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class ForEx5 {

	public static void main(String[] args) {
		/* 정수가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 소수 : 약수가 1과 자기자신인수
		 * 방법 1 정수를 저장할 변수 num과 약수의 갯수를 저장할
		 * 변수 cnu와 반복문 변수i를 선언 및 초기화
		 * i는1부터 num까지 하나씩 증가하면서 반복
		 * i가num의 약수이면 약수의 갯수 1개 증가
		 * 반복문이 종료된후 cnt가 2개이면 소수 아니면 합성수로 출력
		 * 방법2 i는 num-1 부터 1까지 하나씩 감소하면서 반복
		 * num를 */
           int num =13, i =0, cnt=0;  //cnt는 약수의 개수 변수
   		for(i=1;i<=num;i++){
   			if(num%i ==0){
   			cnt++  ;   //약수의 개수를 1 증가
   			}
   		}
	    if(cnt == 2){
		System.out.println(num+"은  소수입니다");
	    }
	    else{
	    System.out.println(num+"은(는) 합성수입니다");
	    }
	    //방법2
	    for(i=num-1; i>=1; i--){
	    	if(num%i ==0){
	    		//이때 i가 num을 제외한 가장 큰 약수이다.
	    		break;
	    	}
	    }	       	   
	    //i가 1이면 num을 제외한 약수가 1이라는 의미이고,
	    //이는 약수가 2개라는 의미이므로 소수이다
	    if(i==1){
	    	System.out.println(num+"는 소수");
	    }else{
	    	System.out.println(num+"는 합성수");
	    }
	    for( ; ; ){
	    	//=무한루프
	    }
	}

}
