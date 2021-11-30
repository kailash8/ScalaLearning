//@timestamp: 30 Nov 2021 13:57:11 PM (GMT)
/*You can also make final class. Final class can't be inherited. 
If you make a class final, it can't be extended further.*/

/*error: illegal inheritance from final class Vehicle
class Bike extends Vehicle{
                   ^
one error found*/


/*
final class Vehicle{  
     def show(){  
         println("vehicle is running")  
     }  
  
}  
  
class Bike extends Vehicle{  
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
