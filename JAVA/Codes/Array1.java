public class Array1{
     public static void main(String args[]){
           int f = -1;
           int l = -1;
           int arr[] = {4, 2, -3, 1, -1, -1, 6};

           int ans = Integer.MAX_VALUE;

           for(int i=0; i<arr.length-1; i++){ // not will go beyong length
              int currSum = arr[i] + arr[i+1];
              if(currSum < ans){
                   ans = currSum;
                   f = i;
                   l = i+1;
              }

              for(int j=i+2; j<arr.length; j++){
                    if(arr[j] + currSum < ans){
                          ans = arr[j] + currSum;
                          f = i;
                          l = j;
                    }

                    currSum += arr[j];
              }
           }

           System.out.println(ans);
           System.out.println(f + " to " + l);

     }
}