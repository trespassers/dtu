package Uge1_Opgave2;

public class MainClass {
	public static void main(String[] args) {
		Vector vector = new Vector(3, 4);
		Vector vector2 = new Vector(6, 8);
		Vector vector3 = new Vector(3, 5);
		
		vector.toString();
		vector2.toString();
		
		System.out.println(vector.add(vector2));
		System.out.println(vector.times(vector2));
		System.out.println(vector.times(4));
		System.out.println(vector.equals(vector2));
		System.out.println(vector.equals(vector3));
		System.out.println(vector.compareTo(vector2));
		System.out.println(vector2.compareTo(vector));
		System.out.println(vector.compareTo(vector3));
	}

}
