//@timestamp: 02 Jan 2022 16:08:38 PM (GMT)

import java.util.Date
import java.text.SimpleDateFormat

class ArrayExample{  
    var arr = Array(1,2,3,4,5)      // Creating single dimensional array  
    def show(){  
        for(a<-arr)                       // Traversing array elements  
            println(a)  
        println("Third Element  = "+ arr(2))        // Accessing elements by using index  
    }  
}

object MainObject extends App{
    var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
    println("""//@timestamp: """ + test + " (GMT)")
    var a = new ArrayExample()  
        a.show()  
}
