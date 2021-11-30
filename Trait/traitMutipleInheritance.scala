//@timestamp: 30 Nov 2021 18:10:37 PM (GMT)
/*

A trait is like an interface with a partial implementation. 
In scala, trait is a collection of abstract and non-abstract methods. 
You can create trait that can have all abstract methods or some abstract and some non-abstract methods.

A variable that is declared either by using val or var keyword in a trait get internally implemented in the class that implements the trait. 
Any variable which is declared by using val or var but not initialized is considered abstract.

Traits are compiled into Java interfaces with corresponding implementation classes that hold any methods implemented in the traits.

--If a class extends a trait but does not implement the members declared in that trait, it must be declared abstract. Let's see an example.--


trait Printable{  
    def print()  
}  
  
abstract class A4 extends Printable{            // Must declared as abstract class  
   def printA4(){  
       println("Hello, this is A4 Sheet")  
   }  
}  

--------
If a class implements multiple traits, it will extend the first trait, class, abstract class. 
with keyword is used to extend rest of the traits.
You can achieve multiple inheritances by using trait.
--------


*/


import java.util.Date
import java.text.SimpleDateFormat

trait Printable{
    def print()
}

trait Television{
    def show()
}

class Device extends Printable with Television{
    def show(){
        println("Television implementing method show")
    }
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
