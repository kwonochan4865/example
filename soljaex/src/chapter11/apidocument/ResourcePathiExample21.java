package chapter11.apidocument;

import chapter10.exception.Car;

public class ResourcePathiExample21 {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("photo1.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		
		} 
}
