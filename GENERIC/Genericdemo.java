/**
 * genericdemo
 */
public class Genericdemo<T> {
  T data[]=(T[]) new Object[3];
  public static void main(String[] args) {
    Genericdemo<String> gd=new Genericdemo<>();

    gd.data[0]="hii";
    gd.data[1]="rajesh";
    gd.data[2]="this ishq";

    String str=gd.data[1];

    System.out.println(gd.data[2]);
  }
    
  }