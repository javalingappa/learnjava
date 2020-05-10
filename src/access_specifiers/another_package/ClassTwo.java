package access_specifiers.another_package;

import access_specifiers.same_package.ClassOne;

public class ClassTwo  extends ClassOne {
	
	public static void main(String[] args) {
		ClassOne classOne = new  ClassOne();
		System.out.println("Within the project but outside side the Package(without inheritance) Following Access Specifiers can be accessed");
		System.out.println("-----------------------------------------------");
		System.out.println(classOne.publicName);
		//System.out.println(classOne.protectedName); // The field ClassOne.protectedName is not visible || Directly
		//protcted variables can't be accessed 
		//System.out.println(classOne.defaultName); // The field ClassOne.defaultName is not visible
		System.out.println("-----------------------------------------------");
	//	System.out.println(classOne.privateName); //ERROR : The field ClassOne.privateName is not visible
	}

}
