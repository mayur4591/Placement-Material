interface A{
      public void show();
}

public class FunctinalInterface{
      public static void main(String args[]){
           // instead of creating class which implements it , creat inner anonymous class
           A obj = new A(){
               public void show(){
                  System.out.println("in functinal inteface");
               }
           };  
           
           obj.show();
        }

}