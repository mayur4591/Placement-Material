class A{
      public void show(){
           System.out.println("hii in A");
      }
}
public class Anonymous{
     public static void main(String args[]){
         A obj = new A();
         // creat the the object of anonymous class
         A Bobj = new A(){
             public void show(){
                  System.out.println("Hi in B");
             }
         };
         obj.show();
         Bobj.show();
     }
}