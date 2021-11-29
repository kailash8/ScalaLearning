//@timestamp: 29 Nov 2021 17:04:03 PM (GMT)
/*Singleton object is an object which is declared by using object keyword instead by class. 
No object is required to call methods declared inside singleton object.

In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.
If you don't create singleton object, your code will compile successfully but will not produce any output. 
Methods declared inside Singleton Object are accessible globally. 
A singleton object can extend classes and traits.*/

import java.util.Date
import java.text.SimpleDateFormat

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

object robot{
    def show{
        println("multiple-pieces")
    }
}

object MainObject {  
    def main(args: Array[String]) = {  
        robot.show //no need to create object
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
