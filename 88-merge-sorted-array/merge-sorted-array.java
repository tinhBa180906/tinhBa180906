class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
           int[] result = new int[m + n];
        int i = 0, j = 0;
        int k = 0;
        while (i != m && j != n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i != m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        while (j != n) {
            result[k] = nums2[j];
            j++;
            k++;
        }
        System.arraycopy(result, 0, nums1, 0, m + n);
    }
}