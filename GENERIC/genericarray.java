class array<T>{
  T A[]=(T[]) new Object[10];
  int l=0;
  public void append(T v){
    A[l++]=v;
  }
  public void display(){
    for(int i=0;i<l;i++){
    System.out.println(A[i]);
  }
  }

}



public class genericarray {
  public static void main(String[] args) {
    array<Integer> ar=new array();
    ar.append(2);
    ar.append(4);
    ar.append(5);
    ar.append(67);
    ar.display();

    array<String> ar2=new array();
    ar2.append("hii");
    ar2.append("kese");
    ar2.append("ho");
    ar2.display();

System.out.println("it works for both");
    array ar3=new array();
    ar3.append(5);
    ar3.append("kese");
    ar3.append("ho");
    ar3.append(67);
    ar3.display();
  }
}
