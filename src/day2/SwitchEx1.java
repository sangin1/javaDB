package day2;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*switch(변수){
    case 값1:  //if(변수 == 값1)
    	 실행문1;
    	 break;  //브레이크가 없으면 밖으로 빠져나가지 않고 값2가 실행됨
    	         //있으면 변수값이 1일때 실행문 1만 실행하고 없으면 
    	         //변수값이 1일때 실행문1과 2가 동시에 실행됨 
    case 값2:  //else if (변수 ==값2)
    	 실행문2;
    	 break;
    default:  //else
    	 실행문3; */
		//num의 값이 0이면 콘솔에 0입니다라고 출력하고
		//num의 값이 1이면 콘솔에 1입니다라고 출력하고
		//num의 값이 0과 1이 아니면 콘솔에 0과 1이 아닙니다 라고 출력하는 예쪠
		int num = 3;
		switch(num){
		case 0:  //if(num==0)
		    System.out.println("0입니다");
		    break;
		case 1:  //else if (num == 1)
		     System.out.println("1입니다");
		     break;
		default:  //else
			System.out.println(num+"은(는)0과 1이 아닙니다");
    }
	}

}
