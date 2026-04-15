import java.io.*;


public class Write{
	public static void main(String[]args)
	{
		File Scritta=new File("test.txt");
		
		try{
			PrintWriter scrittore=new PrintWriter(Scritta);
			scrittore.println("Ciao Mondo");
			scrittore.println("Sono Sveglio");
			
			scrittore.close();
		
		
		}
		catch(IOException e){
			System.out.println("impossibile scrivere su file");
		
		
		}
	
	
	
	}




}