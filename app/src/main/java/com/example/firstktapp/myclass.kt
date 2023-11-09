package com.example.firstktapp

public  class myclass : aa(){
    // when we want to inheritate the method that time we use the synatx like this
    // In this aa method you have to write the open keyword in to the class file
    companion object{
        @JvmStatic
        fun main(args:Array<String> ) {

//  1.0 datatypes
//            Double
//            Int
//            String
//            Float and many more ...
//              synatx like this
            var a : Int = 3
            var b : String = "rana"
            println("Harshiv here my lucky number is $a")
            // in above line the $ is called the lamda function
            println("Harshiv here my lucky number is " + a)
            println("My surname is $b");

//  1.1 var and val (difference)
            // type1
            var c : Float
            c = 15.9F
            println(c)
            //type 2
            var d = 20.5
            println(d)
            // type 3
            var e = 56
            // now we change the value of this varibale
            // e = "hearshiv" this willl throw an error becuase of type mis match
            println(e)
            //type 4
            var f = 78
            f = 66
            //we can change the value by this
            println(f)

            //val ketword (Val can not be reassigned like the var )
            val g = "virat kohli"
            println(g)


            println("The sum of the two variables is : ${add(5,10)}")
            // overload the method of add by the different paramteres
            println("The sum of the two variables is : ${add(5,10,15)}")

        }
//  1.2 methods
            // by default all the methods are private you have to open it by manually
            //synatx of method
            // here the Int is the return type of this method if you return some value or not
           // we can't make the 2 methods inside the onr another methods
        // in this case there's main and also the add method for that
            fun add(x : Int, y : Int) : Any {
                // this will only return the Int data
                return x+y
            }
             fun add(x : Int, y : Int,z : Int) : Any {
                // this will only return the Int data
                return x+y+z
             }
            fun add0() : Int {
                // this will only return the Int data
                return 7
            }
            fun add1() : Any {
                // this will return any kind of value not speciallcies
                return "return the String"
            }
    }
}
