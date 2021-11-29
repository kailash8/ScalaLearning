//@timestamp: 28 Nov 2021 15:53:51 PM (GMT)
//Anonymous function is a function that has no name but works as a function. 
//It is good to create an anonymous function when you don't want to reuse it latter.

import java.util.Date
import java.text.SimpleDateFormat

object MainObject {  
   def main(args: Array[String]) = {  
     var c = (a:Int,b:Int) => a+b
     var d = (_:Int)+(_:Int)
     
     println(c(10,20))
     println(d(20,20))
     
     
     var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
     println("""//@timestamp: """ + test + " (GMT)")
     
    }  
}  
