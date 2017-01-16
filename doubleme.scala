//program to double all elements in list using map

object doubleme extends App{
  
  var a = List(1,2,3,4,5)
  
  var b=  a.map(_ * 2) // map ireration
   println(b)
}
