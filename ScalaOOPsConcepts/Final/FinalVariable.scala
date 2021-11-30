//@timestamp: 30 Nov 2021 13:53:36 PM (GMT)
/*Final is a keyword, which is used to prevent inheritance of super class members into derived class. 
You can declare final variables, methods and classes also.*/

//BELOW CODE THROW ERROR: Error - value speed cannot override final member 
/*
class Vehicle{  
     final val speed:Int = 60  
}  
class Bike extends Vehicle{  
   override val speed:Int = 100  
    def show(){  
        println(speed)  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.show()  
    }  
}
*/


import java.util.Date
import java.text.SimpleDateFormat
     

var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")
