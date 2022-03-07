package palindrome_int

object PalindRomeInt {

    private fun isPalindrome(input: Int): Boolean { //121
        if (input < 0 || input == Int.MAX_VALUE) return false

        var original = input
        var reversed = 0

        while (original != 0) {
            reversed += original % 10

            original /= 10
        }
        return input == reversed
    }

    private fun isPalindrome1(input: Int) =
        input.toString() == input.toString().reversed()

    @JvmStatic
    fun main(args: Array<String>) {
        println(isPalindrome(121))
        println(isPalindrome1(121))
    }
}