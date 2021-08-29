class
ProblemB {

    fun main() {

        //ваша реализация в методе main
        val t = readInt()
        var string = ""
        for (i in 1..t) {
            val list = readListInt()
            for (j in 0 until list[0]) {
                string += 'a' + (j % list[1])
            }
            println(string)
            string = ""
        }
    }

}