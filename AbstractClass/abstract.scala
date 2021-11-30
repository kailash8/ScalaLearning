//@timestamp: 30 Nov 2021 14:52:00 PM (GMT)

/*A class which is declared with abstract keyword is known as abstract class. 
An abstract class can have abstract methods and non-abstract methods as well. 
Abstract class is used to achieve abstraction. 
Abstraction is a process in which we hide complex implementation details and show only functionality to the user.
In scala, we can achieve abstraction by using abstract class and trait. We have discussed about these in detail here.


In this example, we have created a Bike abstract class. 
It contains an abstract method. A class Hero extends it and provides implementation of its run method.
A class that extends an abstract class must provide implementation of its all abstract methods. You can't create object of an abstract class.*/
import java.util.Date
import java.text.SimpleDateFormat

abstract class Vehicle{  
     def show()
}  
  
class Bike extends Vehicle{  
       def show(){  
        println("bike is running")  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.show()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
