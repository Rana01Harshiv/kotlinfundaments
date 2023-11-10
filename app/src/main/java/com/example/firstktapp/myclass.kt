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

//   1.3 conditiniol statements
            var num = 100
            // normal if
            if (num>50){
                println("number is largeer")
            }
            // if -else
            if(num <50) {
                println("small than 50 ")
            }else{
                println("bigger than 50")
            }
            // ternary if-else statements
            var num1 = 50
            var mesg = " "

            mesg = if(num1<10) "less than 10" else "greather than 10 "
            println(mesg)

            // if - else if statements
            if(num1 == 50 ){
                println("number is 50")
            }
            else if(num1<50){
                println("number is less than 50")
            }
            else if(num1 > 50){
                println("number is bigger than 50 ")
            }
            else{
                println("Invalid number")
            }
            // when is using alternate of switch case
            when(num1){
                1 -> {
                    println("number is 1")
                }
                50 -> {
                    println("number is 50")
                }
                100 -> {
                    println("number is 100")
                }
            }
            when{

                num1 >500 ->{
                    println("bigger than 500 ....")
                }
                num1 < 10 ->{
                    println("less than 50")
                }
                num1 == 50 ->{
                    println("number is 50")
                }
            }
//  1.4 for and for each loop
            var n = 1
            for (i in 0..4){
                println("the number is: ${n++}")
                //n++      //alternate way
            }
            // this will exit before the 4
            var m = 1
            for (i in 0 until 4){
                println("the number is: ${m++}")
                //n++      //alternate way
            }
            //this will reverse the loop like decremnet way
            var o = 1
            for (i in 5 downTo 0){
                println("the number is: ${o++}")
                //n++      //alternate way
            }
            // step is for increment and decrement the value
            var p = 1
            for (i in 10 downTo 0 step 5){
                println("the number is: ${p++}")
                //n++      //alternate way
            }
            val arrno = ArrayList<Int>()   // synatx of array
            arrno.add(10)
            arrno.add(20)
            arrno.add(30)
            arrno.add(40)
            arrno.add(50)
           for (i in arrno) {
               println("Array number is : $i")
           }

//  1.5 while and do while loop

        }
        fun add1() : Any {
            // this will return any kind of value not speciallcies
            return "return the String"
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
    }
}
