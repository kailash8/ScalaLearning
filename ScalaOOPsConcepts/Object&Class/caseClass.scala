//@timestamp: 29 Nov 2021 17:23:28 PM (GMT)
/*Scala case classes are just regular classes which are immutable by default and decomposable through pattern matching.
It uses equal method to compare instance structurally. It does not use new keyword to instantiate object.
All the parameters listed in the case class are public and immutable by default.*/

import java.util.Date
import java.text.SimpleDateFormat

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

case class Sum(a: Int, b: Int)

object MainObject {  
    def main(args: Array[String]) = {  
        var res = Sum(10,120) //creating object of case class
        println("a: "+res.a) //Accessing elements of case class
        println("b: "+res.b)
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
