package day5;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  0 <= x < 1
		 *  0 <= 10*x < 10
		 *  1<= 10*x+1 <11   
		 *  */
		/*int min =50, max =100;   //표준화를 위해
		for(int i = 0; i<10; i++){
			int num = randomInt(min,max);         //Math.random() = 0.0보다 크거나같고 1.0 보다 작은 실수를 랜덤으로 만듬
			System.out.println(num);
		}*/
		int arr[] = new int[6];
		int i;
		int min =1, max = 6;
		int cnt = 0; // 현제까지 생성된 중복되지 않은 번호의 개수
		int num = 0;
		/* 랜덤으로 중복되는 로또 번호
		for(i=0; i<arr.length; i++){
			arr[i] = randomInt(min,max);
		} */
		
		/*중복로또코드를 이용하여 중복되지 않는 로또번호를 생성하는 코드를 작성하세요*/
		/*for(i =0; i<arr.length; i++){
			arr[i] =0;
		}
		for( ; cnt<arr.length; ){
			int tmp = randomInt(min,max);
			if(isDuplicate(arr, tmp, cnt)==false){  //cnt를 추가해서 cnt 번지수까지만 비교해서 
				                                               //0이 들어갈경우 초기화값을 비교하는걸 막아줌 [예외방지]
				arr[cnt] = tmp;
				cnt++;
			}*/ 
			/*tmp가 arr과 중복된 값이 없으면
			 * tmp를 arr에 저장
			 * cnt를 하나 증가*/
			
			
		arr = createRandomArray(min, max, 6);
		if(arr == null){
			System.out.println("로또번호 생성 실패");
		}else{
			/* 생성된 배열 출력*/
			printArray(arr);
		}
	}
	/*최솟값과 최댓값을 입력받아 최솟값과 최댓값 사이에 있는 랜덤한 수를 생성하는 메소드
	 * 1. 메소드명 : randomInt
	 * 2. 매개변수 : 최솟값(int min), 최댓값(int max)
	 * 3. 리턴타입 : 랜덤한 정수 (int) 
	 * */
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;    //두수 교환하기
		}
		return  (int)(Math.random()*(max-min+1)+min);
	}
	
	/*배열 arr에 num의 값이 있는지 없는지 확인하는 코드 작성 
	 * 반복문을 이용하여 배열 arr의 0번지부터 5번지의 값을 하나씩 가져와서 num과 같다면 강제종료
	 * 반복문이 종료되면 종료되고 난 후에 i가 6이면 없음.
	 * 6이 아니면 있음을 출력한다.*/
	/*if(!isDuplicate(num, arr)){      //매개변수 등록 순서를 맞춰야 함!!
		System.out.println("없음");
	} else{
		System.out.println("있음");
	}*/
	/*main 메소드에서 작성한 코드를 이용, 배열 arr에 num과 같은 값이 있는지 없는지 판별하는 메소드*/
	public static boolean  isDuplicate(int arr[], int num, int cnt){
		for(int i = 0; i<cnt; i++){   //length = 배열의 길이!
			if(arr[i] == num){
				return true;
			}
		}
			return false;                     // 자료형이 boolean - 있으면 true, 없으면 false 를 출력하기 위해서
	}
    /* 중복되지 않은 랜덤한 수를 생성하여 배열에 저장하는 메소드
     * 1. 메소드명 : createRandomArray
     * 2. 리턴타입 : int []
     * 3. 매개변수 :  최솟값,최댓값,생성할 배열의 갯수 (int size)                 */
	public static  int[] createRandomArray(int min, int max, int size){
		int cnt=0;
		if(min > max){
			/*int tmp = min;
			min = max;
			max = tmp;*/     //두가지를 바꿔주자
			return null;       //잘못입력했으니 안바꿔줌
		}
		if(max-min+1 < size){   //6개배열에 5개만 넣나면 무조건 중복된 배열이 나타나기 때문에
		    return null;
		}
		int arr[] = new int[size];
		for( ; cnt<arr.length; ){
			int tmp = randomInt(min,max);
			if(isDuplicate(arr, tmp, cnt)==false){ 
				arr[cnt] = tmp;
				cnt++;
			} 
		}
		return arr;
	}		
	public static void printArray(int arr[]){  //콘솔에 출력만 할 경우 void 를 쓴다.
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
