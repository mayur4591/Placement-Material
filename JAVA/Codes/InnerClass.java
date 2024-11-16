class A{
      int age;
      public void show(){
          System.out.println("hii");
      }

      class B{
          public void config(){
             System.out.println("in B class");
          }
      }

      static class C{
          public void ok(){
              System.out.println("ok using static");
          }
      }
}
public class InnerClass{
     public static void main(String args[]){

        A obj = new A();
        obj.show();

        // create object of B then only able to access the methods in it
        A.B obj2 = obj.new B();
        // B is part of A with out creating the obj of A you are not able to creat obj of B
        obj2.config();

       // we can directly call the class C as it is static by its outer class only
       A.C obj3 = new A.C();
       obj3.ok();

     }
}