import java.io.*;
import java.util.Scanner;

public class ReadFile{
	
	public static void main(String[]args)
	{
		File documento=new File("test.txt");
		try{
			Scanner lettore=new Scanner(documento);
			while(lettore.hasNextLine()){
				String riga=lettore.nextLine();
				System.out.println(riga);
			
			}
		lettore.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File non trovato");
		
		
		}
		
	
	
	
	
	}










}