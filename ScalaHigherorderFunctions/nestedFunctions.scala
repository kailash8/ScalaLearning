//@timestamp: 28 Nov 2021 18:17:00 PM (GMT)
/*Scala is a first class function language which means it allows you to passing function, returning function, 
composing function, nested function etc. 
An example below explain about how to define and call nested functions.*/

import java.util.Date
import java.text.SimpleDateFormat

object MainObject {  
    def add(a:Int, b:Int, c:Int) = {  
        def add2(x:Int,y:Int) = {  
            x+y  
        }  
        add2(a,add2(b,c))  
    }  
    def main(args: Array[String]) = {  
        var result = add(10,10,10)  
        println(result)  
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
