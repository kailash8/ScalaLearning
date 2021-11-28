//@timestamp: 28 Nov 2021 15:16:19 PM
//In scala function, you can specify the names of parameters during calling the function. 
//In the given example, you can notice that parameter names are passing during calling. You can pass named parameters in any order and can also pass values only.

import java.util.Date
import java.text.SimpleDateFormat

object MainObject {
    def main(args: Array[String]) = {
        var result1 = FunctionNamedParameter(a=10, b=2)
        var result2 = FunctionNamedParameter(b=10, a=2)
        var result3 = FunctionNamedParameter(10,2)  //this scenario is being tested
        println(result1 + "\n" + result2 + "\n" + result3)
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ +test)
    }
    def FunctionNamedParameter(a: Int = 0, b:Int = 0):Int= {
        a+b
    }
}
