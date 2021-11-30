//@timestamp: 30 Nov 2021 11:46:19 AM (GMT)
/*Scala provides method overloading feature which allows us to define methods of same name but having different parameters or data types. 
It helps to optimize code.*/

import java.util.Date
import java.text.SimpleDateFormat


/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/


/*case class Sum(a: Int, b: Int)*/

object MainObject {  
    def main(args: Array[String]) = {
        println(method1(10,20))
        println(method1(10,20,30))
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
    
    def method1(a: Int, b: Int): Int ={
    var sum = a + b
    sum
    }

    def method1(a: Int, b:Int, c: Int): Int ={
    var sum = a + b + c
    sum
    }
}
