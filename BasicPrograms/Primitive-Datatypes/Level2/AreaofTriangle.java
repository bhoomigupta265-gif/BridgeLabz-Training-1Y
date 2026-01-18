import java.util.Scanner;
public class  AreaofTriangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of triangle: ");

        double h = sc.nextDouble();
        double areainSqCm = 0.5 * b * h;

        double areainSqIn = areainSqCm / (2.54 * 2.54);  

         
        System.out.println("The Area of the triangle in sq in is " +areainSqIn+ "and sq cm is "+areainSqCm );

    }
    
}
