package merge_sorted_array

object Arrays {
    //https://leetcode.com/problems/merge-sorted-array/
    private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if ((m + n) <= 0) throw IllegalStateException()

        var pointer1 = m - 1
        var pointer2 = n - 1
        var position = (m + n) - 1

        while (pointer2 >= 0) {
            if (pointer1 >= 0 && nums1[pointer1] > nums2[pointer2])
                nums1[position--] = nums1[pointer1--]
            else
                nums1[position--] = nums2[pointer2--]
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        val num1 = IntArray(6) { 0 }
        num1[0] = 1
        num1[1] = 2
        num1[2] = 3

        val num2 = IntArray(3)
        num2[0] = 2
        num2[1] = 5
        num2[2] = 6

        merge(num1, 3, num2, 3)

        print(num1.contentToString())
    }
}