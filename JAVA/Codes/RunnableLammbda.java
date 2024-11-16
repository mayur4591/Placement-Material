public class RunnableLammbda{
    public static void main(String args[]){
        
       
                 Runnable h1 =() ->{
                        for(int i=0; i<5; i++){
                            System.out.println("hii");
                            try{
                                Thread.sleep(500);
                            }
                            catch(Exception e){
            
                            }
                        }
                 };
                 Runnable he1 = () ->{
                        for(int i=0; i<5; i++){
                            System.out.println("hellow");
                            try{
                                Thread.sleep(500);
                            }
                            catch(Exception e){
            
                            }
                        }
                 };
       
                 Thread t1 = new Thread(h1);
                 Thread t2 = new Thread(he1);
       
                 t1.start();
                 t2.start();
       
                 // runnable having only one method run()
       
             }
}