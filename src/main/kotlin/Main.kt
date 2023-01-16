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


    //lamda expressions{variables -> return value|| , method body}

     var  result  = add(5,5)

    var resultlambda = {x:Int,y:Int -> x + y}
    var printlambds  = { println("Hello lambda") }
    var stringify = {firstname : String, secondname : String -> println(firstname + secondname)}

    println(result)
    println(resultlambda(4,4))
    printlambds()
    stringify("Daniel", "Mwinzi")

    dosum(7,7) { sum -> println(sum) }


    // KOTLIN COLLECTIONS
    // IMMUTABLE - support only read functionalities
    // MUTABLE - support both read and write functionalities

    //immutable list
    var users  = listOf<String>("Daniel", "mwinzi","Ian","njoroge")

    for (user in users){
        println(user)
    }

    println(users.asReversed())
    println(users.subList(1,3))

    //mutable list

    var addusers  = mutableListOf<String>()
    addusers.add("Mutone")
    addusers.add("Muttwo")
    addusers.add("Mutthree")
    addusers.add("Mutfour")
    addusers.add("Mutfive")
    addusers.add("Mutfive")

    println(addusers.subList(1,2))
    addusers.set(2,"Wasss")
    for (usr in addusers){
        println(usr)
    }

     val arrlst  = ArrayList<String>()
     arrlst.add("Ajay")
     arrlst.add("Vijay")
     arrlst.add("Rohan")
     arrlst.add("Vijay")
    arrlst.add("Vijay")

    println(arrlst.size)
    arrlst.forEach { arr-> println(arr) }

    val iterator  = arrlst.iterator()

    while (iterator.hasNext()){
        println(iterator.next())
    }

    //set recoginzes same values
    val names  = setOf<String>("Dan","Dan","mwinzi")

    names.forEach { println(it) }

    val addnames  = mutableSetOf<String>("Ajay","Krishna","Markx","Ajay ")
    addnames.forEach { println(it)}

    //maps

    val students = mapOf<Int,String>(1 to "nad",2 to "mwinzi", 3 to "man")

    println(students.entries)
    println(students.keys)

    val mutstudents  = mutableMapOf<Int,String>()
    mutstudents.set(1,"mutone")
    mutstudents.set(2, "muttwo")
    mutstudents.set(3,"mutthree")

    for (mapstu  in mutstudents){
        println(mapstu)
    }




}

fun add(x:Int, y:Int)  : Int{
    return x + y
}


fun dosum(x: Int, y:Int, sum: (Int) -> Unit){

      var result  = x + y
       sum(result)

}