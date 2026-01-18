import java.util.Scanner;
public class CalculateTotalPrice {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter unitPrice: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter Qty: ");
        double qty = sc.nextDouble();

        double totalprice = unitPrice * qty;
        
        System.out.println("The total purchase price is INR " +totalprice+ " if the quantity " +qty+ " and unit price is INR " +unitPrice);


    }
    
}
