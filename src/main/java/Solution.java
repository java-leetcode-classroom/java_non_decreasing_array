public class Solution {
  public boolean checkPossibility(int[] nums) {
    int nLen = nums.length;
    int count = 0;
    for (int pos = 1; pos < nLen; pos++) {
      if (nums[pos-1] > nums[pos]) {
        if (pos >=2  && nums[pos-2] > nums[pos]) {
          nums[pos] = nums[pos-1];
        }
        count++;
        if (count >= 2) {
          return false;
        }
      }
    }
    return true;
  }
}
