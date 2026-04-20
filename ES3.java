import java.util.*;
public class ES3{
public static void main(String[]args)
{
	Scanner lettore=new Scanner(System.in);
	ArrayList<Integer>vettore=new ArrayList<>();
	do{
	System.out.println("Inserisci valori del vettore, per uscire inserisci una lettera/carattere: ");
	if(lettore.hasNextInt())
	{
		vettore.add(lettore.nextInt());
	}
	else
		{
			break;
		}

	}while(true);
	int i=0;
	boolean check=Numeri(i,vettore);
	System.out.println(check);
}

public static boolean Numeri(int j,ArrayList<Integer>studio)
{
	if(studio.size()<=1)
		{
			return true;
		}
		else if(j==studio.size()-1)
		{
			return true;
		}
	else if(studio.get(j)!=studio.get(j+1))
		{
			return false;
		}
	
	else
		{
			return Numeri(j+1,studio);
		}
		
		
}



}