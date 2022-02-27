package excel_sheet_colum_num

import java.lang.UnsupportedOperationException

//https://leetcode.com/problems/excel-sheet-column-number/
object ExcelSheetBP {
    private const val TotalCharsNums = 26
    private const val AChar = 'A'

    private fun titleToNumber(columnTitle: String): Int {
        if (columnTitle.isEmpty()) throw IndexOutOfBoundsException()
        if (columnTitle.length > 7) throw IndexOutOfBoundsException()

        var result = 0  //result*26 + (ASSCi Code)
        for (char in columnTitle) {
            if (char.isLowerCase()) throw UnsupportedOperationException()
            result *= TotalCharsNums
            result += computeAssciCode(char) + 1
        }
        return result
    }

    private fun computeAssciCode(char: Char): Int {
        return char - AChar
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(titleToNumber("AaB"))
    }
}