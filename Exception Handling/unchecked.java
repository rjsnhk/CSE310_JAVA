
public class unchecked {
  
//if there is unchecked exception complie not give error
  static void fun1(){
    try{
    System.out.println(10/0); //it not show error it also compile 
    }catch(Exception e){
      System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
      System.out.println(e); //java.lang.ArithmeticException: / by zero
      System.out.println(e.getMessage()); // by zero
      // e.printStackTrace();
    }
  }
  static void fun2(){
fun1();
  }
  static void fun3(){
fun2();
  }

  public static void main(String[] args) {
    fun3();
  }
}
