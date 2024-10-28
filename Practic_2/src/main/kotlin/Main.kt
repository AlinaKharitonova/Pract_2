fun main() {
    //1
    val age1 = 42
    val age2 = 21

    //2 среднее арифметическое age1 и age2 (63/2) получается 31
    val avg1 = (age1 + age2) / 2
    println (avg1)

    //3 Исправила константы age1 и age2 преобразовав их в тип Double.
    val age3 = age1.toDouble()
    val age4 = age2.toDouble()
    val avg2 = ( age3 + age4) / 2
    println (avg2)

    //4
    val firstName = "Alina"
    val lastName = "Kharitonova"

    //5
    val fullName = "$firstName $lastName" // еще можно firstName + " " + lastName
    println(fullName)

    //6
    val myDetails = "Привет, меня зовут $fullName"
    println(myDetails)

    //7
    val date: Triple<Int, Int, Int> = Triple (10, 26, 2024)
    //8
    val month: Int = date.first
    val day: Int = date.second
    val year: Int = date.third
    //9
    println("Дата: $month.$day.$year")
    println("""
    |Месяц: $month
    |
    |Год: $year""".trimMargin())

    //10
    val date1 = Pair (month,year)
    val month1 = date1.first
    val year1 = date1.second
    val newMonth = month1 + 1
    val newDate1 = Pair(newMonth,year)
    println("Старая Pair: $date1")
    println("Новая Pair: $newDate1")
}