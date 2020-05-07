package chapter7.inheritance;

public abstract class Phone37 {
	//필드
	public String owner;
	
	//생성자
	public Phone37(String owner) {
		this.owner = owner;
	}
	
	//메서드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
