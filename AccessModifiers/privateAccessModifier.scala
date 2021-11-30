//@timestamp: 30 Nov 2021 19:01:47 PM (GMT)
/*
------------------- Private Access Modifier-----------------------
In scala, private access modifier is used to make data accessible only within class in which it is declared. 
It is most restricted and keeps your data in limited scope. 
Private data members does not inherit into subclasses.
*/


import java.util.Date
import java.text.SimpleDateFormat

class test {
    private var a : Int = 10
    def show(){  
         println(a)  
     }  
}

object MainObject{  
    def main(args: Array[String]){  
        var aa = new test()  
        aa.a = 12
        aa.show()  
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}


--------------
output:
jdoodle.scala:23: error: variable a in class test cannot be accessed in test
        aa.a = 12
           ^
--------------
