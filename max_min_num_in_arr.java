public class max_min_num_in_arr {
    public static void main(String[] args) {
        int[] array = { 6, 7, 8, 9, 10 };
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Max number is : " + max);
        System.out.println("Min number is : " + min);
    }
}
