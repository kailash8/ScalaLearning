//@timestamp: 30 Nov 2021 13:09:12 PM (GMT)
/*In scala, you can override fields also but it has some rules that need to be followed. 
Below are some examples that illustrate how to override fields.*/

//BELOW CODE THROW ERROR: Error - variable speed needs 'override' modifier
/*class Vehicle{  
    var speed:Int = 60  
  
}  
class Bike extends Vehicle{  
   var speed:Int = 100  
    def show(){  
        println(speed)  
    }  
}  
object MainObject{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.show()  
    }  
}  */


import java.util.Date
import java.text.SimpleDateFormat

class Vehicle{  
     val speed:Int = 60  
  
}  
class Bike extends Vehicle{  
   override val speed:Int = 100     // Override keyword  
    def show(){  
        println(speed)  
    }  
}      
        

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

object MainObject {  
    def main(args: Array[String]) = {
        var b = new Bike()
        b.show()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
