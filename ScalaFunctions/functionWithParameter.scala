//@timestamp: 16:19 28 Nov 2021
object MainObject {
    def main(args: Array[String]) {
        var t1 = 10
        var t2 = 20
        var t3 = "This is test string, and you are adding those two numbers as a String : "
        var b = functionWithParameter(t1,t2,t3)
        println(b)
    }
    def functionWithParameter(a: Int, b:Int, c:String) = {
        var exp1 = c + a + b
        exp1
    }
}
