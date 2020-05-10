package access_specifiers;

import access_specifiers.another_package.AccessSpecifiersAnotherPackageDemo;
import access_specifiers.another_package.ClassTwo;
import access_specifiers.same_package.AccessSpecifiersSamePackageDemo;

public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		AccessSpecifiersSamePackageDemo.main(args);
		System.out.println();
		ClassTwo.main(args);
		System.out.println();
		AccessSpecifiersAnotherPackageDemo.main(args);
	}

}
