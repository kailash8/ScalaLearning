//@timestamp 20:10 28 Nov 2021
object MainObject {
    def main(args: Array[String]) = {
        var result1 = FunctionWithoutParameterHandlling(10,2)
        var result2 = FunctionWithoutParameterHandlling(30)
        var result3 = FunctionWithoutParameterHandlling()  //this scenario is being tested
        println(result1 + "\n" + result2 + "\n" + result3)
    }
    def FunctionWithoutParameterHandlling(a: Int = 0, b:Int = 0):Int= { //Parameter with default values
        a+b
    }
}
