//@timestamp: 28 Nov 2021 19:05:20 PM (GMT)
/*In scala, you can create anonymous object. An object which has no reference name is called anonymous object. 
It is good to create anonymous object when you don't want to reuse it further.*/

import java.util.Date
import java.text.SimpleDateFormat

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

class robot (){
    def show(a: Int, b: String){
        println(a + " piece " + b)
    }
}

object MainObject {  
    def main(args: Array[String]) = {  
        new robot().show(10,"luthor")
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
