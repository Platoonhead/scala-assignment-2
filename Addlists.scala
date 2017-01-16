//Program for adding elements of two lists
object Addlists extends App{   

	val list1 = List(1,2,3,4) 
	val list2 = List(5,6,7,8)  
  
        val finalList = for { 
                           
                               iterator1 <- 0 to list1.length-1
                               sum = list1(iterator1)+list2(iterator1)
                               
                         }yield sum   // using for comprehension yielding the sum of list elements

       println(finalList)
}
