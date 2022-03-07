package palindrome_int

//https://leetcode.com/problems/palindrome-number
object PalindRomeString {

    private fun isPalindrome(input: Int): Boolean {
        if (input < 0 || input >= Int.MAX_VALUE) return false
        if (input in 0..9) return true

        val original = input.toString()
        original.forEachIndexed { index, num ->
            if (num != original[original.length - (index+1)])
                return false
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(isPalindrome(121))
        println(isPalindrome(-121))
        println(isPalindrome(10))
    }
}
/**
 * Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
 **/