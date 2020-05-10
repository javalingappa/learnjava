package access_specifiers.another_package;

import access_specifiers.same_package.ClassOne;

public class AccessSpecifiersAnotherPackageDemo extends ClassOne {
	public static void main(String[] args) {
		ClassOne classOne = new  ClassOne();
		System.out.println("Within the project but outside side the Package(With inheritance of a class from another package) Following Access Specifiers can be accessed");
		System.out.println("-----------------------------------------------");
		System.out.println(classOne.publicName);
		//System.out.println(classOne.defaultName); // The field ClassOne.defaultName is not visible
		AccessSpecifiersAnotherPackageDemo obj = new AccessSpecifiersAnotherPackageDemo();
		//System.out.println("the protected variables/methods can be accessed in any other package  through inheritance by subclass object only");
		System.out.println(obj.protectedName); // The field ClassOne.protectedName is not visible || Directly
		//protcted variables can't be accessed 
		System.out.println("-----------------------------------------------");
	//	System.out.println(classOne.privateName); //ERROR : The field ClassOne.privateName is not visible
	}

}
