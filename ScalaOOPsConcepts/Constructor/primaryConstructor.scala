//@timestamp: 30 Nov 2021 11:39:02 AM (GMT)
/*Scala Primary Constructor:
Scala provides a concept of primary constructor with the definition of class. 
You don't need to define explicitly constructor if your code has only one constructor. 
It helps to optimize code. You can create primary constructor with zero or more parameters.*/

import java.util.Date
import java.text.SimpleDateFormat


class Student(id:Int, name:String){  
    def showDetails(){  
        println(id+" "+name);  
    }  
}

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/



/*case class Sum(a: Int, b: Int)*/

object MainObject {  
    def main(args: Array[String]) = {
        var data = new Student(10,"Bomaroaw sticked")
        data.showDetails()
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
