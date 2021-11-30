//@timestamp: 30 Nov 2021 16:01:34 PM (GMT)
/*

A trait is like an interface with a partial implementation. 
In scala, trait is a collection of abstract and non-abstract methods. 
You can create trait that can have all abstract methods or some abstract and some non-abstract methods.

A variable that is declared either by using val or var keyword in a trait get internally implemented in the class that implements the trait. 
Any variable which is declared by using val or var but not initialized is considered abstract.

Traits are compiled into Java interfaces with corresponding implementation classes that hold any methods implemented in the traits.
*/


import java.util.Date
import java.text.SimpleDateFormat

trait Printable{
    def print()
}

class Wallpaper extends Printable{
    def print()={
        println("Wallpaper printing")
    }
}
  
object MainObject{  
    def main(args: Array[String]){  
        var tom =new Wallpaper()
        tom.print()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
