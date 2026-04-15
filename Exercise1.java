/*Write a Java program that prompts the user to enter a filename.
The program must verify the file using the exists() and canRead() methods
from the File class. The user should be repeatedly asked to re-enter the 
filename until both checks pass. */ 

import java.io.*;
import java.util.Scanner;

public class Exercise1{
	public static void main(String[]args)
	{
		Scanner lettore=new Scanner(System.in);
		File documento;
		String riga;
		
		do{
			System.out.println("Insert file name: ");
			riga=lettore.nextLine();
			
			documento=new File(riga);
			
			if(!documento.exists()||!documento.canRead())
				{
					System.out.println("your document does not exists or can't be read");
					
				
				
				}
		
		
		
		}while(!documento.exists()||!documento.canRead());
	
	
	

/*Read every line of the specified file and print only those containing two
consecutive "T" characters (double "T"). The check must be case-insensitive 
(it should not matter if the "T" is uppercase or lowercase). */
try{
Scanner read=new Scanner(documento);
while(read.hasNextLine())
	{
		String sentence=read.nextLine();
		if(sentence.toLowerCase().contains("tt"))
			{
		System.out.println(sentence);
			}
		
/* If i want to add just the words that are between the " "inside of println:
while(read.hasNextLine)
{
String sentence=read.nextLine();
if(sentence.contains("println"))
{
int inizio=sentence.indexOf("\"")+1;
int fine=sentence.lastIndexOf("\"");
if(inizio>0&&fine>inizio)
{
String contenuto=sentence.substring(inizio,fine);
if(contenuto.toLowerCase().contains("tt"))
{
System.out.println(contenuto);
}
}
}
} */	
	
}
read.close();
}
catch(FileNotFoundException e)
{
	System.out.println("Error:");
}

}
}