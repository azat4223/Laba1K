import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Номер 11.")
    print("Введите x (|x| > 1): ")
    val x = scanner.nextDouble()
    if (x > 1 || x < -1) {
        print("Введите n: ")
        val n = scanner.nextDouble()
        var res: Double = 0.0
        var i: Int = 0
        while (i <= n) {
            res += 1.0 / ((2 * i + 1) * Math.pow(x, 2.0 * i + 1.0))
            i++
        }
        println("Результат: $res")
    } else {
        println("Ошибка! |x| должен быть больше 1!")
    }
}
