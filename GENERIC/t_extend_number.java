class array<T extends Number>{
  
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
public class t_extend_number {
  public static void main(String[] args) {
    array<Float> ma=new array<>();
    ma.append(5.8f);
    ma.append(59.8f);
    ma.append(51.88f);
    ma.append(54.85f);
    ma.display();
  }
  
}
