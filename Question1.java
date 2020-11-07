import java.util.*;


public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int n;
		System.out.println("enter the value");
		s=sc.nextLine();
		n=s.length();
		String x="";
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			if(!(ch=='G'||ch=='C'||ch=='T'||ch=='A'))
{
             x="Invalid Input";
             break;
}     
             else 
             {
            
            	 if(ch=='G')
            		 x+='C';
            	 if(ch=='C')
            		 x+='G';
            	 if(ch=='T')
            		 x+='A';
            	 if(ch=='A')
            		 x+='U';
             }
		}
		System.out.println(x);
            		 
            	 }
}
             

		

	


