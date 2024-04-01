public class finallydemo {

  static void meth1()throws Exception{
    try{
      throw new Exception();
    }
    finally{
      System.out.println("final message");
    }
  }
  public static void main(String[] args) {


// //finally  method always executed
//     try{
//       System.out.println(10/0);
//     }
//     finally{
//       System.out.println("bye");
//     }


//
try{
meth1();
}catch(Exception e){
  
}

  }
}
