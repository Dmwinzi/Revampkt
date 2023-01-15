fun main() {

    var name = "Daniel" //STRING
    var age  = 20  //INT
    var married = false //Boolean
    val height = 44.5 //Double


    println(name + "\t" + age  + "\t" + married + "\t" + height)


    println("Enter x:")
    var x  = readLine()

    println("Enter y:")
    var y = readln()

    var sum  = x!!.toInt() + y.toInt()

    println(sum)


    println("Enter age:")
    var usersage  = readLine()

    println("Enter yearsofexperience: ")

    var yearsofexp = readLine()

    if (usersage!!.toInt() < 18 && yearsofexp!!.toInt() < 3){
        println("not Qualified")
    } else {
        println("qualified")
    }

    println("Enter username: ")
    var  username  = readLine()
    println(username!![0])

    var time = 12

    if (time < 12){
        println("Good morning")
    } else {
        println("Good Evening")
    }

    println("Enter day")
    val days  = readLine()
    when(days!!.toInt()){

        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("No day")
    }

    //while loop
    var i  = 0

    while (i <= 5){
        println(i)
        i++
    }

    //do while loop

    var j = 0

    do {
        println(j)
        j++
        if (j == 5)
            break
    } while (j <= 10)

    var cars = arrayOf("Subaru","BMW","Mercedes","Mazda","Mini Cooper")
     cars[4] = "Audi"
    for (car in cars){
        println(car)
    }

    if ("Audi" in cars){
        println("Found")
    } else {
        println("Not found")
    }

    for (nums in 10..25){
        println(nums)
    }


    //lamda expressions

    var lambdaexpr  = {}




}