//@timestamp: 30 Nov 2021 13:55:52 PM (GMT)
/*Final method declare in the parent class can't be override. You can make any method to final if you don't want to get it overridden. 
Attempt to override final method will cause to a compile time error.*/

/*BELOW CODE THROW ERROR:
method show cannot override final member
    override def show(){
                 ^
one error found*/


/*
class Vehicle{  
     final def show(){  
         println("vehicle is running")  
     }  
}  
class Bike extends Vehicle{  
   //override val speed:Int = 100  
    override def show(){  
        println("bike is running")  
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
