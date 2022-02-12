package pascale_triangle

/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers
directly above it.

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]
 */
object App {

    @JvmStatic
    fun main(args: Array<String>) {
        val result1 = PascalTriangle.generate(12)
//        val result2 = PascalTriangleByNCR.generate(5)
        printArray(result1)
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
            print(arr[i].contentToString() + ",")
    }
}