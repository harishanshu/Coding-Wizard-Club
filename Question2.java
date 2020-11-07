import java.util.*;
import java.lang.*;
public class Question2 {

	public static void main(String[] args) {
String person;
String computer ="";
int compChoice;

Scanner sc= new Scanner(System.in);
System.out.println("enter the choice"+ "Rock = R,Scissor = S,Paper = P");
System.out.println();
int YourScore=0;
System.out.println(" Round "+1);
for( int i=2;i<5;i++)
{
	compChoice =(int)(Math.random()*3);
	if(compChoice == 1)
	computer = "R";
	else if (compChoice == 2)
		computer = "S";
	else if (compChoice == 3)
		computer = "P";
	
	System.out.println("enter your choice");
	person =sc.next();
	System.out.println("computer choice: " + computer);
	if(person.equals(computer))
		System.out.println("It is a tie");
	else if(person.equals("R"))
		if(computer.equals("S"))
		{
			System.out.println("You win");
			YourScore = YourScore+1;
		}
		else if(computer.equals("P"))
			System.out.println("You lose");
		else if(person.equals("P"))
			if(computer.equals("S"))
				System.out.println("You lose");
			else if(computer.equals("R"))
			{
				System.out.println("You win");
				YourScore=YourScore+1;
			}
			else if(person.equals("S"))
				if(computer.equals("P"))
				{
					System.out.println("You win");
					YourScore =YourScore+1;
				}
				else if(computer.equals("R"))
					System.out.println("You lose");
				else
					System.out.println("Your coice is invalid");
	
	if(i<=3)
	{
		System.out.println( "Round" +i);
	}
}
System.out.println("Final Decision");
if(YourScore<=2)
{
	System.out.println("You lose");
}
	else if(YourScore==0)
	{
		System.out.println("Tie");
	}
	else 
		System.out.println("You won");
}
	}
	
	
			
		




	


