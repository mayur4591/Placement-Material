class Hii implements Runnable{
     public void run(){
          for(int i=0; i<5; i++){
              System.out.println("hii");
              try{
                  Thread.sleep(500);
              }
              catch(Exception e){

              }
          }
     }
}

class Hellow implements Runnable{
       public void run(){
          for(int i=0; i<5; i++){
              System.out.println("hellow");
              try{
                  Thread.sleep(500);
              }
              catch(Exception e){

              }
          }
     }
}

public class Runnable1{
      public static void main(String args[]){
          Hii h1 = new Hii();
          Hellow he1 = new Hellow();

          Thread t1 = new Thread(h1);
          Thread t2 = new Thread(he1);

          t1.start();
          t2.start();

          // runnable having only one method run()

      }
}