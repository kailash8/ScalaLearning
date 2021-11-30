//@timestamp: 30 Nov 2021 19:08:58 PM (GMT)
/*
-------------------No-Access-Modifier-----------------------
In scala, when you don't mention any access modifier, it is treated as no-access-modifier. It is same as public in java. 
It is least restricted and can easily accessible from anywhere inside or outside the package.
*/


import java.util.Date
import java.text.SimpleDateFormat

class protectedTest {
    var ram: String = "protectedTest"
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
