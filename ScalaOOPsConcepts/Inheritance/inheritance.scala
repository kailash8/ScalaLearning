//@timestamp: 30 Nov 2021 12:22:44 PM (GMT)
/*Inheritance is an object oriented concept which is used to reusability of code. 
You can achieve inheritance by using extends keyword. 
To achieve inheritance a class must extend to other class. A class which is extended called super or parent class. 
a class which extends class is called derived or base class.

--syntax--
class SubClassName extends SuperClassName(){}  
*/

import java.util.Date
import java.text.SimpleDateFormat

class Employee {
    var salary : Float = 2000
}

class developer extends Employee {
    var bonus:Int = 50
    println("Salary = "+salary)  
    println("Bonus = "+bonus)  
}

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

object MainObject {  
    def main(args: Array[String]) = {
        var t =  new developer()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
