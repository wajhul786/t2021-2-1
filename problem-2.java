import java.util.Scanner;

class problem2
{
	public static void main(String []args)
	{
		int i,a;
		
	Scanner S=new Scanner(System.in);
	System.out.println("Enetr the value of a");
	a=S.nextInt();
	int A[]=new int[a];
	
	
	for (i=0;i<a ;i++)
	{
		A[i]=2*i+1;
	}
	
	System.out.print("Input a = "+i+ ", then output:");
	
	for (i=0;i<a; i++)
	{ 
	
	{ 
			
		System.out.print(A[i]+",");
		
	}
	
	}
	System.out.println();
	}
	
	}
