//@timestamp: 16:46 28 Nov 2021
object MainObject {
    def main(args: Array[String]) {
        var result =RecursionFunction(10,2)
        println(result)
    }
    def RecursionFunction(a: Int, b:Int) : Int= {
        if (b == 0)
        0
        else
        a+RecursionFunction(a, b-1)
    }
}
