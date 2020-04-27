
public class FirstJavaProgram {

	int b;
	
	String myName;
	
	public FirstJavaProgram() {
		//one door
	}
	
	public FirstJavaProgram(String name) {
		//back door with fine
		this.myName = name;
	}
	
	public FirstJavaProgram(String name, int age) {
		//back door with fine
		this.myName = name;
	}
	
	public FirstJavaProgram(String name, String address) {
		//back door with fine
		this.myName = name;
	}

	public static void main(String[] args) {
		
		int a = 0;
		
		System.out.println("main :: " + a);
		
		new FirstJavaProgram().printB();
		
		FirstJavaProgram objectName = new FirstJavaProgram("Sachin");
		
		System.out.println(objectName.getWelcomeMessage()+" "+objectName.myName);
		
		FirstJavaProgram objectNameTwo = new FirstJavaProgram("Tendulkar");
		
		System.out.println(objectNameTwo.getWelcomeMessage()+" "+objectNameTwo.myName); //
		
		
		System.out.println(objectName.getWelcomeMessage()+" "+objectName.myName);
		

	}

	public void printB() {
		System.out.println("printB :: " + b);
	}

	private String getWelcomeMessage(){
		return "Welcome to ";
	}
	
}
