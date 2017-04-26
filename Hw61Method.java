


public class Hw61Method {
	public static int sum(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
    public static int sum(int milk, int honey){
        return milk + honey;
    }
    public static double sum(double milk, double honey){
        return milk+honey;
    }
    public static double avg(double a, double b){
        return (a+b)/2;
    }
    public static double avg(int [] nums) {

        double average=0.0;

        int sum = sum(nums);

        average = sum/nums.length;

        return average;
    }
    public static double product(double a, double b) {

        return a * b;
    }
    public static double product(int [] nums) {

        double prod = 1;

        for(int i=0; i<nums.length; i++) {

            prod*=nums[i];
        }
        return prod;
    }
    }