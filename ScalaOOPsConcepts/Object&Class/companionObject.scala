//@timestamp: 29 Nov 2021 17:14:05 PM (GMT)
/*In scala, when you have a class with same name as singleton object, 
it is called companion class and the singleton object is called companion object.*/

import java.util.Date
import java.text.SimpleDateFormat

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

class MainObject{
    def hello{
        println("Hello, this is Companion Class.")  
    }
}

object MainObject {  
    def main(args: Array[String]) = {  
        new MainObject().hello //no need to create object
        println("And this is Companion Object.") 
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
