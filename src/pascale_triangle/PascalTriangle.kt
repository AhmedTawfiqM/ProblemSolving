package pascale_triangle

/*
    https://leetcode.com/problems/pascals-triangle/

 */
object PascalTriangle {

    fun generate(numRows: Int): List<Array<Int>> {
        if (numRows == 0) throw IllegalStateException()
        val rows = arrayListOf<Array<Int>>()
        rows.add(arrayOf(1))

        for (currentItem in 2..numRows) {

            val lastRow = rows[currentItem - 2]
            val currentRow = Array(currentItem) { 1 }

            for (item in 1..currentItem) {
                if (item == 1 || item == currentRow.size) {
                    currentRow[item - 1] = 1
                    continue
                }
                val sum = lastRow[item - 1] + lastRow[item - 2]
                currentRow[item - 1] = sum
            }

            rows.add(currentRow)
        }

        return rows
    }

}