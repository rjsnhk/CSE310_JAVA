class NegException extends Exception{
  public String toString(){
    return "negative dimension not allowed";
  }
}

public class throwdemoo {

  //just throw the error to next
  static int area(int a,int b) throws NegException{
    if(a<0||b<0)
    throw new NegException();
    return a*b;
  }


  // it also throws
  static void meth1() throws NegException{
    System.out.println("area of (10,5) = "+area(-10,5));
  }
  
  public static void main(String[] args){
try{
    meth1();
}catch(NegException e){
  System.out.println(e);
}
  }


}
