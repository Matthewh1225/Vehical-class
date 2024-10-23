import java.util.Arrays;

class Cows{
    public int[] sorting(int[] nums){
        for(int j=0;j<nums.length;j++)
            for (int i = 0;i<nums.length-1;i++){
                if (nums[i]  > nums[i+1]){
                    int temp = nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]= temp;
                }
            }
                return nums;  
    }
    public int [] selectionSort(int[] nums){
        int length=nums.length;

        
        int p1=1;
        for(int j=0;j<nums.length;j++){
            for (int i = 0;i<nums.length-1;i++){
            int lowest;
            if (nums[p1] < nums[0]){
                lowest=nums[p1];
                p1++;
            }
            else{
                p1++;
            }
            }
        }
        return nums;
        
    




    }
    public static void main(String[] args) {
        int [] nums = new int[]{4,5,1,2,3,};
        Cows c = new Cows();
        System.out.println(Arrays.toString(c.selectionSort(nums)));
      
        System.out.println(Arrays.toString(c.sorting(nums)));
        
    }

}
    
