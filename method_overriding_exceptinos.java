import java.io.*;  
class Parent{  
  void msg(){System.out.println("parent");}  
}  
  
class method_overriding_exceptinos extends Parent{  
  void msg() throws ArithmeticException{  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]){  
   Parent p=new method_overriding_exceptinos();  
   p.msg();  
  }  
}  