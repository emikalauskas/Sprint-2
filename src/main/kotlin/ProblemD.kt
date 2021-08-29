class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val t = readInt()
        var max = 0L
        for (i in 1..t) {
            val n = readInt()
            var list = readListLong().sortedDescending()
            for (j in 0 until n) {
                if (list[j] + list[j] * j > max)
                    max = list[j] + list[j] * j
            }
            println(max)
            max = 0L
        }
    }

}