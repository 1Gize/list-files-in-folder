import java.io.File

object Main extends App{
  getListOfFiles("C:\\")
  def getListOfFiles(dir: String) = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.toList.foreach(println)
    }
  }
}
