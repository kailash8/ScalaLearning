//@timestamp: 28 Nov 2021 15:45:12 PM (GMT)
//In scala, functions can be composed from other functions. 
//It is a process of composing in which a function represents the application of two composed functions.

import java.util.Date
import java.text.SimpleDateFormat

object MainObject {  
   def main(args: Array[String]) = {  
     functionComposition(add(10)) 
     
     var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
     println("""//@timestamp: """ +test)
     
    }  
    def functionComposition(a: Int):Unit = {  
        println(a*2)
    }  
    def add(a:Int):Int = {  
        a+10
    }  
}  
