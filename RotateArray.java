// This solution uses a recursive approach of shifting each element by k indices. While we replace we hold that specific integer in a temp varialble
// When we move to the next index that we actually moved, we use the same temp to replace at that point and grab the new element
// We could occasinally reach to same index without shifting all the elements. At that time, we move based on % size to offset the out of bounds.
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int i = 0, j = i, count = nums.length; 
        while(count>0) {

            int temp = nums[i], temp2 = nums[i];
            do {
                int index = (i+k)%(nums.length);
                temp2 = nums[index];
                nums[index] = temp;
                temp=temp2;
                i=index;
                count--;
            } while(i!=j && count>0);

            j++;
            i=j;
        }
    }
}
