package chapter9.nestedclassinfterface;

public class Anonymous12 {
	//필드 초기값으로 대입
	Person11 field = new Person11() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override 
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
	}
};
//--------------------------------------------------------------------------------------------------

	void method1() {
		//로컬 변수값으로 대입
		Person11 localVar = new Person11() {
	void walk() {
		System.out.println("산책합니다.");
	}
	@Override
		void wake() {
		System.out.println("7시에 일어납니다");
		walk();
	}
};
	//로컬 변수 사용
	localVar.wake();
}

//---------------------------------------------------------------------------------------------------
	
	void method2(Person11 person) {
		person.wake();
	}
}