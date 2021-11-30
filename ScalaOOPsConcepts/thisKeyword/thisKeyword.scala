//@timestamp: 30 Nov 2021 11:46:19 AM (GMT)
/*In scala, this is a keyword and used to refer current object. 
You can call instance variables, methods, constructors by using this keyword.*/

import java.util.Date
import java.text.SimpleDateFormat


/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/


/*case class Sum(a: Int, b: Int)*/
class thisSample{
    var id:Int = 0  
    var name: String = ""  
    def this(id:Int, name:String){  
        this()  
        this.id = id  
        this.name = name  
    } 
    
    def show(){  
        println(id+" "+name)  
    } 
}
object MainObject {  
    def main(args: Array[String]) = {
        var t = new thisSample(10,"luthor")
        t.show()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
