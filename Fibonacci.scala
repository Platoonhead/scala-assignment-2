//aim is to print the fibonacci series using recursion
class Logic{
//function to print the fibonacci series 
  def calculate(n:Int,a1:Int,b1:Int,c1:Int):Unit={
     
     var first=a1  // 1st fibonacci number in series
     var second=b1   // 2nd fibonacci number in series
     var next=c1   // variable to hold next fibonacci in series 
     var local=n
      println(s"$first")
      next = first+second
      first=second
      second=next
      local=local-1
     if(local>0)
     calculate(local,first,second,next)  // recursive call to calculate method
	
  }
}

object Fibonacci extends App{
val obj = new Logic       //instantiation of class Logic
obj.calculate(5,0,1,0)   //function invocation along with required parameters(Nth number of series, first number, second number)

}
