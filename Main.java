import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter m");
		int m=sc.nextInt();
		int r=power(n,m);
		
		System.out.println("power of"+n+"to"+m+"is"+r);
	}
	public static int power(int n,int m)
	{
		int res=1;
		for(int i=1;i<=m;i++)
		{
			res=res*n;
		}
		return res;
		
	

	}

}
