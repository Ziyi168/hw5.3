public class Hw61Sort {

    
    public static void sort(int [] nums) {
        int [] sortedList=null;

        //loop thru the size of the list
        for(int i=0; i<nums.length-1; i++) {
            //move the lowest value to the first of the list
            int small = nums[i];
            int idxSmall = i;
            for(int j=i+1; j<nums.length; j++) {
                if(small>nums[j]) {
                   small = nums[j];
                   idxSmall = j;
                }
            }
            swap(i,idxSmall,nums);
        }
    }
    private static void swap(int idxSmall, int j, int [] nums) {
        int temp = nums[idxSmall];
        nums[idxSmall] = nums[j];
        nums[j] = temp;
    }
    public static int product(int a, int b) {
        return a * b;
    }
    public static int factorial(int a){
       int result = 1;
      while (a>=1){
          result=a*result;
          a--;
      }
      return result;
    }
}