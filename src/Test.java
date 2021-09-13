public class Test {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
