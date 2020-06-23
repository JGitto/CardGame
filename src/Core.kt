fun main() {

    val lambda = { peter: String, Johnny: Int ->
        if (true) 5 else 3
        val r = 99
        r
    }

    println(lambda("g",3))

    for (i in 0 .. 5) {
        println(i)
    }

    val arr = Array(20) { i -> if (i % 2 == 0) i else 0 }

    println(arr.contentToString())
}