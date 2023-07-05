import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        try(Scanner scan = new Scanner(System.in)){
          int s = scan.nextInt();
          int result = 0;
          while(s>0){
            int rest = s%10;
            if (rest==1){
              result+=1;
            }
            s/=10;
          }
          System.out.println(result);
        }
    }
}
