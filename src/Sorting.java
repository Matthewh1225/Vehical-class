import java.util.Arrays;

class Cows{

    public int[] sorting(int[] nums){
        while(nums[0]>nums[1])
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i] > nums[i+1]){

                int temp = nums[i+1];
                nums[i+1]=nums[i];
                nums[i]= temp;
            }

        }
        return nums;

    }
    public static void main(String[] args) {
        int [] nums = new int[]{9,3,5,4,6,1,8,2,7,4,10,11,12};
        Cows c = new Cows();
        System.out.println(Arrays.toString(c.sorting(nums)));
        
    }

}
    
