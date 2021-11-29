//@timestamp: 28 Nov 2021 18:23:58 PM (GMT)
/*In scala, you can define function of variable length parameters. 
It allows you to pass any number of arguments at the time of calling the function.*/

import java.util.Date
import java.text.SimpleDateFormat

object MainObject {  
    def add(args: Int*) = {
        var sum = 0
        for(a <- args)
        sum += a
        sum
    }  
    def main(args: Array[String]) = {  
        var sum = add(10,10,10,40,20)  
        println(sum)  
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
