package chapter4.ifexample;

public class WhileSumFrom1To100Example15 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) { //for문 중 for(int i = 0; i<=100; i++) {} 과 같음
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
