//This program illustrates abstraction in java

abstract class Bank{    
abstract int getRateOfInterest();    
}    
class CBI extends Bank{    
int getRateOfInterest(){return 7;}    
}    
class BOI extends Bank{    
int getRateOfInterest(){return 8;}    
}    
    
public class Abstraction{    
public static void main(String args[]){    
Bank b;  
b=new CBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new BOI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}    
