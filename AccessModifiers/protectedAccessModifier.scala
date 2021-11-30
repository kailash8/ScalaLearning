//@timestamp: 30 Nov 2021 19:05:52 PM (GMT)
/*
-------------------Protected Access Modifier-----------------------
Protected access modifier is accessible only within class, sub class and companion object. 
Data members declared as protected are inherited in subclass. Let's see an example.
*/


import java.util.Date
import java.text.SimpleDateFormat

class protectedTest {
    protected var ram: String = "protectedTest"
}

class test extends protectedTest{
    def display(){  
        println("ram = "+ram)  
    }  
}

object MainObject{  
    def main(args: Array[String]){  
        var aa = new test()  
        aa.display()  
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}

