package scala.test
import java.util.Date
import java.text.SimpleDateFormat

object testingObject {
  def main(args: Array[String]): Unit = {
    var current_time = new SimpleDateFormat("dd-MMM-yyy HH:mm:ss a").format(new Date)
    println(current_time)
  }
}
