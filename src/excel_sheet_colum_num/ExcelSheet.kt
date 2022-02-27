package excel_sheet_colum_num

//https://leetcode.com/problems/excel-sheet-column-number/
object ExcelSheet {

    private fun titleToNumber(columnTitle: String): Int {
        if (columnTitle.isEmpty()) throw IndexOutOfBoundsException()
        if (columnTitle.length > 7) throw IndexOutOfBoundsException()

        var result = 0  //result*26 + (ASSCi Code)
        for (char in columnTitle)
            result = (result * 26) + (char - 'A') + 1
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(titleToNumber("AB"))
    }
}