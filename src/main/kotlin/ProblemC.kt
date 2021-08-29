class ProblemC {

    fun main() {

        //ваша реализация в методе main
        var sum = 0
        val n = readInt()
        val array = readIntArray(n)
        array.sort()
        for (i in 0 until (n/2)) {
            sum += array[i * 2 + 1] - array[i * 2]
        }
        println(sum)
    }

}