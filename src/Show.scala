object Show {

  def main(args: Array[String]) {
    //Escape Sequences
    //    println("Hello\tWorld");
    //    println("Hello\nWorld");
    //    print("Hello World")
    //    print("Hello World")
    //    println("Hello\\World");
    //    println("Hello\" World");

    //Data Types
    //    var x=10L
    //Without giving the data type
    //    var x=10.23F
    //    println(x)
    //Unit data type is simillar to void. We use it when we don't return anything


    //By giving the data type
    //    var variableName : DataType=value
    //    var number: Double=10
    //    var number: Boolean=true
    //    var number1:Int=10
    //    var number2:Int=20
    //    var sum:Int=number1+number2
    //    println(sum)


    // Var vs Val
    // We cannot reassign to val
    // var x=10
    // x=20
    //val is used to create constants instead of var for any data type
    // val y=20
    // val pi=3.142
    // println(pi)

    //Getting the user input
    //println("Hey Sirisena! Enter your number ")
    //    println("Hey Sirisena! Enter your name ")
    //
    //    //var number=scala.io.StdIn.readInt()
    //    var name=scala.io.StdIn.readLine()
    //
    //    println(name)

    //If else and how it works in Scala
    //    println("Hey Sirisena! Enter your number ")
    //    var number=scala.io.StdIn.readInt()
    //    if(number>=10)
    //    {
    //      println("Number is greater than or equal to 10")
    //    }
    //    else{
    //      println("Number is lesser than 10")
    //    }

    //    //Else if
    //        println("Hey Sirisena! Enter your marks ")
    //        var marks=scala.io.StdIn.readInt()
    //
    //        if(marks>=75 && marks<=100)
    //        {
    //          println("Your Grade is A")
    //        }
    //
    //        else if(marks>=65 && marks<75)
    //        {
    //          println("Your Grade is B")
    //        }
    //
    //        else if(marks>=55 && marks<65)
    //        {
    //          println("Your Grade is C")
    //        }
    //
    //        else if(marks>=35 && marks<55)
    //        {
    //          println("Your Grade is S")
    //        }
    //
    ////        else if(marks>=0 && marks<35)
    ////        {
    ////          println("Your Grade is W")
    ////        }
    //
    //        else
    //        {
    //          println("Your Grade is W")
    //
    //        }

    //for loops
    //            for(i<-1 to 10)
    //            for(i<-1 until 10)
    //            {
    //              println("i = "+i)
    //              println("Ranmal Mendis")
    //            }

    //Nested for loops
    //                for(i<-1 until 6)
    //                {
    //                  for(j<-1 until 6)
    //                  {
    //                    println("i = "+i +" j= "+j)
    //                  }
    //
    //                }

    //    print asterisk pattern
    //    for(i<-1 until 7)
    //    {
    //      print("* ")
    //
    //
    //      for(j<-1 until i)
    //      {
    //        print("* ")
    //
    //      }
    //      println()
    //
    //    }

    // While loop
    //   var number=0
    //
    //
    //
    //    while(number != 10){
    //      print("Enter your Number: ")
    //      number=scala.io.StdIn.readInt();
    //
    //    }

    //Do while loop
    //        var number=0
    //
    //        do {
    //          print("Enter your Number: ")
    //          number=scala.io.StdIn.readInt()
    //        }
    //        while(number != 10)
    //        {
    ////          print("Enter your Number: ");
    ////          number=scala.io.StdIn.readInt();
    //          print(" ****** ")
    //
    //        }

    // Another method to call functions
    //call by val
    //   var i=0
    //
    //    show{
    //      i+=1
    //      i
    //    }
    //
    //
    //  }

    //functions

    //function parameters - deleted
    // passing multiple params - deleted
    // typecasting - deleted

    //

    //  def show(x1:Int)
    //  {
    //    println(x1)
    //    println(x1)
    //    println(x1)
    //
    //
    //  }

    //call by name
    //  def show(x1: =>Int)
    //  {
    //    println(x1)
    //    println(x1)
    //    println(x1)
    //
    //
    //  }
    //
    //name arguments

    //    add(b=5,a=4)

    // annonymous functions or lambda functions
    //Method 1
    //    var result=(a:Int,b:Int)=>a+b
    //    println(result(10,10))
    //
    //    //Method 2
    //    var result1=(_:Int)+(_:Int)
    //    println(result1(2,3))


    //name arguments
    //  def add  (a:Int,b:Int)
    //  {
    //    println("a = "+a)
    //    println("b = "+b)
    //
    //  }

    // annonymous functions
    //  hExample(2,6,add)


    //Higher order functions
    // We pass a function as a parameter and we can even return a function from them
    //  def hExample(x:Int, y:Int,f:(Int,Int)=>Int)
    //  {
    //    var value=f(x,y)//calling the function
    //    println(value)
    //
    //  }
    //
    //  def add(x:Int,y:Int):Int={
    //    return x+y
    //
    //
    //  }

    //    hExample(4,8,(a,b)=>a+b)
    //  }
    //// Higher order fuctions method 2 : with Lambda/Anonymous functions
    //    def hExample(x:Int, y:Int,f:(Int,Int)=>Int)
    //    {
    //      var value=f(x,y)//calling the function
    //      println(value)
    //
    //    }

    //Fully applied functions

    //var x=mul(2,4,3)
    //    println(x)

    //    //Partially applied functions
    //    var x=mul(2,4,_:Int)
    //
    //    println(x(2))
    //    println(x(4))
    //
    //    var y=mul(2,_:Int,_:Int)
    //    println(y(2,7))
    //    println(y(2,5))
    //
    //
    //
    //
    //
    //
    //
    //    //   println(x)
    //  }
    //
    //  def mul(x:Int,y:Int,z:Int):Int=
    //  {
    //    x*y*z;
    //  }

    //  }

    //Recursion Functions
    //4!=4**3*2*1
    //0!=1
    //3!=3*2!
    //  var value=factorial(3)
    //    println(value)
    //  }
    //
    //  def factorial(n:Int):Int={
    //    if(n==0){
    //      return 1
    //    }
    //    else{
    //      return n*factorial(n-1);
    //
    //    }
    //  }
    //
    //  print(add(3,5,6))
    //  }
    //
    //  def add(a:Int,b:Int,c:Int):Int={
    //
    //    def add1(x:Int,y:Int):Int={
    //      x+y
    //
    //    }
    //    add1(a,add1(b,c))
    //  }

  }
}
