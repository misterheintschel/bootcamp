package day5;

public class Wrappers {
	public static void main(String[] args) {
		
		/*
		 * Wrapper Classes allow you to view a datatype as if it existed in a different
		 * inheritance heirarchy or provide more functionality to a datatype
		 *In java primitive datatypes all have a wrapper class associated with them in the JRE, these allow you to treat the primitive as if it were an object
		 *
		 *Java also allows you to convert between the primitive and wrapper
		 *automatically. This is referred to as autoboxing (primitive > wrapper) and
		 *unboxing (wrapper > primitive)
		 *
		 *
		 */
		
		
		int num = 10;
		Integer number = num; //autoboxing
		
		Double dbl = 10.0;
		double d = dbl; //unboxing
		
		int x = 1;
		System.out.println(x++);
		System.out.println(++x);
	}
}
