import java.util.*;
public class Pattern 
{
	public static void main(String[] args) 
		{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the value of n");
n= sc.nextInt();
int space = n/2,num=1;
int count= num/2+1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=space;j++)
	{
		System.out.println(" ");
	}
	for(int k=1;k<=num;k++)
	{
		System.out.print( + count);
		if(k<=num/2)
			count--;
		else
			count++;	
	}
	System.out.println();
	if(i<=n/2) {
		space=space-1;
		num = num+2;
	}
	else
	{
		space=space+1;
		num =num-2;
	}
   }
		}
}
	
