import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int n = scan.nextInt();
          int[] a = new int[n];
          for(int i=0; i<n;i++){
            a[i] = Integer.parseInt(scan.next());
          }

          int result = 0;
          boolean isEven = true;
          while (isEven){
            for(int i = 0; i<n; i++){
              if(a[i]%2 == 0){
                a[i]/=2;
              }else {
                isEven=false;
              }
              
            }
            if(isEven){
              result+=1;
            }
            
          }
          
          
          System.out.println(result);
        }
    }
}
