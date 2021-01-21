/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
import java.io.*;
public class DropBomb
{
	public static void main(String[] args) {
	   
	   Scanner sc= new Scanner(System.in);
	   
	   int bomb_den=10;
	   
	   System.out.println("Enter the length and breadth of the area:");
	   int l=sc.nextInt();
	   int b=sc.nextInt();
	   
	   Random r= new Random();
	   int[][] arr = new int[l][b];
	   
	   for(int i=0;i<l;i++)
	   {
	       for(int j=0;j<b;j++)
	       {
	           arr[i][j]= r.nextInt(2) ;
	       }
	   }
	   
	   int max=0;
	   int max_x=0;
	   int max_y=0;
	   
	   for(int i=0;i<l-bomb_den;i++)
	   {
	       
	       for(int j=0;j<b-bomb_den;j++)
	       {
	           int cur_den=0;
	           for(int k=i-5;k<i+5;k++)
	           {
	               for(int m=j-5;m<j+5;m++)
	               {
	                   if(k>=0 && m>=0)
	                   {
	                      if(arr[k][m]==1){
	                          cur_den++;
	                      } 
	                   }
	               }
	           }
	           
	           if(cur_den>max)
	           {
	               max=cur_den;
	               max_x=i;
	               max_y=j;
	           }
	       }
	   }
	   
	   System.out.println("the max no of camps destroyed:"+max);
	   System.out.println("X - coordinate:"+max_x);
	   System.out.println("Y - coordinate:"+max_y);
	   
	   
	}
}



