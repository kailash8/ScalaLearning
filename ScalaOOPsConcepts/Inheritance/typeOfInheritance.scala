//@timestamp: 30 Nov 2021 12:30:02 PM (GMT)
/*Scala supports various types of inheritance including single, multilevel, multiple, and hybrid. 
You can use single, multilevel and hierarchal in your class. 
Multiple and hybrid can only be achieved by using traits. 
Here, we are representing all types of inheritance by using pictorial form.*/

import java.util.Date
import java.text.SimpleDateFormat

class A{  
    var salary1 = 10000  
}  
  
class B extends A{  
    var salary2 = 20000  
}  
  
class C extends B{  
    def show(){  
        println("salary1 = "+salary1)  
        println("salary2 = "+salary2)  
    }  
}

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

object MainObject {  
    def main(args: Array[String]) = {
        var s =  new C()
        s.show()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
