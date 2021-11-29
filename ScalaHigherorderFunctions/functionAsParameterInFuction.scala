//@timestamp: 28 Nov 2021 15:33:10 PM

import java.util.Date
import java.text.SimpleDateFormat

object MainObject {  
   def main(args: Array[String]) = {  
     functionExample(25, multiplyBy2) 
     
     var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
     println("""//@timestamp: """ +test)
     
    }  
    def functionExample(a:Int, f:Int=>AnyVal):Unit = {  
        println(f(a))                                   // Calling that function   
    }  
    def multiplyBy2(a:Int):Int = {  
        a*2  
    }  
}  
