@FunctionalInterface
interface A{
    public void show();
}

interface B {
     public int show(int i, int j);
}
public class LambdaExpree{
      public static void main(String args[]){
           A obj = () -> System.out.println("hii in");

           obj.show();

            B obj1 = (i, j) -> i+j; // simpleset
        

        //    B obj1 = (int i, int j) -> {
        //          return i+j;
        //    };

          int ans =  obj1.show(1, 2);
          System.out.println(ans);
      }
}