package common_prefix

//https://leetcode.com/problems/longest-common-prefix/
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
        println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
        println(longestCommonPrefix(arrayOf("ahmed", "sahm", "wassbah")))
    }
}
/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
 **/