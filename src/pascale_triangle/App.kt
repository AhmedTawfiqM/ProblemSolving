package pascale_triangle

object App {

    @JvmStatic
    fun main(args: Array<String>) {
        val result1 = PascalTriangle.generate(5)
//        val result2 = PascalTriangleByNCR.generate(5)
        //printArray(result1)
        drawTriangle(result1)
    }

    private fun drawTriangle(arr: List<Array<Int>>) {
        for (i in arr.indices) {
            for (j in 0 until arr.size - i)
                print(" ")

            val row = arr[i].contentToString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
            println(row)
        }
    }

    private fun printArray(arr: List<Array<Int>>) {
        for (i in arr.indices)
            println(arr[i].contentToString())
    }
}