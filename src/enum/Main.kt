package enum

fun main() {
    val month: Month = Month.JANUARY
    val season = when (month){
        Month.DECEMBER, Month.JANUARY, Month.FEBRUARY-> Season.WINTER
        Month.MARCH, Month.APRIL, Month.MAY -> Season.SPRING
        Month.JUNE, Month.JULY, Month.AUGUST -> Season.SUMMER
        Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> Season.AUTUMN
        else -> "Not find"
    }
    println(Month.JANUARY.tempAverage)
    println(season)
}
enum class Month(val tempAverage: Int){
    JANUARY(10), FEBRUARY(9), MARCH(12), APRIL(13), MAY(16),
    JUNE(15), JULY(20), AUGUST(21), SEPTEMBER(13), OCTOBER(12),
    NOVEMBER(2), DECEMBER(-2)
}
enum class Season{
    WINTER, AUTUMN, SUMMER, SPRING
}