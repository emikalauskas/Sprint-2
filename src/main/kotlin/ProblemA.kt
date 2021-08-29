class ProblemA {

    fun main() {

        //ваша реализация в методе main
        val t = readInt()
        var position = 0L
        for (i in 0 until t) {
            val list = readListInt()
            for (j in 0 until list[2]) {
                if (j % 2 == 1)
                    position -= list[1]
                else
                    position += list[0]
            }
            println(position)
            position = 0L
        }

    }
}