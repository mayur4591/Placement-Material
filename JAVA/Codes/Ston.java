class Tree{
      public int val =0;
      private Tree(){ // make it private
          System.out.println("only one instance");
      }
      // one instance
      public static Tree tr = new Tree(); //

      public static Tree getInstance(){
             return tr;
             //System.out.println("one class");
      }

      public void show(int k){
          this.val = k;
          System.out.println("hellow ->" + this.val);
      }



}
public class Ston{
      public static void main(String args[]){

        //
    //    Tree t2 = new Tree(); // gives error

        Tree t1 = Tree.getInstance();
        Tree t2 = Tree.getInstance();

        t1.show(10);
        System.out.println(t2.val);
     
      }
}