import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class CS1702_lab8 
{
	static public void main(String[] args)
	{
		System.out.println("8.4.1 - odd or even");	
		int x;
			do {
				x = 3;
				if (x % 2 == 0)
					System.out.println("You entered an even number.");
				else
					System.out.println("You entered an odd number.");
				} while (x % 2 == 0);
			
		System.out.println();
		System.out.println("8.4.2 - reverse string");
		
		String c = "test";
		String reverseA = new StringBuffer(c).reverse().toString();
		c = reverseA;
		System.out.println(c);
		
		System.out.println();
		System.out.println("8.4.3 - Leap Year");
		
	    int year = 2304; //tested with "This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, while 1800, 1900, 2100, 2200, 2300 and 2500 are NOT leap years." - from url in worksheet 8
	    int yearlimit = (year + 1);
	    while (year < (yearlimit) ){
	            System.out.println(year + " Is "+ (((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))? "" : "not")+"a Leap Year");
	            year++;

	    }
	    
		System.out.println();
		System.out.println("8.4.4 - Days in a Month");
		
		year = 2303; 
		int month = 3; 
		int monthlimit = (month + 1);
		int[] month_holder = {1 , 3 , 5 , 7 , 8 , 10 , 12};
		while (month < (monthlimit)){
				
				System.out.println("month " + month + " is " + ((((year % 4 == 0) && (year % 100 != 0) && (month == 2)) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0) && (month == 2))? "29" :  ((month == 2)? "28" : (((Arrays.asList(month_holder).contains(month))? "30" :  "31" )))  + " days long"))); //still isnt working properly - no idea
				month++;
				
		}
		
		System.out.println();
		System.out.println("8.4.5 - Days alive");
		
		
		Date d1 = new Date();
		Date d2 = new GregorianCalendar(2000, 12, 31, 23, 59).getTime(); //year, month, day, hours, mins
		long datedifference = d1.getTime() - d2.getTime(); 
		
		System.out.println(d1);
		System.out.println("the difference in the dates is " + (datedifference/ (1000 * 60 * 60 * 24)) + " days. ");
		
		
		System.out.println();
		System.out.println("8.4.6 The Fibonacci Sequence");
		
		int n = 1;
		int holder = 0;
		int fig1 = 1;
		int fig2 = 0;
		int i;
		for (i = 2; i <= n; i++)
		{
			holder = fig1 + fig2; 
			fig2 = fig1; 
			fig1 = holder;
		}
		System.out.println(holder);
		
		
	}
}		

