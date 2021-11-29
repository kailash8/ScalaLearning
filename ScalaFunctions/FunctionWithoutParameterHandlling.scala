//@timestamp: 28 Nov 2021 15:16:19 PM
import java.util.Date
import java.text.SimpleDateFormat

object MainObject {
    def main(args: Array[String]) = {
        var result1 = FunctionWithoutParameterHandlling(10,2)
        var result2 = FunctionWithoutParameterHandlling(30)
        var result3 = FunctionWithoutParameterHandlling()  //this scenario is being tested
        println(result1 + "\n" + result2 + "\n" + result3)
        
        var test = new SimpleDateFormat("dd MMM yyy HH:mm:ss a").format(new Date)
        println("""//@timestamp: """ +test)
    }
    def FunctionWithoutParameterHandlling(a: Int = 0, b:Int = 0):Int= {
        a+b
    }
}
