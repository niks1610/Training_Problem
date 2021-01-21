/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


 class person{
     protected String name;
    
    
     person(){
        
     }
     person(String name)
     {
         this.name=name;
     }
 }



 class Constituency{
     protected String name;
     protected String area;
    
    
     Constituency(String name, String area)         this.name=name;
         this.area=area;
     }
    
     void Details_Const()
     {
         System.out.println("Name= "+this.name+"           area= "+area);
     }
 }




 class Car{
     protected String name;
     protected String Color;
    
     Car(String name,String Color     {
         this.name=name;
         this.Color=Color;
     }
    
     void Details_Car()
     {
         System.out.println("Name= "+name+"                        color= "+Color);
     }
 }




 class Driver extends person
 {
     protected String name;
     protected int Exp_yrs;
    
     Driver(String name, int exp)
     {
         super(name);
         Exp_yrs=exp;
     }
    
     void Details_Driver()
     {
         System.out.println("Name= "+super.name+"              Experience in years= "+Exp_yrs);
     }
 }





 class MP extends person{
    
     protected String name;
     protected int Spend_limit=50000;
     protected Constituency consti;
    
     MP(){
        
     }
     MP(String name,Constituency consti)
     {
         super(name);
         this.consti=consti;
        
     }
    
     void Details_MP()
     {
         System.out.println("MP Details:--------");
         System.out.println("Name= "+super.name+"                      Spending Limit= "+Spend_limit);
         System.out.println("Constituency Details----");
         this.consti.Details_Const();
         System.out.println();
     }
 }





 class Minister extends MP{
    
     protected String name;
     protected Driver driver;
     protected Car car;
     protected Constituency consti;
    
     Minister(String name,Car car,Driver driver,Constituency consti)
     {
       this.name=name;
         this.Spend_limit= 70000;
         this.driver = driver;
         this.car= car;
         this.consti=consti;
        
     }
    
     void Details_Minister()
     {
         System.out.println("Minister Details:----------");
         System.out.println("Name= "+this.name+"            Spending Limit= "+this.Spend_limit);
         System.out.println("Car details------- ");
         this.car.Details_Car();
         System.out.println("Driver details----------- ");
         this.driver.Details_Driver();
         System.out.println("Constituency Details----");
         this.consti.Details_Const();
         System.out.println();
        
     }
 }



 class PrimeMinister extends Minister{
     protected String name;
     protected  int totalCar;
     PrimeMinister(String name,Car main_car,Driver driver,int totalCar,Constituency consti)
     {
         super(name,main_car,driver,consti);
          this.name=name;
          this.car = main_car;
          this.driver = driver;
         this.Spend_limit=170000;
         this.totalCar= totalCar;
     }
    
     void Details_PrimeMinister()
     {
         System.out.println("Prime Minister Details:-------");
         System.out.println("Name= "+super.name+"            Spending Limit= "+this.Spend_limit);
         System.out.println("Car details----------- ");
         this.car.Details_Car();
         System.out.println("Driver details---------- ");
         this.driver.Details_Driver();
         System.out.println("Total Car: "+totalCar);
         System.out.println("Constituency Details----");
         this.consti.Details_Const();
         System.out.println();
        
     }
    
 }



 public class Main
 {
 	public static void main(String[] args) {
	
 	Constituency consti = new Constituency("Lucknow","220000");
 	Constituency consti2 = new Constituency("Banaras","180000");
 	Constituency consti3 = new Constituency("Ahmedabad","220000");
	
	
 	Minister new_min= new Minister("Mr S.K. Yadav",new Car("Honda City","White"),new Driver("Sohan",12),consti);
 	MP new_mp= new MP("Mr Arun Kumar",consti2);
     PrimeMinister new_pm= new PrimeMinister("Mr N.D. Modi",new Car("Fortuner","White"),new Driver("Mukesh",18),3,consti3);
    
     new_mp.Details_MP();
     new_min.Details_Minister();
     new_pm.Details_PrimeMinister();
	
 	}
 }