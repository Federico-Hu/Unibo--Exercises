import java.io.*;
import java.util.*;

public class CSV{

	public static void main(String[]args)
	{
		File mioFile=new File("prodotti.csv");
		Scanner sc=new Scanner(System.in);
		try{
			PrintWriter list=new PrintWriter(mioFile);
			list.println("Codice,Quantità,Prezzo,Descrizione");
			list.println("4039,50,0.99,ARANCIATA");
			list.println(",5,9.50,T-SHIRT");
			list.println("1949,30,110.00,LIBRO JAVA");
			list.println("5199,25,1.50,BISCOTTI");
			list.close();
		}catch(IOException e)
		{
			System.out.println("error");
		}
		int count=0;
		int quantità;
		double prezzo;
		int max=0,min=0;
		double ricavoTot=0;
		String piuVenduto="";
		String menoVenduto="";
		
		try{
			Scanner reader=new Scanner(mioFile);
			if(reader.hasNextLine())
				{
					reader.nextLine();
				}
			while(reader.hasNextLine())
				{
					String elenco=reader.nextLine();
					String[]contenitore=elenco.split(",");
					count++;
					quantità=Integer.parseInt(contenitore[1].trim());
					if(quantità>max)
						{
							max=quantità;
							piuVenduto=contenitore[3];
						}
					else if(quantità<min)
						{
							min=quantità;
							menoVenduto=contenitore[3];
						}
				    prezzo=Double.parseDouble(contenitore[2].trim());
				    ricavoTot+=(prezzo*quantità);
				    
				}
				reader.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("errore: file non esistente");
		}
		System.out.println("Il numero totale di prodotti è: "+count);
		System.out.println("Il ricavo totale è: "+ricavoTot);
		ricavoTot=ricavoTot/count;
		System.out.println("Il ricavo medio è uguale a: "+ricavoTot);
		System.out.println("il prodotto più venduto è: "+piuVenduto);
		System.out.println("il prodotto meno venduto è: "+menoVenduto);
	
	
	
	
	}







}