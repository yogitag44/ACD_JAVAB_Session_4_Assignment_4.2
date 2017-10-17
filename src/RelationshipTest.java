import java.util.Scanner;  //to take input from user

public class RelationshipTest {   //Main class defined to where we are calling all the methods used in the query
	public static void main(String[] args) {          
        Maruti myMaruti = new Maruti();      //Created object of class Maruti
        myMaruti.setColor("RED");      //Calling its objects
        myMaruti.setMaxSpeed(180);  		//calling integer type parameterized method
        myMaruti.carInfo();  
        myMaruti.MarutiStartDemo();  
    }  
}

//=========Shows as IS-A relation ship=========== 
class Car {  
    // /Methods implementation and class/Instance members  
    private String color;  //private string variables
    private int maxSpeed;   //private integer variable
    public void carInfo(){    //Method to print maximum speed of cae
        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);  
    }  
    public void setColor(String color) {   //Method with one string parameter     
    								//This will represent IS-A relation which states car is red color
        this.color = color;  
    }  
    public void setMaxSpeed(int maxSpeed) {     
        this.maxSpeed = maxSpeed;  
    }  
}  


//===========Showing IS-A relationship================
class Maruti extends Car{     //implementing inheritance extending parent class
    //Maruti extends Car and thus inherits all methods from Car (except final and static)  
    //Maruti can also define all its specific functionality  
    public void MarutiStartDemo(){       //This is showing HAS-A relationship
        Engine MarutiEngine = new Engine();      //calling class Engine using object of the class
        MarutiEngine.start();     //Calling start method
        }  
    }  

//===============showing HAS-A relation================
 class Engisne {  //Class with two methods 
    public void start(){        //Showing engine has started
        System.out.println("Engine Started:");      
    }  
    public void stop(){     //showing engine has stopped
        System.out.println("Engine Stopped:");  
    }  
}  


 //HAS-A relationship is better as we can reuse code in better way and in productive way
 