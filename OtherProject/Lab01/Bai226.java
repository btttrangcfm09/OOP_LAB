import javax.swing.JOptionPane;
public class Bai226{
    public static void main(String[] args){
        String A = JOptionPane.showInputDialog("Nhap a");
        String B = JOptionPane.showInputDialog("nhap b");
        String C = JOptionPane.showInputDialog("Nhap c");
        double a = Double.valueOf(A), b = Double.valueOf(B), c = Double.valueOf(C);
        if(a == 0 && b == 0 && c != 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(a == 0 && b == 0 && c == 0){
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if(a == 0 && b != 0){
            System.out.print("Phuong trinh co 1 nghiem x = ");
            System.out.println(c/b);
        }
        else{
            double delta = b*b-4*a*c;
            // nghiem 1
            if(delta < 0){
                System.out.println("vo nghiem");
            }
            else if(delta == 0){
                System.out.print("Nghiem kep cua pt la: x = ");
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                System.out.println(x1);
            }
            else{
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.print("Nghiem thu 1 cua pt la: x1 = ");
                System.out.println(x1);
                System.out.print("Nghiem thu 2 cua pt la: x2 = ");
                System.out.println(x2);
            }

        }
    }
}