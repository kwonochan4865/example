package chapter7_inheritance;

public class ChildExample_33 {

	public static void main(String[] args) {
		Parent_31 parent = new Child_32(); //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 * parent.field2 = "data2";
		 * parent.method3();
		 */
		
		Child_32 child = (Child_32) parent; //강제 타입 변환
		child.field2 = "yyy";
		child.method3();
	}

}