
// public class arraytrycatch {
//   public static void main(String[] args) {
//     int a[]={10,23,20,69,0};
//     try{
//       int c=a[0]/a[4];
//       System.out.println("division is"+c);
//       System.out.println(a[9]);
//     }
//     catch(ArithmeticException e){
//       System.out.println(e);
//     }
//     catch(ArrayIndexOutOfBoundsException e){
//       System.out.println(e);
//     }
//     System.out.println("bye");
//   }
// }



// nexted try catch




public class arraytrycatch {
  public static void main(String[] args) {
    int a[]={100,23,20,69,0};
    try{
      int c=a[0]/a[2];
      System.out.println("division is"+c);


      try{
      System.out.println(a[47]);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }


    catch(ArithmeticException e){
      System.out.println(e);
    }



    System.out.println("bye");
  }
}

