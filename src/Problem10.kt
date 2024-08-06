fun main() {
    println(todayVsYesterday(300, 250))
    println(todayVsYesterday(300, 300))
    println(todayVsYesterday(200, 220))
}

fun todayVsYesterday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
        return timeSpentToday > timeSpentYesterday

}