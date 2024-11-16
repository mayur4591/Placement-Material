public class Singleton2{
      public static void main(String args[]){
              Tree t1 = Tree.getInstance();
              Tree t2 = Tree.getInstance();
      }
}

class Tree{
      private Tree(){
            System.out.println("man");
      } 
      
      public static Tree tr;
      public static Tree getInstance(){
       //   tr = new Tree(); // multiple instances will created

         if(tr == null)
            tr = new Tree(); 
          return tr;
      }
}