
public class Question3 {

	public static void main(String[] args) {
		long x=0,y=0;
		int c=0;
		for(long i=2;i<1000000;i++)
		{
			c=1;
			long n=i;
			while (n!=1)
			{
				if(n%2==0)
					n=n/2;
				else
					n=3*n+1;
				c++;
			}
			if(c>x&&n==1)
			{
				x=c;
				y=i;
			}
		}
		System.out.println(y);
		
			}
		}

	


