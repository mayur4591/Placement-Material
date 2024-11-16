public class Singleton{
      public static void main(String args[]){
          Tree tr2 = Tree.getInstance();
          Tree t3 = Tree.getInstance();
           Tree tr21 = Tree.getInstance();
          Tree t11 = Tree.getInstance();
        //  Tree tr2 = new Tree();  
      }
}

class Tree{
    private Tree(){
            System.out.println("manjiri");
    }  
    
    public static Tree tr = new Tree();

    public static Tree getInstance(){
        return tr;
    }



}