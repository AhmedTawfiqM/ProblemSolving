package merge_sorted_array

object Arrays {
    //https://leetcode.com/problems/merge-sorted-array/
    private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if ((m + n) <= 0) throw IllegalStateException()
        if (nums1.size != (m + n)) throw IndexOutOfBoundsException()
        if (nums2.size != n) throw IndexOutOfBoundsException()

        var pointer1 = m - 1
        var pointer2 = n - 1
        var position = (m + n) - 1

        while (pointer2 >= 0) {  //Time Complexity: O(n)
            if (pointer1 >= 0 && nums1[pointer1] > nums2[pointer2])
                nums1[position--] = nums1[pointer1--]
            else
                nums1[position--] = nums2[pointer2--]
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        val num1 = intArrayOf(6, 7, 8, 9, 0, 0, 0, 0, 0)
        merge(num1, 4, intArrayOf(1, 2, 3, 4, 5), 5)
        println(num1.contentToString())

        val numX = intArrayOf(0)
        merge(numX, 0, intArrayOf(1), 1)
        println(numX.contentToString())
    }
}