//@timestamp: 30 Nov 2021 15:41:47 PM (GMT)
/*

A class which is declared with abstract keyword is known as abstract class. 
An abstract class can have abstract methods and non-abstract methods as well. 
Abstract class is used to achieve abstraction. 
Abstraction is a process in which we hide complex implementation details and show only functionality to the user.
In scala, we can achieve abstraction by using abstract class and trait. We have discussed about these in detail here.

Scala Abstract Class Example: Abstract Method is not implemented
In this example, we didn't implement abstract method run(). 
Compiler reports an error during compilation of this program. Error message is given below in output section.

ERROR:-
jdoodle.scala:20: error: class Hero needs to be abstract. Missing implementation for:
  def run(): Unit // inherited from class Bike
class Hero extends Bike{        // Not implemented in this class
      ^

*/


import java.util.Date
import java.text.SimpleDateFormat

abstract class Bike{  
    def run()               // Abstract method  
}  
  
class Hero extends Bike{        // Not implemented in this class  
    def runHero(){  
        println("Running fine...")  
    }  
}  
  
object MainObject{  
    def main(args: Array[String]){  
        var h = new Hero()  
        h.runHero()  
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
