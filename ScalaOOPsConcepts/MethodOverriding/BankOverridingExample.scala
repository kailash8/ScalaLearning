//@timestamp: 30 Nov 2021 12:30:02 PM (GMT)
/*When a subclass has the same name method as defined in the parent class, it is known as method overriding. 
When subclass wants to provide a specific implementation for the method defined in the parent class, it overrides method from parent class.
In scala, you must use either override keyword or override annotation to override methods from parent class.*/

import java.util.Date
import java.text.SimpleDateFormat

class Bank{    
        def getRateOfInterest()={  
            0  
        }    
    } 
    
    class HDFC extends Bank{
        override def getRateOfInterest()={
            10
        }
    }
        
    class SBI extends Bank{    
        override def getRateOfInterest()={  
            8  
        }    
    }    
        
    class ICICI extends Bank{    
        override def getRateOfInterest()={  
            7  
        }    
    }    
      
    class AXIS extends Bank{    
        override def getRateOfInterest()={  
            9  
        }    
    }    
        

/*var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
println("""//@timestamp: """ + test + " (GMT)")*/

object MainObject {  
    def main(args: Array[String]) = {
            var s=new SBI()
            var h=new HDFC()
            var i=new ICICI()    
            var a=new AXIS()    
            println("SBI Rate of Interest: "+s.getRateOfInterest())
            println("HDFC Rate of Interest: "+h.getRateOfInterest())  
            println("ICICI Rate of Interest: "+i.getRateOfInterest())    
            println("AXIS Rate of Interest: "+a.getRateOfInterest())      
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ + test + " (GMT)")
    }  
}
