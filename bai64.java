import java.util.Scanner;
public class bai64{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a month: ");
        
        while(true){
            String ipmonth = keyboard.nextLine();
            int check = 0;
            if(ipmonth.equals("January") || ipmonth.equals("Jan.") || ipmonth.equals("1") || ipmonth.equals("Jan")
            || ipmonth.equals("March") || ipmonth.equals("Mar.") || ipmonth.equals("3") || ipmonth.equals("Mar")
            || ipmonth.equals("May") || ipmonth.equals("5")
            || ipmonth.equals("July") || ipmonth.equals("7") || ipmonth.equals("Jul")
            || ipmonth.equals("August") || ipmonth.equals("8") || ipmonth.equals("Aug.") || ipmonth.equals("Aug")
            || ipmonth.equals("October") || ipmonth.equals("10") || ipmonth.equals("Oct.") || ipmonth.equals("Oct")
            || ipmonth.equals("December") || ipmonth.equals("12") || ipmonth.equals("Dec.") || ipmonth.equals("Dec")){
                System.out.println("31");
                check = 1;
            }
            else if(ipmonth.equals("February") || ipmonth.equals("Feb.") || ipmonth.equals("2") || ipmonth.equals("Feb")){
                System.out.println("28 or 29");
                check = 1;
            }
            else{
                System.out.println("30");
                check = 1;
            }             
            if(check == 1) break;
        }
        // year
        while(true){
            System.out.println("Please enter a month: ");
            String year = keyboard.nextLine();
            for (int i = 0; i < year.length(); i++) {
                if (!Character.isDigit(year.charAt(i))) {
                    continue;
                }
            }
            int y = Integer.parseInt(year);
            
            if(y % 4 == 0){
                if(y % 4 != 100 || y % 4 == 100 && y % 400 == 0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("common year");
                }
                
            }
            else{ 
                System.out.println("common year");
                
            }
            break;
        }
    }
}       