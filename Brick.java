
import java.util.*;

class Country{
   protected String name;
   protected  ArrayList<City> city_list = new ArrayList();
   Country(String name)
   {
       this.name=name;
       
   }
   
   public void add_city(City city)
   {
       city_list.add(city);
   }
   
   public int get_Tcity()
   {
       return city_list.size();
   }
   
}


class City{
    
   protected String name;
   ArrayList<Wall> wall_list ;
   
   City(String name)
   {
       this.name = name;
       wall_list= new ArrayList<Wall>();
      
   }
    
    public void add_brick(New_Brick)
    {
        int size = this.wall_list.size();
        
        if(size==0)
        {
            Wall new_wall= new Wall();
            new_wall.add_brick(b);
            this.wall_list.add(new_wall);
        }
        
        Wall w = wall_list.get(size-1);
        
        if(w.get_Tbricks<=90)
        {
            w.add_brick(b);
        }
        
        else{
            Wall new_wall =new Wall();
            new_wall.add_brick(b);
            this.wall_list.add(new_wall);
        }
    }
    
}


class New_Brick
{
    private String Dedicated;
    private String message;
    
    public New_Brick(String Dedicated,String message)
    {
        this.Dedicated= Dedicated;
        this.message= message;
    }
}


class Wall
{
    ArrayList<New_Brick> brick_list = new ArrayList();
    private int total_brick=0;
    
    public Wall(New_Brick brick)
    {
    	brick_list.add(brick);
    	
    	
    }
    
    
    public void add_brick(New_Brick brick)
    {
    	
    	 brick_list.add(brick);
         this.total_brick++;

    }
    
    public int get_Tbricks()
    {
        return total_brick;
    }
    
}





class User {
  
    protected String name;
    protected String desig;
    private ArrayList<New_Brick> ded_list;
    private ArrayList<New_Brick> rec_list;
    
    
    
    
    public  User(String Name,String desig)
    {
        this.name= name;
    	rec_list= new ArrayList();
        ded_list= new ArrayList();
    	this.design=desig;
    }
    
    public int vote_rec()
    {
        return rec_list.size();
    }
    
    public int vote_ded()
    {
        return ded_list.size();
    }
    
    public void add_brick(New_Brick brick,City c)
    {
        sent.add(brick);
        c.add_brick(brick);
    }
    
    
    
}

class Admin extends User{


	public Admin(String Name)
	{
		super(Name, "Admin");
		this.wall= wall;
	}
	
	
}








public class Brick {
	
public static void main(String[] args) {
	    
	
       
          ArrayList<Country> con_list = new ArrayList();
        //  ArrayList<City> city_list = new ArrayList();
          ArrayList<User> user_list = new ArrayList();
       
       
       
//         HashMap<String,Integer> user_vote= new HashMap();
//         ArrayList<String> wall_list = new ArrayList();
//         ArrayList<String> admin_list =new ArrayList();
//         ArrayList<String> user_list = new ArrayList();
//         int total_brick=0,max=0,total_wall=0;
//         String hottest="";
        
//         boolean wall_flag = false;
//         Wall wall = null;
        
// 	    Scanner sc = new Scanner(System.in);
// 		User[] user = new User[10];



       Country con = new Country("India");
       
       City c1 = new City("Delhi");
       City c2 = new City("Lucknow");
       
       con.add_city(c1);
       con.add_city(c2);
       
       
       con_list.add(con);
       
		
		for(int i=0;i<2;i++)
		{
		    String name,city,msg,person;
		    System.out.println("Enter name and design of the user:");
		    name = sc.nextLine();
		    city = sc.nextLine();
		    
		    System.out.println("Enter the message and name of the person you want to dedicate this brick:");
		    msg = sc.nextLine();
		    person= sc.nextLine();
		    
		    New_Brick brick = new New_Brick(name,person,msg);
		    
		    if(!user_vote.containsKey(name))
		    	user_vote.put(name, 0);
		    
	      if(user_vote.containsKey(person))
		    {
		    	user_vote.put(person,user_vote.get(person)+1); 
		    	
		    	if(max<(int)(user_vote.get(person)))
		    		{max=(int)user_vote.get(person);
		    		 hottest=person;
		    		}
		    }
		    
	     else
		    {
		    	user_vote.put(person,1);
		    }
		    
		    if(!wall_list.contains(city))
		    {
		    	
		         String admin_name;
		    	 wall=new Wall(city);
		    	 wall_list.add(city);
		    	 System.out.println("Enter the name of the admin:");
		    	 admin_name= sc.nextLine();
		    	 
	    	 if(!admin_list.contains(admin_name))
	    	 {
		    	 Admin admin=new Admin(admin_name,city,wall);
		    	 admin_list.add(admin_name);
		    	 
		     }
	    	 
	    	 total_wall++;
		    
		    }   
		    
		    user[i] = new User(name,city,brick,wall);   
		    user_list.add(name);
		    total_brick++;
		}
		
		System.out.println("Do you want to see hottest guy or girl: Press 1:Yes Or 2:No");
		int op=sc.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("The hottest guy or girl is "+hottest+" with "+max+" votes");
		    break;
		case 2:
			
		}
		
		System.out.println("Do you want to see guy or girl with 0 dedicated brick: Press 1:Yes Or 2:No");
		int op1=sc.nextInt();
		
		switch(op1)
		{
		case 1:
			
			Set<Map.Entry<String, Integer>> entrySet = user_vote.entrySet();
			   for (Map.Entry<String, Integer> entry : entrySet) 
			   {
				   
				   
				    if (entry.getValue() == 0) 
					{
						System.out.println("The guy or girl with 0 dedicated brick is:"+ entry.getKey());
					}
			   }

		}
		
		
		System.out.println("Total no of walls initiated= "+total_wall+" total bricks= "+total_brick);
		
	
   }

 
  
}