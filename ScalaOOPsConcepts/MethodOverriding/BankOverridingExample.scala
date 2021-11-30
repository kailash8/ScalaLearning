//@timestamp: 30 Nov 2021 12:30:02 PM (GMT)
/*Scala supports various types of inheritance including single, multilevel, multiple, and hybrid. 
You can use single, multilevel and hierarchal in your class. 
Multiple and hybrid can only be achieved by using traits. 
Here, we are representing all types of inheritance by using pictorial form.*/

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
