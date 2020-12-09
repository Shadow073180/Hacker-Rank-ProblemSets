object Test extends App{

  def sumArray(len: Int, contents: List[Int]): Unit =
  {
    var sum = 0

    //test1
    if(len > 1000) println("Len variable must be less than or equal to 1000")
    
    else
      for (i <- contents) sum += i
      println(sum)
  
  }
  sumArray(5, List(7,9,4,3,10))
  
}




