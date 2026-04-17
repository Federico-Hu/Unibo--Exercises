import java.util.*;
import java.io.*;

public class Parsing{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String nameFile="Employee.data";
		File mioFile=new File(nameFile);
	
		
		try{
			
			PrintWriter people=new PrintWriter(mioFile);
			people.println("joe,38,true");
			people.println("Kay,27,true");
			people.println("Lou,33,false");
			
			people.close();
				
		}
		catch(IOException e)
		{
			System.out.println("error");
			
		
		}
		
		
		try{
			Scanner reader=new Scanner(mioFile);
			while(reader.hasNextLine())
				{
					String sentence=reader.nextLine();
					String[]check=sentence.split(",");
					
					Fix(check);
				}
				reader.close();
		}
		catch(FileNotFoundException e)
				{
					System.out.println("Il file non esiste");
				}
		
		

	
	
	
	}

	
		
public static void Fix(String[]words)
{
	String name=words[0].trim();
	System.out.println(name);
	int age=Integer.parseInt(words[1].trim());
	System.out.println(age);
	boolean hasJob=Boolean.parseBoolean(words[2].trim());
	System.out.println(hasJob);



}
		
	




}