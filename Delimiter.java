/*"Edit an Employee.data file with the following content:

Joe, 38, true
Kay, 27, true
Lou, 33, false

*/



import java.util.*;
import java.io.*;

public class Delimiter{

	public static void main(String[]args)
	{
		File mioFile=new File("Employee.data");
		try{
			PrintWriter writer=new PrintWriter(mioFile);
			writer.println("Joe,38,true");
			writer.println("Kay,27,true");
			writer.println("Lou,33,false");
			
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println("can't use the file");
		}
		
		
		try{
			Scanner reader=new Scanner(mioFile).useDelimiter(",|"+System.lineSeparator());
			while(reader.hasNext())
				{
					String data=reader.next();
					System.out.println(data);
				}
				reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("error: can't find you file");
		
		}
	
	
	
	}





}