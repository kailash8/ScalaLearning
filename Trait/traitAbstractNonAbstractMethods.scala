//@timestamp: 30 Nov 2021 18:32:47 PM (GMT)
/*
-------Scala Trait having abstract and non-abstract methods------

You can also define method in trait as like in abstract class. I.e. you can treat trait as abstract class also. 
In scala, trait is almost same as abstract class except that it can't have constructor. 
You can't extend multiple abstract classes but can extend multiple traits.

*/


import java.util.Date
import java.text.SimpleDateFormat

trait Printable{
    def print()
    def show(){
        println("Television implementing method show")
    }
}

/*trait Television{
    def show()
}*/

class Device extends Printable{
    def print(){
        println("Printable implementing method print")
    }
}


object MainObject{  
    def main(args: Array[String]){  
        var tom =new Device()
        tom.print()
        tom.show()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
