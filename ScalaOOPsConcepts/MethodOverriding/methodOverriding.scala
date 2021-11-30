//@timestamp: 30 Nov 2021 12:44:08 PM (GMT)
/*When a subclass has the same name method as defined in the parent class, it is known as method overriding. 
When subclass wants to provide a specific implementation for the method defined in the parent class, it overrides method from parent class.
In scala, you must use either override keyword or override annotation to override methods from parent class.*/

import java.util.Date
import java.text.SimpleDateFormat

class car{  
    def run(){
        println("Car is running")
    }
}  

class bike extends car{
    override def run(){
        println("Bike is runnning")
    }
}

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

object MainObject {  
    def main(args: Array[String]) = {
        var s =  new bike()
        s.run()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
