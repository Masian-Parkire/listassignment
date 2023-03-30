fun main() {
  var get = given(listOf("girl","boy","cow","dog","cat","eat","cry","sit","sing","fly"))
    println(get)

    val people =listOf(56.7,45.6,57.9,67.8,98.7,34.7)
    val (x,y) = heights(people)
    println("Total height is $x")
    println("Average height is $y")
    println(people)

    human()

    val cars = listOf(
            Car("KAZ236F", 3700.0),
            Car("KBZ790D", 6000.0),
            Car("KCD978G", 1500.0)
    )

    val avgMileage = averageMileage(cars)
    println("The average mileage of all vehicles is $avgMileage")





//    var Subaru = Car("KCT 234R",234)
//    var Vitz = Car("KCB 256T",134)
//    var opel = Car("KCE 435Y",756)
//    var cars = listOf(Subaru,Vitz,opel)
////    var getav = getAverage(listOf(Subaru,Vitz,opel))
//     println(getAverage(cars))
////    println(getav)



}
// 1 Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun given(str: List<String>): List<String> {
    val even = mutableListOf<String>()
    for (i in str.indices step 2) {
        even.add(str[i])
    }
    return even
}
// 2 Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heights (height:List<Double>):Pair<Double,Double>{
    val x = height.sum()
    val y = height.average()
    return Pair(x,y)

}
// 3 Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(val name: String, val age: Int, val height: Double, val weight:Double)

fun human() {

    val person1 = Person("valary", 20, 145.5, 87.8)
    val person2 = Person("Kemunto", 15, 160.8, 30.6)
    val person3 = Person("Buraje", 40, 200.5, 90.8)

 val human = listOf(person1,person2,person3)
    val man = human.sortedByDescending { Person -> Person.age }
    println(man)
}
//4 Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.



// 5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.


//data class Car (var Registration:String, var mileage:Int)
//
//fun getAverage (avgmileage:List<Car>): Double{
//    var sum = 0.0
//    avgmileage.forEach { car ->
//        sum+=car.mileage
//
//
//    }
//    var avg = sum/avgmileage.count()
//    return avg
//
//}
data class Car(val registration: String, val mileage: Double)

fun averageMileage(cars: List<Car>): Double {
    val totalM = cars.sumByDouble { it.mileage }
    return totalM / cars.size
}