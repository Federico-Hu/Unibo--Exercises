import java.util.*;

public class ES2{
public static void main(String[]args)
{
	int n=3;
	int[]array=new int[n];
	int[][]matrice=new int[n][n];
	for(int i=0;i<n;i++)
		{
			array[i]=(int)(Math.random()*10);
			matrice[0][i]=array[i];
			
		}
		for(int i=1;i<n;i++)
			{
				for(int j=0;j<n;j++)
					{
						if(j==0)
							{
								matrice[i][j]=matrice[i-1][j]+matrice[i-1][j+1];
							}
						else if(j==1)
							{
								matrice[i][j]=matrice[i-1][j-1]+matrice[i-1][j]+matrice[i-1][j+1];
							}
						else if(j==2)
							{
								matrice[i][j]=matrice[i-1][j-1]+matrice[i-1][j];
							}
						
					}
			
			}
		for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
					{
						System.out.print(matrice[i][j]+",");
					}
					System.out.println("");
			}
		
		



}



}