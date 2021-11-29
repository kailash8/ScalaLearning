//@timestamp: 28 Nov 2021 18:51:58 PM (GMT)
/*In scala, you can create class like this also. Here, constructor is created in class definition. 
This is called primary constructor.*/

import java.util.Date
import java.text.SimpleDateFormat

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

class robot (a: Int, b: String){
    def show(){
        println(a + " piece " + b)
    }
}

object MainObject {  
    def main(args: Array[String]) = {  
        var root = new robot(10,"Marteen")
        root.show()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}  
