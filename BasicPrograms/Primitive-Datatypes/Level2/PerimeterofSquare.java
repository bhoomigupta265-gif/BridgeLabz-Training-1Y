import java.util.Scanner;
public class PerimeterofSquare {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        double perimeter = 4 * side;

        System.out.println("The length of the side is "+side+ " whose perimeter is "+perimeter);


    }
    
}
