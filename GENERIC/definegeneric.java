class demo<T>{
private T obj;
public void setd(T ob){
  obj=ob;
}
public T getd(){
  return obj;
}
}

public class definegeneric {
  public static void main(String[] args) {
    demo<Integer> dm=new demo<>();

    dm.setd(10);
    System.out.println(dm.getd());

    demo<String> dm2=new demo<>();
    dm2.setd("hii shiza");
    System.out.println(dm2.getd());

    
  }
}
