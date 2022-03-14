package common_prefix

object CommonPrefix {

    private fun longestCommonPrefix(list: Array<String>): String {
        if (list.isEmpty()) return ""
        var prefix = list[0]

        list.forEach {
            while (it.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
            }
        }
        return prefix
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        println(longestCommonPrefix(arrayOf("dog","racecar","car")))
    }
}