package rotateArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        nums = rotateArray(nums, k);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static int[] rotateArray(int[] nums, int k){
        int[] tempArr = new int[nums.length];
        int firstPart = k % nums.length;
        if(firstPart == 0){
            return nums;
        }
        int count = 0;
        for(int i = 0; i < firstPart; i++){
            tempArr[i] = nums[nums.length - firstPart + count];
            count++;
        }
        for(int i = 0; i < nums.length - firstPart; i++){
            tempArr[count] = nums[i];
            count++;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = tempArr[i];
        }
        return nums;
    }
}
