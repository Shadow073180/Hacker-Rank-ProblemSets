object Test extends App{

  var arrayList = List(1,2,3,4,5)
  var sum = 0

  for (i <- arrayList) sum += i
  println(sum)
  
}

