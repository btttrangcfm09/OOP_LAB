
import java.util.Scanner;
public class Bai63{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = keyboard.nextInt();
        int m = (n-1)*2+1;
        
        for(int i = 1; i <= n; ++i){
            int k = (i-1)*2+1;
            char[] chuoi = new char[m/2+k/2+1];
            for(int j = 0; j <= m/2; ++j){
                if(j >= m/2 - k/2){ 
                    chuoi[j] = '*';
                    chuoi[2*(m/2)-j] = '*';
                    // System.out.print("*");
                    // System.out.print
                }
                else chuoi[j] = ' ';
            }

            System.out.println(new String(chuoi));
        }
    }
}
//     * 
//    *** 
//   ***** 
//  *******
// *********





