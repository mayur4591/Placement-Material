class Tree{
     public void show(){
        System.out.println("hii");
     };
}
class A extends Tree{
      // have to override
      @Override
      public void show(){
        System.out.println("hellow");
      }
      
}
public class Annotation{
      public static void main(String args[]){
          // creating object of A not tree
          A obj = new A();
       //   obj.super.show();
          obj.show(); // it will print A show method
          // by mistatke you over it as showw
          // use annotation this time to avoid this
          // show error at complite only
      }
}