//@timestamp: 30 Nov 2021 12:44:08 PM (GMT)
/*Scala supports various types of inheritance including single, multilevel, multiple, and hybrid. 
You can use single, multilevel and hierarchal in your class. 
Multiple and hybrid can only be achieved by using traits. 
Here, we are representing all types of inheritance by using pictorial form.*/

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
