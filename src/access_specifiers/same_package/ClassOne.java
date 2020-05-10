package access_specifiers.same_package;

public class ClassOne {

	protected String protectedName = "protected";
	String defaultName = "default";
	private String privateName = "private";
	public String publicName = "public";

	public String getPublicName() {
		return publicName;
	}

	protected String getProtectedName() {
		return protectedName;
	}

	private String getPrivateName() {
		//private variables/methods can be used within the same class methods 
		return privateName;
	}

	String getDefaultName() {
		return defaultName;
	}
	
	
}
