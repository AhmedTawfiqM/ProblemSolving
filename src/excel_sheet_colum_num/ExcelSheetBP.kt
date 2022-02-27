package excel_sheet_colum_num

import java.lang.UnsupportedOperationException

//https://leetcode.com/problems/excel-sheet-column-number/
object ExcelSheetBP {
    private const val totalCharsNums = 26
    private const val plussedNumber = 1
    private const val aChar = 'A'
    private const val maximumLength = 7

    private fun titleToNumber(columnTitle: String): Int {
        if (columnTitle.isEmpty())
            throw IndexOutOfBoundsException()
        if (columnTitle.length > maximumLength)
            throw IndexOutOfBoundsException()

        var result = 0  //result*26 + (ASSCi Code)
        for (char in columnTitle) {
            if (char.isLowerCase())
                throw UnsupportedOperationException()
            result *= totalCharsNums
            result += computeAssciCode(char) + plussedNumber
        }
        return result
    }

    private fun computeAssciCode(char: Char): Int {
        return char - aChar
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(titleToNumber("ACB"))
    }
}