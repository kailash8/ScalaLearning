//@timestamp: 28 Nov 2021 18:35:28 PM (GMT)
/*Class is a template or a blueprint. It is also known as collection of objects of similar type.

In scala, a class can contain:
Data member
Member method
Constructor
Block
Nested class
Super class information etc.

You must initialize all instance variables in the class. 
There is no default scope. If you don't specify access scope, it is public. 
There must be an object in which main method is defined. 
It provides starting point for your program. 
Here, we have created an example of class..*/

import java.util.Date
import java.text.SimpleDateFormat

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

class robot {
    var a : Int = 10
    var str : String = null
}

object MainObject {  
    def main(args: Array[String]) = {  
        var root = new robot()
        println(root.a + " " + root.str)
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
