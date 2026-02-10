import java.util.Scanner;
public class TwoDArraySum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] num=new int [2][3];
        System.out.println("Enter numbers:");
        for(int i=0;i<num.length;i++){
			 for(int j=0;j<num[0].length;j++)
            num[i][j]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<num.length;i++){
			 for(int j=0;j<num[0].length;j++)
            sum=sum+num[i][j];
        }
        System.out.println("Sum of given 2D Array numbers:"+sum);
    }
    
}
