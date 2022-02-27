package excel_sheet_colum_num

//https://leetcode.com/problems/excel-sheet-column-number/
object ExcelSheet {

    private fun titleToNumber(columnTitle: String): Int {
        var result = 0  //result*26 + Char Decimal
        for (char in columnTitle)
            result = result * 26 + (char - 'A' + 1)
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(titleToNumber("BA"))
    }
}