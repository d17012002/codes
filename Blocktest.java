import java.util.Scanner;
 public class Blocktest
{	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int i=0; i<=t; i++){
		int n = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(n/(3*x));
	}
	
}
}
