package pascale_triangle

object PascalTriangle {

    fun generate(numRows: Int): List<Array<Int>> {
        if (numRows == 0) throw IllegalStateException()
        val rows = arrayListOf<Array<Int>>()

        for (currentItem in 1..numRows) {
            if (currentItem == 1) {
                rows.add(arrayOf(1))
                continue
            }
            if (currentItem == 2) {
                rows.add(arrayOf(1, 1))
                continue
            }

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