package chapter7.inheritance;

public abstract class Animal40 { //추상 클래스
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다."); 
}

	public abstract void sound(); //추상 메서드
}