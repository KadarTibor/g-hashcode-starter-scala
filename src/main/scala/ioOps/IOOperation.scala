package ioOps

import java.io.{BufferedWriter, File, FileWriter, PrintWriter}
import scala.io.Source


object IOOperation {

  def readFile[T](fileName: String): InputData = {
    val source = Source.fromFile(fileName)

//  source.getLines().next()

    // process metaData from first line
    val metaData = source.bufferedReader().readLine()
    // read more metadata from the next few lines
    (0 to 10).foreach(index => {
      val line = source.bufferedReader().readLine()
      // process metaData line
    })
    // process rest of the data, replace 5000 with data extracted from metaData
    (0 to 5000).foreach(index => {
      val line = source.bufferedReader().readLine()
      // process data point
    })

    source.close()
    // build the inputData
    InputData()
  }

  def writeFile(outputData: OutputData, fileName: String) = {
    val writer = new PrintWriter(new File(fileName ))
    // read the output data and write it into the expected shape
    writer.write("Hello")
    writer.close()
  }

}
