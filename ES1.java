import java.util.*;

public class ES1{

public static void main(String[]args)
{
	
	Scanner lettore=new Scanner(System.in);
	int count=0;
	double tot=0,num=0;
	do{
	System.out.println("Inserisci valore");
	 num=lettore.nextDouble();
	tot+=num*num;
	if(num!=0)
		{
			count++;
		}
	
	}while(num!=0);
	
	double mediaFinale=tot/count;
	System.out.println("La media totale è: "+mediaFinale);
	
	
	
	
	
}






}