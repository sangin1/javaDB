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
		int arr[] = new int[6]; //자동생성번호
		int arr2[] = new int[7]; //당첨번호
		int min =1, max = 8;
		int cnt = 0; // 현제까지 생성된 중복되지 않은 번호의 개수
		int num = 0;
		int count = 0;
		int size = 0;
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
			sort(arr,size);
			printArray(arr);
		}
		//당첨번호 배열을 만드세요 
		arr2 = createRandomArray(min, max, 7);
		if(arr2 == null){
			System.out.println("당첨번호 생성 실패");
		}else{
			sort(arr2,size);
			printArray(arr2);
			/*System.out.println("당첨번호 1번 = "+arr[0]);
			System.out.println("당첨번호 2번 = "+arr[1]);
			System.out.println("당첨번호 3번 = "+arr[2]);
			System.out.println("당첨번호 4번 = "+arr[3]);
			System.out.println("당첨번호 5번 = "+arr[4]);
			System.out.println("당첨번호 6번 = "+arr[5]);
			System.out.println("추가번호 = "+arr[6]);*/
		}
		count = countCheck(arr, arr2);
		System.out.println(count);
		
		printRank(arr,arr2);
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
	public static boolean  isDuplicate(int arr[], int num, int cnt){      //cnt = 배열의 크기
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
     * 3 . 매개변수 :  최솟값,최댓값,생성할 배열의 갯수 (int size)                 */
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
		if(size < 0){
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
		/*for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}*/
		for(int tmp:arr){
//     System.out.print(tmp + " ");   //향상된 for 문 읽기는되지만 쓰기는안됨, 배열 전체를 출력함
		System.out.printf("%2d ", tmp);
		}
		System.out.println();
	}
	/*  두 배열이 주어졌을때 같은 번호가 몇개 있는지 반환하는 메소드를 만드세요.
	 *   메소드명 : countCheck 
	 *   매개변수 : arr[], arr2[], 
	 *   리턴타입 : int
	 *   */
	public static int countCheck(int arr[], int arr2[]){
		int cnt = 0;
		int size = 0;
		if(arr.length > arr2.length){
			size = arr2.length;
		}else{
			size = arr.length;     //두 배열중 길이가 더 긴 것을 size로 하기 위해서.
		}
		/*for(int i = 0; i<size; i++){
			for(int j = 0; j<size;j++){
				if(arr[i] == arr2[j]){
					cnt++;
				}
			}
		}*/
		for(int i =0; i<size; i++){
			if(isDuplicate(arr, arr2[i], size)){
				cnt++;
			}
		}
		return cnt;
	}
	/* 두 배열을 비교하여 맞은 갯수에 따라 등수를 출력하는 메소드를 만드세요
	 * 1등은 6개, 2등은 5개+보너스번호, 3등은 5개  4등은 4개 5등은 3개
	 * 메소드명 : printRank
	 * 리턴타입 : arr[], arr2[]
	 * 매개변수 : void
	 * */
	public static void printRank(int arr[], int arr2[]){
		int count = countCheck(arr,arr2);
		boolean isBonus = false;
		if(arr.length > arr2.length){
			isBonus = 
			isDuplicate(arr2, arr[arr.length-1], arr2.length);
		}else{
			isBonus = 
			isDuplicate(arr, arr2[arr.length-1], arr.length);
		}
		if(count == 6){
			System.out.println("1등 당첨!!!!!!");
		}else if(count == 5){
			if(isBonus){
					System.out.println("2등 당첨!");
			}else{	
                    System.out.println("3등 당첨");
				
			}
		}else if(count == 4){
			System.out.println("4등입니다");
		}else if(count == 3){
			System.out.println("5등");
		}else{
			System.out.println("당첨되지않았습니다");
		}
	}
    public static void sort(int arr[], int size){
    	//버블정렬
    	for(int i =0; i<size-1; i++){
    		for(int j =0; j<size-1-i; j++){
    			//앞에 있는 수가 뒤에 있는 수보다 크면 서로 교환
    			if(arr[j] > arr[j+1]){
    				int tmp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = tmp;
    			}
    		}
    	}
		
	}
	
	
	
}
