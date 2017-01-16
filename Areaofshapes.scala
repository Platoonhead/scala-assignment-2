//program to calculate area of shapes
class AreaCalculate{

	def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int): Int = f(first,second) // higher order function
}

object Areaofshapes extends App{

	val areaobj = new AreaCalculate()
	
          val shape = "rhombus" 
	  shape match { // calling according to match
		case "rectangle" => val rectangle_area = areaobj.area("rectangle", 5, 7,(x, y)=> x*y)
                                    println(s"area of rhombus is $rectangle_area") 
	
		case "rhombus" => val rhombus_area = areaobj.area("rhombus", 5, 7,(x, y)=> x*y)
				  println(s"area of rhombus is $rhombus_area")

		case "parallelogram" => val parll_area = areaobj.area("parallelogram", 5, 7,(x, y)=> x*y/2)
                                        println(s"area of rhombus is $parll_area")

		case _ => println("Not a valid shape")
		}




}
