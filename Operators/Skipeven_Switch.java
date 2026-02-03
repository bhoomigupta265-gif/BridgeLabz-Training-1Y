import java.util.Scanner;
public class Skipeven_Switch{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			if(i%2==0){
				continue;
			}else {
				System.out.println(i);
			}
		}
	}
}