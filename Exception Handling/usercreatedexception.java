class lowbalanceException extends Exception{
  public String toString(){
    return "balance should be more tha 500";
  }
}
public class usercreatedexception {
  public static void main(String[] args) {
    try{
    throw new lowbalanceException();
    }
    catch(lowbalanceException e){
      System.out.println(e);
    }
  }
}
