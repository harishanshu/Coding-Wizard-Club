import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date in given format ");
		System.out.println("31 st December 2020");
		String s=sc.nextLine();
		int x=Integer.parseInt(s.substring(0,2));
		String month=s.substring(6,9);
		
		int year=Integer.parseInt(s.substring(s.length()-4));
		int feb=29,days=x;
		if((year % 4 == 0 && year % 100 !=0 ) ||(year %  400 ==0)){
		feb=29;
	}
	else {
		feb=28;
	}
	switch(month) {
	case "Feb":
		days= days+31;
		break;
	
	 
	case "Mar":
	days= days+31+feb;
	break;
	case "Apr":
	days=days+31+feb+31;
	break;
	case "May":
	days =days+31+feb+31+30;
	break;
	case "June":
	days = days+31+feb+31+30+31;
	break;
	case "july":
		days = days+31+feb+31+30+31+30;
		break;
	case "Aug":
	days =days+31+feb+31+30+31+30+31;
	break;
	case "Sept":
		days = days +31+feb+31+30+31+30+31+31;
		break;
	case "Oct":
		days =days +31+feb+31+30+31+30+31+31+30;
		break;
	case "Nov":
		days = days+31+feb+31+30+31+30+31+31+30+31;
		break;
	case "Dec":
		days =days+31+feb+31+30+31+30+31+31+30+31+30;
		break;
		default:System.out.println("enter a invalid date");
	}
	System.out.println("Number of days: "+days);
}

}		