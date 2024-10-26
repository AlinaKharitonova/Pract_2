fun main() {
    //1
    val age1 = 42.0
    val age2 = 21.0

    //2 среднее арифметическое age1 и age2 (63/2) получается 31
    val avg1 = (age1 + age2) / 2
    println (avg1)

    //3 Исправила константы age1 и age2 преобразовав их в тип Double.
    // Теперь выдает правильный рез-т 31.5

    //4
    val firstName = "Alina"
    val lastName = "Kharitonova"

    //5
    val fullName = "$firstName $lastName" // еще можно firstName + lastName, но они будут написаны слитно
    println(fullName)

    //6
    val myDetails = "Привет, меня зовут $fullName"
    println(myDetails)

    //7,8 и 9
    val date: Triple<Int, Int, Int> = Triple (10, 26, 2024)
    val month: Int = date.first
    val day: Int = date.second
    val year: Int = date.third
    println("Дата: $month.$day.$year")
    println("Месяц: $month, Год: $year")

    //10

}