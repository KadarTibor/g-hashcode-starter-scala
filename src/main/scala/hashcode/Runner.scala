package hashcode

import ioOps.{IOOperation, OutputData}

case object Runner extends App {
  IOOperation.readFile("problem-files/a.txt")
  IOOperation.writeFile( OutputData(),"problem-files/output-a.txt")
}
