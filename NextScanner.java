/* Learning how to use next()& the scanner,
   Leaving the buffer empty */
   
import java.util.*;
import java.io.*;

public class NextScanner{

public static void main(String[]args)
{
	
	boolean check;
	
	do{
		Scanner reader=new Scanner(System.in);
		try{
			
			System.out.println("Insert a number: ");
			int m=reader.nextInt();
			check=true;
		   }
		catch(InputMismatchException exc)
		{
			System.out.println("Not correct, try again: ");
			
			reader.nextLine();
			check=false;
		
		
		}
		
		
	}while(!check);
		
	
	
	
	





}






}