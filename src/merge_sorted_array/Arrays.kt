package merge_sorted_array

object Arrays {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        //After Merge
        if (nums1.size != (m + n)) throw IllegalStateException()

        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        val pointer1 = m - 1
        val pointer2 = n - 1
        val position = (m + n) - 1

        while (pointer1 <= 0) {
            if (nums1[pointer1] <= nums2[pointer2]) {
                nums1[position] = nums2[pointer2]
            } else {
                nums1[position] = nums1[pointer1]
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        //merge()
    }
}