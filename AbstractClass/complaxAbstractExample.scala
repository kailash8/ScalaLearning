//@timestamp: 30 Nov 2021 15:41:47 PM (GMT)
/*A class which is declared with abstract keyword is known as abstract class. 
An abstract class can have abstract methods and non-abstract methods as well. 
Abstract class is used to achieve abstraction. 
Abstraction is a process in which we hide complex implementation details and show only functionality to the user.
In scala, we can achieve abstraction by using abstract class and trait. We have discussed about these in detail here.

Scala Abstract Class Example: Having Constructor, Variables and Abstract Methods*/


import java.util.Date
import java.text.SimpleDateFormat

abstract class Bike(a:Int){             // Creating constructor  
    var b:Int = 20                      // Creating variables  
    var c:Int = 25  
    def run()                           // Abstract method  
    def performance(){                  // Non-abstract method  
        println("Performance awesome")  
    }  
}  
  
class Hero(a:Int) extends Bike(a){  
    c = 30  
    def run(){  
        println("Running fine...")  
        println("a = "+a)  
        println("b = "+b)  
        println("c = "+c)  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        var h = new Hero(10)  
        h.run()
        h.performance()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
