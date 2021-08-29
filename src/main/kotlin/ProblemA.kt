class ProblemA {

    fun main() {

        //ваша реализация в методе main
        val t = readInt()
        var position = 0L
        for (i in 1..t) {
            val list = readListInt()
            for (j in 1..list[2]) {
                if (j % 2 == 0)
                    position -= list[1] //влево
                else
                    position += list[0] //вправо
            }
            println(position)
            position = 0L
        }

    }
}