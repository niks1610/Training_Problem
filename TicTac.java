/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class TicTac
{
    
    
    
    
    
    public static int getRandomElement(ArrayList<Integer> list)
    {
        Random rand= new Random();
        return list.get(rand.nextInt(list.size()));
    }
    
    
    public static int getMove(ArrayList<Integer> user_input, ArrayList<Integer> element_rem)
    {
        int[] useri = new int[user_input.size()];
        
        for(int i=0;i<user_input.size();i++)
        {
            useri[i]= user_input.get(i);
        }
        
        Arrays.sort(useri);
        
        for(int i=0;i<useri.length-1;i++)
        {
            int j=i+1;
            int move = 15 - (useri[i]+useri[j]);
            
            if(element_rem.contains(move))
            return move;
            
        }
        
        return 0;
    }
    
    
    
    public static boolean checkWinner(ArrayList<Integer> user_input)
    {
         int[] useri = new int[user_input.size()];
        
        for(int i=0;i<user_input.size();i++)
        {
            useri[i]= user_input.get(i);
        }
        
        
        
    int sum = 0; 
    int ans = 0; 
    int N= useri.length;
  
    // Three nested loop to find all the sub  
    // sequences of length three in the given  
    // array A[]. 
    for (int i = 0; i < N; i++) { 
        for (int j = i + 1; j < N; j++) { 
            for (int k = j + 1; k < N; k++) { 
                sum = useri[i] + useri[j] + useri[k]; 
  
                // checking if the sum of the chosen 
                // three number is equal to 15. 
                if (sum == 15) 
                    return true; 
            } 
        } 
    } 
    return false; 

    }
    
    
    
    
    
    
	public static void main(String[] args) {
// 		int[][] tic = {{2,7,6},{2,9,4},{2,5,8},{7,5,3},{6,7,2},{6,1,8},{6,5,4},
// 		               {7,2,6},{7,6,2},{6,4,5},{6,8,1},{6,2,7},{2,6,7},{2,4,9},
// 		               {2,8,5},{9,2,4},{9,4,2},{9,5,1},{9,1,5},{5,7,3},{5,3,7},
// 		               {5,2,8},{5,8,2},{5,1,9},{5,9,1},{5,4,6},{5,6,4},{1,6,8},
// 		               {1,8,6},{1,5,9},{1,9,5},{4,9,2},{4,2,9},{4,3,8},{4,8,3},
// 		               {4,5,6},{4,6,5},{3,5,7},{3,7,5},{3,4,8},{3,8,4},{8,1,6},
// 		               {8,6,1},{8,5,2},{8,2,5},{8,3,4},{8,4,3}};
		
	//	int iLength = tic.length;
		int comp_move=0;
// 		ArrayList<ArrayList<Integer>> comb_list = new ArrayList<>(iLength);
		
      
//             for (int i = 0; i < iLength; ++i) {
//                   int jLength = tic[0].length;
//                   comb_list.add(new ArrayList(jLength));
//                   for (int j = 0; j < jLength; ++j) {
//                       comb_list.get(i).add(tic[i][j]);
//                     }
//             }
		
		
		
		int tot_moves=0;
		
		//user and Computer input's list
		ArrayList<Integer> user_input = new ArrayList();
		ArrayList<Integer> comp_input = new ArrayList();
		
		
		
		
		
		
		ArrayList<Integer> element_used = new ArrayList();
		ArrayList<Integer> element_rem = new ArrayList();
		
		element_rem.add(2);
		element_rem.add(7);
		element_rem.add(6);
		element_rem.add(9);	
		element_rem.add(5);	
		element_rem.add(1);	
		element_rem.add(4);	
		element_rem.add(3);	
		element_rem.add(8);	
		
		Scanner sc = new Scanner(System.in);
		int user_score=0;
		int com_score=0;
		
		while(true)
		{
		    
		    //User's choice
		    System.out.println("User enter your choice:");
		    int n = sc.nextInt();
		    
		    if(element_rem.contains(n))
		    user_score+=n;
		    
		    
		    else{
		        System.out.println("Wrong Choice, Enter Again:");
		        n= sc.nextInt();
		        user_score+=n;
		    }
		    
		    user_input.add(n);
		    
		    element_rem.remove(new Integer(n));
		    
		    //user's win condition
		    if(checkWinner(user_input))
		    {
		        System.out.println("User Won");
		        break;
		    }
		    
		 
		    //moves exceed, then exit
		    if(++tot_moves == 8){
		        System.out.println("Match Draw");
		        break;
		    }
		    
		    
		    
		    
		    
		    //Computer's choice
		    int num1=0;
		    System.out.println("Computer's choice is:");
		    
		    if(tot_moves == 1)
		    num1= getRandomElement(element_rem);
		    
		    else
		    {
		        int val_win = 15 - com_score;
		        int val_def = 15 - user_score;
		         if(element_rem.contains(val_win) && comp_move>1)
		         {
		             num1 = val_win;
		         }
		         
		         else if(element_rem.contains(val_def))
		         {
		             num1 = val_def;
		         }
		         
		         else if(comp_move>=2)
		         {
		             int k = getMove(user_input,element_rem);
		             if(k>0)
		             num1 = k;
		             
		             else
		             num1 = getRandomElement(element_rem);
		         }
		         
		      //   else{
        //             num1 = getRandomElement(element_rem);
		      //   }
		    }
		    
		    comp_move++;
		    System.out.println(num1);
		    com_score+=num1;
		    comp_input.add(num1);
		    element_rem.remove(new Integer(num1));
		    
		    //computer's win condition
		     if(checkWinner(comp_input))
		    {
		        System.out.println("Computer Won");
		        break;
		    }
		    
		    System.out.println(user_score+" "+com_score+" "+element_rem.toString());
		    //moves exceed, then exit
		    if(++tot_moves == 8){
		        System.out.println("Match Draw");
		        break;
		    }
		    
		    
		    
		}
		
		System.out.println("The Resultant Board is:");
		
		char[][] board ={{'2','7','6'},{'9','5','1'},{'4','3','8'}}; 
		for(int i=0;i<board.length;i++)
		{
		    for(int j=0;j<board.length;j++)
		    {
		        int a = Character.getNumericValue(board[i][j]);
		        if(user_input.contains(a))
		        {
		            board[i][j]='X';
		        }
		        
		        else if(comp_input.contains(a) )
		        {
		            board[i][j]='0';
		        }
		        
		        else{
		            board[i][j]='-';
		        }
		    }
		}
		
		for(int i=0;i<board.length;i++)
		{
		    for(int j=0;j<board.length;j++)
		    {
		        System.out.print(board[i][j]+" |");
		    }
		    System.out.println();
		    System.out.println("----------------------------");
		}
		
		
		
		
		
	}
}
