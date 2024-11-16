import java.util.*;

class Tree extends Thread{
   public void run(){
     for(int i=0; i<5; i++){
          System.out.println("Hii");
       try{
        Thread.sleep(1100);
       } 
       catch(Exception e){

       }
     }
     
   }
}

class Tree2 extends Thread{
    public void run(){
        for(int i=0; i<5; i++)
        {
            System.out.println("Helow");
         try{Thread.sleep(1100);}
         catch(Exception e){}
        }
         
    }
}
public class Thread1{
      public static void main(String args[]){
          Tree t1 = new Tree();
       //   t1.Show();
          Tree2 t2 = new Tree2();  
         // t2.Show();    
          // actuall thread get started as 
          t1.start();
          try{Thread.sleep(10);} catch(Exception e){}
          t2.start();
          // but start internally calling run function so have to override it
          // instead of show use run function

       
          
      }
}