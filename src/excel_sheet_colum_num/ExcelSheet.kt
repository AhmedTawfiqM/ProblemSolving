package excel_sheet_colum_num

//https://leetcode.com/problems/excel-sheet-column-number/
object ExcelSheet {

    private fun titleToNumber(columnTitle: String): Int {
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
/*
Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701


Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
 */