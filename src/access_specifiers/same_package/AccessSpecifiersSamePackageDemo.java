package access_specifiers.same_package;

public class AccessSpecifiersSamePackageDemo {
	
	public static void main(String[] args) {
		ClassOne classOne = new  ClassOne();
		System.out.println("Within  the Same Package Following Access Specifiers can be accessed");
		System.out.println("-----------------------------------------------");
		System.out.println(classOne.publicName);
		System.out.println(classOne.protectedName);
		System.out.println(classOne.defaultName);
		System.out.println("-----------------------------------------------");
	//	System.out.println(classOne.privateName); //ERROR : The field ClassOne.privateName is not visible
	}

}
