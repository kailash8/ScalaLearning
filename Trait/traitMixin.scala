//@timestamp: 30 Nov 2021 18:43:20 PM (GMT)
/*
-------------------Scala Trait Mixins-----------------------
In scala, trait mixins means you can extend any number of traits with a class or abstract class. 
You can extend only traits or combination of traits and class or traits and abstract class.

It is necessary to maintain order of mixins otherwise compiler throws an error.

You can use mixins in scala like this:

Scala Trait Example: Mixins Order Not Maintained
In this example, we have extended a trait and an abstract class. Let's see what happen.

trait Print{  
    def print()  
}  
  
abstract class PrintA4{  
    def printA4()  
}  
  
class A6 extends Print with PrintA4{  
    def print(){                // Trait print  
        println("print sheet")  
    }  
    def printA4(){              // Abstract class printA4  
        println("Print A4 Sheet")  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        var a = new A6()  
        a.print()  
        a.printA4()  
    }  
} 
---------------------
Output:

error: class PrintA4 needs to be a trait to be mixed in
class A6 extends Print with PrintA4{
                            ^
one error found
---------------------

The above program throws a compile time error, because we didn't maintain mixins order.

Scala Mixins Order
The right mixins order of trait is that any class or abstract class which you want to extend, first extend this. 
All the traits will be extended after this class or abstract class.

Scala Trait Example: Mixins Order Maintained

first extend all classes other than trait to avoid above shown error.

*/


import java.util.Date
import java.text.SimpleDateFormat

trait Print{  
    def print()  
}  
  
abstract class PrintA4{  
    def printA4()  
}  
  
class A6 extends PrintA4 with Print{        // First one is abstract class second one is trait  
    def print(){                            // Trait print  
        println("print sheet")  
    }  
    def printA4(){                          // Abstract class printA4  
        println("Print A4 Sheet")  
    }  
}  


object MainObject{  
    def main(args: Array[String]){  
        var a = new A6()  
        a.print()  
        a.printA4()
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
