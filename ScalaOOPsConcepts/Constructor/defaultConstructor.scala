//@timestamp: 29 Nov 2021 17:23:28 PM (GMT)
/*In scala, constructor is not special method. 
Scala provides primary and any number of auxiliary constructors. 
We have explained each in details in the following example.
In scala, if you don't specify primary constructor, compiler creates a constructor which is known as primary constructor. 
All the statements of class body treated as part of constructor. It is also known as default constructor.*/

import java.util.Date
import java.text.SimpleDateFormat


class Student{  
println("Hello from default constructor");  
}  


var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/



/*case class Sum(a: Int, b: Int)*/

/*object MainObject {  
    def main(args: Array[String]) = {  
        var res = Sum(10,120) //creating object of case class
        println("a: "+res.a) //Accessing elements of case class
        println("b: "+res.b)
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  */
