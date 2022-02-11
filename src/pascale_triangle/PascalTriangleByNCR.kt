package pascale_triangle

//TODO: it don't work with numbers like 15
object PascalTriangleByNCR {

    fun generate(numRows: Int): List<Array<Int>> {
        if (numRows == 0) throw IllegalStateException()
        val rows = arrayListOf<Array<Int>>()
        var tmp: Int

        for (i in 0 until numRows) {
            drawSpace(numRows - i)
            val currentRow = Array(i + 1) { 1 }

            for (j in 0..i) {
                tmp = factorial(i) /
                        (factorial(i - j) * factorial(j))
                currentRow[j] = tmp

                print(" $tmp")
            }
            println()

            rows.add(currentRow)
        }

        return rows
    }

    private fun factorial(num: Int): Int {
        if (num == 0)
            return 1
        return num * factorial(num - 1)
    }

    private fun drawSpace(size: Int) {
        for (i in 0 until size)
            print(" ")
    }
}