// import javax.swing.JOptionPane;
// public class ChoosingOption{
//     public static void main(String[] args){
//         int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticker?");
//         JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
//     }
// }
// import java.util.Scanner;
// public class InputFromKeyboard{
//     public static void main(String args[]){
//         Scanner keyboard = new Scanner(System.in);
//         System.out.println("What's your name?");
//         String strName = keyboard.nextLine();
//         System.out.println("how old are you?");
//         int iAge = keyboard.nextInt();
//         System.out.println("How tall are you (m)?");
//         double dHeight = keyboard.nextDouble();
//         System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");
//     }
// }
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





