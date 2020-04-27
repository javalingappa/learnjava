/** 
* This is my Program so do not copy 
*/
public class MyFirstProgram {

public int factor = 10;

private static final String total = "Total = ";

public MyFirstProgram (){
  System.out.println("Default Constructor ");
}

public MyFirstProgram (int additionalValue){
  System.out.println("Parameterized Constructor ");
  factor  = factor + additionalValue;
}

public static void main(String[] a) {
     MyFirstProgram program = new MyFirstProgram(100);
     System.out.println(total+program.factor);
}


}